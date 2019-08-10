
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/ORCL/Desktop/learn-playframework/conf/routes
// @DATE:Sat Aug 10 22:34:10 EET 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
