package controllers

import org.joda.time.DateTime

import scala.concurrent.duration.Duration
import scala.concurrent.{Await, ExecutionContext, Future}
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.{Await, Future}
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global
object TheFuture extends App{


  def getTraffic(hostname: String): Future[Double] = {

    println(s"executing $hostname")
    Future {
    sleep(5000)

      println(s"executing result $hostname")
      1 + 1
    }
  }


  def sleep(time: Long) { Thread.sleep(time) }

  /*
  var a = getTraffic("server1")
  var b = getTraffic("server2")
  var c = getTraffic("server3")
 */

  /*
  var res =   for{
      a1 <- getTraffic("server1")
      b1 <- getTraffic("server2")
      c1 <- getTraffic("server3")
    }yield a1+b1+c1
*/

  var total = 

/*
  var res =   for{
    a1 <- a
    b1 <- b
    c1 <- c
  }yield a1+b1+c1
*/
var start = DateTime.now;
res.onComplete(a =>   println(  (start.getMillis - DateTime.now.getMillis) / 1000))

  scala.io.StdIn.readLine()

}
