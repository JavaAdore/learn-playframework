package controllers

import javax.inject.{Inject, Singleton}
import org.joda.time.{DateTime, DateTimeZone}
import play.api.mvc.{AbstractController, Action, AnyContent, ControllerComponents}

@Singleton
class TimerController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  val TIME_FORMAT: String = "hh:mm a"

  /**
   * should return the current time of server
   */

  def time: Action[AnyContent] = Action { implicit Request => {

    var dateTime = new DateTime();
    var timeAsString = dateTime.toString(TIME_FORMAT)
    Ok(timeAsString)

  }

  }


  /*
  should return
  curl -v 'http://localhost:9000/time/zones'
  # HTTP headers...
  Africa/Abidjan
  Africa/Accra
  Africa/Addis_Ababa
   */
  def zones: Action[AnyContent] = Action { implicit request => {

    var stringBuilder = new StringBuilder();
    DateTimeZone.getAvailableIDs.forEach(availableId => {
      stringBuilder.append(s"$availableId \n")
    })

    Ok(stringBuilder.toString)

  }


  }


  def timeForZone(zoneId: String): Action[AnyContent] = Action { implicit request => {

    if (null != zoneId) {
      try {
        DateTimeZone.forID(zoneId)
        var dateTimeZone = DateTimeZone.forID(zoneId)
        var timeForProvidedZone: String = DateTime.now(dateTimeZone).toString(TIME_FORMAT)
        Ok(timeForProvidedZone)

      } catch {
        case _: Throwable =>
          BadRequest("invalid zone id")
      }
    } else {
      BadRequest("Please provide zone id")
    }

  }


  }

}
