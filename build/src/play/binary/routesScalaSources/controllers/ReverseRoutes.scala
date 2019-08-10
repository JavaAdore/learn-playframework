
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/ORCL/Desktop/learn-playframework/conf/routes
// @DATE:Sat Aug 10 22:34:10 EET 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers {

  // @LINE:10
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def versioned(file:Asset): Call = {
      implicit val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:48
  class ReverseCVSParserController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:48
    def parseCVSAsApplicationFormUrlEncoded(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "parseCVSAsApplicationFormUrlEncoded")
    }
  
  }

  // @LINE:27
  class ReverseCalcController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def combine(b1:Boolean, b2:Boolean): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "and/" + implicitly[play.api.mvc.PathBindable[Boolean]].unbind("b1", b1) + "/with/" + implicitly[play.api.mvc.PathBindable[Boolean]].unbind("b2", b2))
    }
  
    // @LINE:35
    def sort(num:List[Int]): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "sort" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[List[Int]]].unbind("num", num)))))
    }
  
    // @LINE:27
    def add(n1:Double, n2:Double): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "add/" + implicitly[play.api.mvc.PathBindable[Double]].unbind("n1", n1) + "/to/" + implicitly[play.api.mvc.PathBindable[Double]].unbind("n2", n2))
    }
  
    // @LINE:32
    def concat(s1:String, s2:String, s3:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "concat/" + implicitly[play.api.mvc.PathBindable[String]].unbind("s1", play.core.routing.dynamicString(s1)) + "/" + implicitly[play.api.mvc.PathBindable[String]].unbind("s2", play.core.routing.dynamicString(s2)) + "/" + implicitly[play.api.mvc.PathBindable[String]].unbind("s3", play.core.routing.dynamicString(s3)))
    }
  
  }

  // @LINE:52
  class ReverseAuthenticationController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:54
    def whoAmI(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "whoAmI")
    }
  
    // @LINE:56
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "index")
    }
  
    // @LINE:52
    def login(userName:String, password:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("userName", userName)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("password", password)))))
    }
  
  }

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:60
  class ReverseJSONController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:60
    def testJsonRequest(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "testJsonBodyRequest")
    }
  
    // @LINE:63
    def testForcedJson(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "testForcedJson")
    }
  
  }

  // @LINE:23
  class ReverseQueryController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:44
    def withHeaders(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "withHeaders")
    }
  
    // @LINE:38
    def test(a:String, b:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "test/" + implicitly[play.api.mvc.PathBindable[String]].unbind("a", a) + "/test/" + implicitly[play.api.mvc.PathBindable[String]].unbind("b", b))
    }
  
    // @LINE:46
    def withCookies(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "withCookies")
    }
  
    // @LINE:23
    def queryParamExample(name:Option[String], age:Option[Double]): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "test/queryParam" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Option[String]]].unbind("name", name)), Some(implicitly[play.api.mvc.QueryStringBindable[Option[Double]]].unbind("age", age)))))
    }
  
    // @LINE:42
    def parseRequest(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "parseRequest")
    }
  
  }

  // @LINE:13
  class ReverseTimerController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def timeForZone(zone:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "time/" + implicitly[play.api.mvc.PathBindable[String]].unbind("zone", zone))
    }
  
    // @LINE:15
    def zones(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "time/zones")
    }
  
    // @LINE:13
    def time(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "time")
    }
  
  }


}
