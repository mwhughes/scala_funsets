package funsets

object Main extends App {
  import FunSets._
  println(contains(singletonSet(1), 1))
  val x = singletonSet(1);
  val y = singletonSet(2);
  val z = union(x, y);
  println(contains(intersect(z, y), 1))
  def p(elem: Int): Boolean = elem == 1;
  
}
