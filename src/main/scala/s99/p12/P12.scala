package s99.p12

object P12 {
  def decode[T](input: List[(Int, T)]): List[T] =
    for (p <- input; times <- 1 to p._1) yield p._2
}