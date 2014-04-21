package s99.p05

import scala.annotation.tailrec

object P05 {

  def reverseSimple[T](input: List[T]): List[T] =
    input match {
      case List() => List()
      case h :: t => reverseSimple(t) ::: h :: List()
    }

  /*
   * Notice that head is added to beginning of the accumulator list,
   * but in reverseSimple method it's added to the end of the result of the
   * recursive call.
   */
  def reverse[T](input: List[T]): List[T] = {
    @tailrec
    def reverseAccu[T](accu: List[T], remaining: List[T]): List[T] =
      remaining match {
        case List() => accu
        case head :: tail => reverseAccu(head :: accu, tail)
      }
    reverseAccu(List(), input)
  }
}