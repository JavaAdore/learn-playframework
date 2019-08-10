
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/ORCL/Desktop/learn-playframework/conf/routes
// @DATE:Sat Aug 10 22:34:10 EET 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  HomeController_2: controllers.HomeController,
  // @LINE:10
  Assets_5: controllers.Assets,
  // @LINE:13
  TimerController_1: controllers.TimerController,
  // @LINE:23
  QueryController_3: controllers.QueryController,
  // @LINE:27
  CalcController_4: controllers.CalcController,
  // @LINE:48
  CVSParserController_7: controllers.CVSParserController,
  // @LINE:52
  AuthenticationController_6: controllers.AuthenticationController,
  // @LINE:60
  JSONController_0: controllers.JSONController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    HomeController_2: controllers.HomeController,
    // @LINE:10
    Assets_5: controllers.Assets,
    // @LINE:13
    TimerController_1: controllers.TimerController,
    // @LINE:23
    QueryController_3: controllers.QueryController,
    // @LINE:27
    CalcController_4: controllers.CalcController,
    // @LINE:48
    CVSParserController_7: controllers.CVSParserController,
    // @LINE:52
    AuthenticationController_6: controllers.AuthenticationController,
    // @LINE:60
    JSONController_0: controllers.JSONController
  ) = this(errorHandler, HomeController_2, Assets_5, TimerController_1, QueryController_3, CalcController_4, CVSParserController_7, AuthenticationController_6, JSONController_0, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_2, Assets_5, TimerController_1, QueryController_3, CalcController_4, CVSParserController_7, AuthenticationController_6, JSONController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """time""", """controllers.TimerController.time"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """time/zones""", """controllers.TimerController.zones"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """time/""" + "$" + """zone<.+>""", """controllers.TimerController.timeForZone(zone:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """test/queryParam""", """controllers.QueryController.queryParamExample(name:Option[String], age:Option[Double])"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """add/""" + "$" + """n1<[^/]+>/to/""" + "$" + """n2<[^/]+>""", """controllers.CalcController.add(n1:Double, n2:Double)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """and/""" + "$" + """b1<[^/]+>/with/""" + "$" + """b2<[^/]+>""", """controllers.CalcController.combine(b1:Boolean, b2:Boolean)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """concat/""" + "$" + """s1<[^/]+>/""" + "$" + """s2<[^/]+>/""" + "$" + """s3<[^/]+>""", """controllers.CalcController.concat(s1:String, s2:String, s3:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sort""", """controllers.CalcController.sort(num:List[Int])"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """test/""" + "$" + """a<.+>/test/""" + "$" + """b<.+>""", """controllers.QueryController.test(a:String, b:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """parseRequest""", """controllers.QueryController.parseRequest"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """withHeaders""", """controllers.QueryController.withHeaders"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """withCookies""", """controllers.QueryController.withCookies"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """parseCVSAsApplicationFormUrlEncoded""", """controllers.CVSParserController.parseCVSAsApplicationFormUrlEncoded"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.AuthenticationController.login(userName:String, password:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """whoAmI""", """controllers.AuthenticationController.whoAmI"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """index""", """controllers.AuthenticationController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """testJsonBodyRequest""", """controllers.JSONController.testJsonRequest"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """testForcedJson""", """controllers.JSONController.testForcedJson"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_2.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Assets_versioned1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned1_invoker = createInvoker(
    Assets_5.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_TimerController_time2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("time")))
  )
  private[this] lazy val controllers_TimerController_time2_invoker = createInvoker(
    TimerController_1.time,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TimerController",
      "time",
      Nil,
      "GET",
      this.prefix + """time""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_TimerController_zones3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("time/zones")))
  )
  private[this] lazy val controllers_TimerController_zones3_invoker = createInvoker(
    TimerController_1.zones,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TimerController",
      "zones",
      Nil,
      "GET",
      this.prefix + """time/zones""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_TimerController_timeForZone4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("time/"), DynamicPart("zone", """.+""",false)))
  )
  private[this] lazy val controllers_TimerController_timeForZone4_invoker = createInvoker(
    TimerController_1.timeForZone(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TimerController",
      "timeForZone",
      Seq(classOf[String]),
      "GET",
      this.prefix + """time/""" + "$" + """zone<.+>""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_QueryController_queryParamExample5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("test/queryParam")))
  )
  private[this] lazy val controllers_QueryController_queryParamExample5_invoker = createInvoker(
    QueryController_3.queryParamExample(fakeValue[Option[String]], fakeValue[Option[Double]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.QueryController",
      "queryParamExample",
      Seq(classOf[Option[String]], classOf[Option[Double]]),
      "GET",
      this.prefix + """test/queryParam""",
      """ query param example""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_CalcController_add6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("add/"), DynamicPart("n1", """[^/]+""",true), StaticPart("/to/"), DynamicPart("n2", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CalcController_add6_invoker = createInvoker(
    CalcController_4.add(fakeValue[Double], fakeValue[Double]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CalcController",
      "add",
      Seq(classOf[Double], classOf[Double]),
      "GET",
      this.prefix + """add/""" + "$" + """n1<[^/]+>/to/""" + "$" + """n2<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_CalcController_combine7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("and/"), DynamicPart("b1", """[^/]+""",true), StaticPart("/with/"), DynamicPart("b2", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CalcController_combine7_invoker = createInvoker(
    CalcController_4.combine(fakeValue[Boolean], fakeValue[Boolean]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CalcController",
      "combine",
      Seq(classOf[Boolean], classOf[Boolean]),
      "GET",
      this.prefix + """and/""" + "$" + """b1<[^/]+>/with/""" + "$" + """b2<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_CalcController_concat8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("concat/"), DynamicPart("s1", """[^/]+""",true), StaticPart("/"), DynamicPart("s2", """[^/]+""",true), StaticPart("/"), DynamicPart("s3", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CalcController_concat8_invoker = createInvoker(
    CalcController_4.concat(fakeValue[String], fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CalcController",
      "concat",
      Seq(classOf[String], classOf[String], classOf[String]),
      "GET",
      this.prefix + """concat/""" + "$" + """s1<[^/]+>/""" + "$" + """s2<[^/]+>/""" + "$" + """s3<[^/]+>""",
      """ take multiple query params""",
      Seq()
    )
  )

  // @LINE:35
  private[this] lazy val controllers_CalcController_sort9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sort")))
  )
  private[this] lazy val controllers_CalcController_sort9_invoker = createInvoker(
    CalcController_4.sort(fakeValue[List[Int]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CalcController",
      "sort",
      Seq(classOf[List[Int]]),
      "GET",
      this.prefix + """sort""",
      """  Accept list as a parameter with repeated queryParam num""",
      Seq()
    )
  )

  // @LINE:38
  private[this] lazy val controllers_QueryController_test10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("test/"), DynamicPart("a", """.+""",false), StaticPart("/test/"), DynamicPart("b", """.+""",false)))
  )
  private[this] lazy val controllers_QueryController_test10_invoker = createInvoker(
    QueryController_3.test(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.QueryController",
      "test",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """test/""" + "$" + """a<.+>/test/""" + "$" + """b<.+>""",
      """path param could contains forward slash *""",
      Seq()
    )
  )

  // @LINE:42
  private[this] lazy val controllers_QueryController_parseRequest11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("parseRequest")))
  )
  private[this] lazy val controllers_QueryController_parseRequest11_invoker = createInvoker(
    QueryController_3.parseRequest,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.QueryController",
      "parseRequest",
      Nil,
      "GET",
      this.prefix + """parseRequest""",
      """get components of the request""",
      Seq()
    )
  )

  // @LINE:44
  private[this] lazy val controllers_QueryController_withHeaders12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("withHeaders")))
  )
  private[this] lazy val controllers_QueryController_withHeaders12_invoker = createInvoker(
    QueryController_3.withHeaders,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.QueryController",
      "withHeaders",
      Nil,
      "GET",
      this.prefix + """withHeaders""",
      """""",
      Seq()
    )
  )

  // @LINE:46
  private[this] lazy val controllers_QueryController_withCookies13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("withCookies")))
  )
  private[this] lazy val controllers_QueryController_withCookies13_invoker = createInvoker(
    QueryController_3.withCookies,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.QueryController",
      "withCookies",
      Nil,
      "GET",
      this.prefix + """withCookies""",
      """""",
      Seq()
    )
  )

  // @LINE:48
  private[this] lazy val controllers_CVSParserController_parseCVSAsApplicationFormUrlEncoded14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("parseCVSAsApplicationFormUrlEncoded")))
  )
  private[this] lazy val controllers_CVSParserController_parseCVSAsApplicationFormUrlEncoded14_invoker = createInvoker(
    CVSParserController_7.parseCVSAsApplicationFormUrlEncoded,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CVSParserController",
      "parseCVSAsApplicationFormUrlEncoded",
      Nil,
      "POST",
      this.prefix + """parseCVSAsApplicationFormUrlEncoded""",
      """""",
      Seq()
    )
  )

  // @LINE:52
  private[this] lazy val controllers_AuthenticationController_login15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_AuthenticationController_login15_invoker = createInvoker(
    AuthenticationController_6.login(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthenticationController",
      "login",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """login""",
      """ login should not be GET . but just for test""",
      Seq()
    )
  )

  // @LINE:54
  private[this] lazy val controllers_AuthenticationController_whoAmI16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("whoAmI")))
  )
  private[this] lazy val controllers_AuthenticationController_whoAmI16_invoker = createInvoker(
    AuthenticationController_6.whoAmI,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthenticationController",
      "whoAmI",
      Nil,
      "GET",
      this.prefix + """whoAmI""",
      """""",
      Seq()
    )
  )

  // @LINE:56
  private[this] lazy val controllers_AuthenticationController_index17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("index")))
  )
  private[this] lazy val controllers_AuthenticationController_index17_invoker = createInvoker(
    AuthenticationController_6.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthenticationController",
      "index",
      Nil,
      "GET",
      this.prefix + """index""",
      """""",
      Seq()
    )
  )

  // @LINE:60
  private[this] lazy val controllers_JSONController_testJsonRequest18_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("testJsonBodyRequest")))
  )
  private[this] lazy val controllers_JSONController_testJsonRequest18_invoker = createInvoker(
    JSONController_0.testJsonRequest,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.JSONController",
      "testJsonRequest",
      Nil,
      "POST",
      this.prefix + """testJsonBodyRequest""",
      """ just echo back the content of passed json""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:63
  private[this] lazy val controllers_JSONController_testForcedJson19_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("testForcedJson")))
  )
  private[this] lazy val controllers_JSONController_testForcedJson19_invoker = createInvoker(
    JSONController_0.testForcedJson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.JSONController",
      "testForcedJson",
      Nil,
      "POST",
      this.prefix + """testForcedJson""",
      """""",
      Seq("""nocsrf""")
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_2.index)
      }
  
    // @LINE:10
    case controllers_Assets_versioned1_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned1_invoker.call(Assets_5.versioned(path, file))
      }
  
    // @LINE:13
    case controllers_TimerController_time2_route(params) =>
      call { 
        controllers_TimerController_time2_invoker.call(TimerController_1.time)
      }
  
    // @LINE:15
    case controllers_TimerController_zones3_route(params) =>
      call { 
        controllers_TimerController_zones3_invoker.call(TimerController_1.zones)
      }
  
    // @LINE:16
    case controllers_TimerController_timeForZone4_route(params) =>
      call(params.fromPath[String]("zone", None)) { (zone) =>
        controllers_TimerController_timeForZone4_invoker.call(TimerController_1.timeForZone(zone))
      }
  
    // @LINE:23
    case controllers_QueryController_queryParamExample5_route(params) =>
      call(params.fromQuery[Option[String]]("name", None), params.fromQuery[Option[Double]]("age", None)) { (name, age) =>
        controllers_QueryController_queryParamExample5_invoker.call(QueryController_3.queryParamExample(name, age))
      }
  
    // @LINE:27
    case controllers_CalcController_add6_route(params) =>
      call(params.fromPath[Double]("n1", None), params.fromPath[Double]("n2", None)) { (n1, n2) =>
        controllers_CalcController_add6_invoker.call(CalcController_4.add(n1, n2))
      }
  
    // @LINE:29
    case controllers_CalcController_combine7_route(params) =>
      call(params.fromPath[Boolean]("b1", None), params.fromPath[Boolean]("b2", None)) { (b1, b2) =>
        controllers_CalcController_combine7_invoker.call(CalcController_4.combine(b1, b2))
      }
  
    // @LINE:32
    case controllers_CalcController_concat8_route(params) =>
      call(params.fromPath[String]("s1", None), params.fromPath[String]("s2", None), params.fromPath[String]("s3", None)) { (s1, s2, s3) =>
        controllers_CalcController_concat8_invoker.call(CalcController_4.concat(s1, s2, s3))
      }
  
    // @LINE:35
    case controllers_CalcController_sort9_route(params) =>
      call(params.fromQuery[List[Int]]("num", None)) { (num) =>
        controllers_CalcController_sort9_invoker.call(CalcController_4.sort(num))
      }
  
    // @LINE:38
    case controllers_QueryController_test10_route(params) =>
      call(params.fromPath[String]("a", None), params.fromPath[String]("b", None)) { (a, b) =>
        controllers_QueryController_test10_invoker.call(QueryController_3.test(a, b))
      }
  
    // @LINE:42
    case controllers_QueryController_parseRequest11_route(params) =>
      call { 
        controllers_QueryController_parseRequest11_invoker.call(QueryController_3.parseRequest)
      }
  
    // @LINE:44
    case controllers_QueryController_withHeaders12_route(params) =>
      call { 
        controllers_QueryController_withHeaders12_invoker.call(QueryController_3.withHeaders)
      }
  
    // @LINE:46
    case controllers_QueryController_withCookies13_route(params) =>
      call { 
        controllers_QueryController_withCookies13_invoker.call(QueryController_3.withCookies)
      }
  
    // @LINE:48
    case controllers_CVSParserController_parseCVSAsApplicationFormUrlEncoded14_route(params) =>
      call { 
        controllers_CVSParserController_parseCVSAsApplicationFormUrlEncoded14_invoker.call(CVSParserController_7.parseCVSAsApplicationFormUrlEncoded)
      }
  
    // @LINE:52
    case controllers_AuthenticationController_login15_route(params) =>
      call(params.fromQuery[String]("userName", None), params.fromQuery[String]("password", None)) { (userName, password) =>
        controllers_AuthenticationController_login15_invoker.call(AuthenticationController_6.login(userName, password))
      }
  
    // @LINE:54
    case controllers_AuthenticationController_whoAmI16_route(params) =>
      call { 
        controllers_AuthenticationController_whoAmI16_invoker.call(AuthenticationController_6.whoAmI)
      }
  
    // @LINE:56
    case controllers_AuthenticationController_index17_route(params) =>
      call { 
        controllers_AuthenticationController_index17_invoker.call(AuthenticationController_6.index)
      }
  
    // @LINE:60
    case controllers_JSONController_testJsonRequest18_route(params) =>
      call { 
        controllers_JSONController_testJsonRequest18_invoker.call(JSONController_0.testJsonRequest)
      }
  
    // @LINE:63
    case controllers_JSONController_testForcedJson19_route(params) =>
      call { 
        controllers_JSONController_testForcedJson19_invoker.call(JSONController_0.testForcedJson)
      }
  }
}
