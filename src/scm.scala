object scm extends App {

  type Symbol = String
  type SList = List[Any]

  def eval(expr: Any, env: Map[Symbol, Any]) = {
    expr match {
      case s: Symbol => env(s)
      case l: SList => eval_list(l, env)
      case _ => expr
    }
  }

  def eval_list(expr: SList, env: Map[Symbol, Any]) = {
    42
  }

  val env = Map("hello" -> 12345)
  println(eval("hello", env))
  println(eval(4, env))
}
