package s99.p17

import scala.annotation.tailrec

object P17 {

  def split[T](len: Int, xs: List[T]): (List[T], List[T]) = {
    @tailrec
    def recur(left: List[T], right: List[T], rem: Int): (List[T], List[T]) =
      if(rem == 0) (left, right)
      else recur(left :+ right.head, right.tail, rem - 1)

    recur(Nil, xs, len)
  }
}
