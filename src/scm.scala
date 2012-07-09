object scm extends App {
  def eval(expr: Any, env: Map[String, Any]) = {
    if (expr.isInstanceOf[Int]) expr
  }


  println(eval(5, Map()))
}
