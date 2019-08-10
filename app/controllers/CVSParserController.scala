package controllers

import javax.inject.{Inject, Singleton}
import play.api.mvc.{AbstractController, Action, AnyContent, ControllerComponents}

@Singleton
class CVSParserController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {


  /**
   * 'http://localhost:9000/add/n1/to/n2'
   * sum two numbers
   */
  def parseCVSAsApplicationFormUrlEncoded: Action[AnyContent] = Action {
    request => {
      var listHeaders: List[String] = List("aa");

      var headers = List.newBuilder[String]
      request.body.asFormUrlEncoded.map(a => {


        println(headers)
        a
      })
      Ok("welcome")
    }
  }

}
