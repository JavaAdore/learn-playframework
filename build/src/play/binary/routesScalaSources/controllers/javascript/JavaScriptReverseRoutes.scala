
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/ORCL/Desktop/learn-playframework/conf/routes
// @DATE:Sat Aug 10 22:34:10 EET 2019

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers.javascript {

  // @LINE:10
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:48
  class ReverseCVSParserController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:48
    def parseCVSAsApplicationFormUrlEncoded: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CVSParserController.parseCVSAsApplicationFormUrlEncoded",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "parseCVSAsApplicationFormUrlEncoded"})
        }
      """
    )
  
  }

  // @LINE:27
  class ReverseCalcController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def combine: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CalcController.combine",
      """
        function(b10,b21) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "and/" + (""" + implicitly[play.api.mvc.PathBindable[Boolean]].javascriptUnbind + """)("b1", b10) + "/with/" + (""" + implicitly[play.api.mvc.PathBindable[Boolean]].javascriptUnbind + """)("b2", b21)})
        }
      """
    )
  
    // @LINE:35
    def sort: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CalcController.sort",
      """
        function(num0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sort" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[List[Int]]].javascriptUnbind + """)("num", num0)])})
        }
      """
    )
  
    // @LINE:27
    def add: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CalcController.add",
      """
        function(n10,n21) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "add/" + (""" + implicitly[play.api.mvc.PathBindable[Double]].javascriptUnbind + """)("n1", n10) + "/to/" + (""" + implicitly[play.api.mvc.PathBindable[Double]].javascriptUnbind + """)("n2", n21)})
        }
      """
    )
  
    // @LINE:32
    def concat: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CalcController.concat",
      """
        function(s10,s21,s32) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "concat/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("s1", encodeURIComponent(s10)) + "/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("s2", encodeURIComponent(s21)) + "/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("s3", encodeURIComponent(s32))})
        }
      """
    )
  
  }

  // @LINE:52
  class ReverseAuthenticationController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:54
    def whoAmI: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthenticationController.whoAmI",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "whoAmI"})
        }
      """
    )
  
    // @LINE:56
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthenticationController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "index"})
        }
      """
    )
  
    // @LINE:52
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthenticationController.login",
      """
        function(userName0,password1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("userName", userName0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("password", password1)])})
        }
      """
    )
  
  }

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:60
  class ReverseJSONController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:60
    def testJsonRequest: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.JSONController.testJsonRequest",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "testJsonBodyRequest"})
        }
      """
    )
  
    // @LINE:63
    def testForcedJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.JSONController.testForcedJson",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "testForcedJson"})
        }
      """
    )
  
  }

  // @LINE:23
  class ReverseQueryController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:44
    def withHeaders: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.QueryController.withHeaders",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "withHeaders"})
        }
      """
    )
  
    // @LINE:38
    def test: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.QueryController.test",
      """
        function(a0,b1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "test/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("a", a0) + "/test/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("b", b1)})
        }
      """
    )
  
    // @LINE:46
    def withCookies: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.QueryController.withCookies",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "withCookies"})
        }
      """
    )
  
    // @LINE:23
    def queryParamExample: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.QueryController.queryParamExample",
      """
        function(name0,age1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "test/queryParam" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Option[String]]].javascriptUnbind + """)("name", name0), (""" + implicitly[play.api.mvc.QueryStringBindable[Option[Double]]].javascriptUnbind + """)("age", age1)])})
        }
      """
    )
  
    // @LINE:42
    def parseRequest: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.QueryController.parseRequest",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "parseRequest"})
        }
      """
    )
  
  }

  // @LINE:13
  class ReverseTimerController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def timeForZone: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TimerController.timeForZone",
      """
        function(zone0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "time/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("zone", zone0)})
        }
      """
    )
  
    // @LINE:15
    def zones: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TimerController.zones",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "time/zones"})
        }
      """
    )
  
    // @LINE:13
    def time: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TimerController.time",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "time"})
        }
      """
    )
  
  }


}
