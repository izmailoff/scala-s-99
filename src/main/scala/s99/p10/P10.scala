package s99.p10

import s99.p09.P09._

object P10 {

  /*
   * Note that empty list check is required.
   * P10Answer does not have it and fails with "java.util.NoSuchElementException: head of empty list" exception.
   */
  def encode[T](input: List[T]): List[(Int, T)] =
    input match {
      case List() => List()
      case _ => pack(input) map (e => (e.length, e.head))
    }

}