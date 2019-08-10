package service

import java.util.UUID

import model.request.LoginRequest
import model.response._

object AuthenticationService {

  val usersPasswordsMap = Map("mahmoud" -> "password")
  var sessions = Map[String, String]()


  def login(loginRequest: LoginRequest): LoginResponse = {
      
     
    usersPasswordsMap.get(loginRequest.userName) match {
      case Some(password) if password == loginRequest.password =>
        val sessionId = generateSessionId
        sessions += (sessionId -> loginRequest.userName)
        LoginSuccess(sessionId)

      case Some(_) => InvalidPassword(loginRequest.userName)
      case None => UserNameNotFound(loginRequest.userName)
    }

  }


  def generateSessionId: String = UUID.randomUUID.toString
 
  def whoAmI(sessionId: String): WhoAmIResponse = {
    sessions.get(sessionId) match {
      case Some(userName) => Credentials(sessionId, userName)
      case None => SessionNotFound(sessionId)
    }
  }


}
