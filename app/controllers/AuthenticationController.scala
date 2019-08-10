package controllers

import javax.inject.{Inject, Singleton}
import model.request.LoginRequest
import model.response.{Credentials, LoginSuccess, SessionNotFound}
import play.api.mvc._
import service.AuthenticationService
import com.google.gson.Gson;

@Singleton
class AuthenticationController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {


  val SESSION_COOKIE_NAME: String = "sessionId"

  def login(userName: String, password: String) = Action { implicit request => {

    AuthenticationService.login(LoginRequest(userName, password)) match {
      case res: LoginSuccess => Ok("success").withCookies(Cookie(SESSION_COOKIE_NAME, value = res.sessionId))
      case _ => BadRequest("Invalid username or password")
    }

  }
  }


  def index = Action { implicit request => {
     
    val afterLoginFunction = (userName: String) => Ok(s"welcome ya $userName")
    withAuthenticationUser(request)(afterLoginFunction)
  }
  }


  def withAuthenticationUser(request: Request[AnyContent])(func: (String) => Result): Result = {

    extractSessionIdCookie(request).map(_.value) match {
      case Some(sessionId) => {
        AuthenticationService.whoAmI(sessionId) match {
          case Credentials(_, userName) => func(userName)
          case SessionNotFound(sessionId) => badRequestPleaseLogin
        }
      }
      case None => badRequestPleaseLogin
    }
  }


  def whoAmI: Action[AnyContent] = Action {
    implicit request => {

      extractSessionIdCookie(request).map(_.value) match {
        case Some(sessionId) => {
          AuthenticationService.whoAmI(sessionId) match {
            case Credentials(sessionId, userName) => Ok(s" welcome $userName your session id is $sessionId")
            case _ => badRequestPleaseLogin
          }
        }
        case None => badRequestPleaseLogin
      }
    }
  }


  def badRequestPleaseLogin: Result = BadRequest("Please Login")


  def extractSessionIdCookie(implicit request: Request[AnyContent]) = request.cookies.get(SESSION_COOKIE_NAME)
}
