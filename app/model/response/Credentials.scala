package model.response

case class Credentials(sessionId: String, userName: String) extends WhoAmIResponse
