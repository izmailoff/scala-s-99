package s99.p06

import scala.annotation.tailrec

object P06 {
  def isPalindromeWithReverseBuiltIn[T](input: List[T]): Boolean =
    input.reverse == input

  /*
   * Interesting case where @tailrec works because of boolean short circuiting.
   */
  @tailrec
  def isPalindrome[T](input: List[T]): Boolean =
    input match {
      case List() => true
      case List(_) => true
      case _ :: tail => input.head == input.last && isPalindrome(tail.init)
    }
}