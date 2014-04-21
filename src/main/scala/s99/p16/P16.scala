package s99.p16

object P16 {

  /**
   * argument 'n' is 1 based
   */
  def drop[T](n: Int, input: List[T]): List[T] = {
    require(n > 0)
    (for { idx <- 0 until input.length; if ((idx + 1) % n != 0) } yield input(idx)).toList
  }
}