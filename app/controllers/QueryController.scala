package controllers

import javax.inject.{Inject, Singleton}
import play.api.mvc._

@Singleton
class QueryController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  // sending path param could contains forward slash
  def test(a: String, b: String) = Action {
    Ok(s"$a $b")
  }


  def queryParamExample(name: Option[String], age: Option[Double]) = Action {


    Ok(s"welcome ${name.getOrElse("undefined")} your age is ${age.getOrElse(0)}")
  }


  def generateUrl = Action {
    Ok("welcome")
  }


  def parseRequest = Action { implicit request => {

    val headers: Headers = request.headers

    val cookies: Cookies = request.cookies;

    val queryParams: Map[String, Seq[String]] = request.queryString
    var myParamValue = queryParams.get("myParam").map(_.mkString)


    var result = Map(
      "cookies" -> cookies.map(c => s"$c.name $c.value").mkString,
      "-" -> "-",
      "myParam" -> myParamValue
    ).mkString

    Ok(result)
  }
  }


  def withHeaders: Action[AnyContent] = Action {

    Ok("this is the result, check headers").withHeaders("headerParamName" -> "Header Param Value")
  }

  def withCookies: Action[AnyContent] = Action { implicit request => {
    Ok("this is the result, check cookies").withCookies(new Cookie(name = "myAwesomeCookieName", value = "myAwesomecookievalue"))
  }
  }

}
