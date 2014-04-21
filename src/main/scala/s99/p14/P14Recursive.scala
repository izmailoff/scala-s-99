package s99.p14

import scala.annotation.tailrec

object P14Recursive {

  def duplicateSimple[T](input: List[T]): List[T] =
    input match {
      case List() => List()
      case head :: tail => head :: head :: duplicateSimple(tail)
    }

  def duplicate[T](input: List[T]): List[T] = {
    @tailrec
    def duplicateAccu[T](input: List[T], accu: List[T]): List[T] =
      input match {
        case List() => accu reverse
        case head :: tail => duplicateAccu(tail, head :: head :: accu)
      }
    duplicateAccu(input, List())
  }

}