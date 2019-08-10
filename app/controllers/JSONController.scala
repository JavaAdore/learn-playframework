package controllers

import com.google.gson.Gson
import javax.inject.{Inject, Singleton}
import play.api.libs.json.{JsResult, Json, Reads}
import play.api.mvc.{AbstractController, Action, AnyContent, ControllerComponents}

@Singleton
class JSONController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {


  def testJsonRequest: Action[AnyContent] = Action { implicit request => {
    request.body.asJson match {
      case Some(js) => Ok(js)
      case None => BadRequest("their is no json body")
    }


  }
  }

  // force provided input to be json

  // if no json provided bad request will be returned
  def testForcedJson = Action(parse.json) {
    implicit request => {
      Ok(request.body)
    }
  }


  def testWithJsonResponse = Action { implicit request => {



    val mahmoud = Employee("Mahmoud", 20000)
    var gson = new Gson();
   val result =  gson.toJson(mahmoud)
     Ok(result).as("application/json")
  }

  }
  case class Employee(name: String, age: Double);


  def readJson = Action(parse.json)
  {
    implicit request =>{
      // define json reader
      implicit val employeeRead =  Json.reads[Employee]

      // read it
      var  emp :JsResult[Employee] =   employeeRead.reads(request.body);

      // map it
      emp.map( println(_))
      Ok(request.body)

    }
  }

}