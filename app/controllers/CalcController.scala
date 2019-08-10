package controllers

import javax.inject.{Inject, Singleton}
import play.api.mvc.{AbstractController, Action, AnyContent, ControllerComponents}

@Singleton
class CalcController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  /**
   * 'http://localhost:9000/add/n1/to/n2'
   * sum two numbers
   */
  def add(n1: Double, n2: Double): Action[AnyContent] = Action {
    var result = n1 + n2;
    Ok(s"$result")
  }

  /**
   * cobine two booleans
   *
   * @param b1
   * @param b2
   * @return
   */
  def combine(b1: Boolean, b2: Boolean) = Action {
    val result = b1 & b2;
     Ok(s"$result")
  }


  /**
   * concat three strings
   */
  def concat(s1: String, s2: String, s3: String) = Action {

    val result = s"$s1 $s2 $s3";
    Ok(result)
  }

  /*
  Accept list as a parameter with repeated queryParam num
   */
  def sort(num: List[Int]) = Action {
    var t = num.sorted
    Ok(t.mkString)
  }

}
