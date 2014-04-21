package s99.p12

object P12Map {
  def decode[T](input: List[(Int, T)]): List[T] =
    input flatMap { p => List.fill(p._1)(p._2) }
}