package s99.p04

import scala.annotation.tailrec

object P04 {

  /*
   * Tail recursive implementation. If no accumulator is used you get
   * stack overflow on large lists (10,000).
   */
  def length[T](list: List[T]): Int = {
    @tailrec
    def lengthAccumulator[T](accuLength: Int, list: List[T]): Int =
      list match {
        case List() => accuLength
        case _ :: t => lengthAccumulator(accuLength + 1, t)
      }
    lengthAccumulator(0, list)
  }
}