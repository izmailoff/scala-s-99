package s99.p18

import scala.annotation.tailrec

object P18 {

  // somewhat optimized for performance
  def slice[A](from: Int, to: Int, xs: List[A]): List[A] = {
    @tailrec
    def loop(a: Int, b: Int, rem: List[A], accu: List[A]): List[A] = rem match {
      case Nil => accu
      case _ if a >= b | b <= 0 => accu
      case h :: t if a <= 0 && b > 0 => loop(a, b - 1, t, h :: accu)
      case h :: t if a > 0 => loop(a - 1, b - 1, t, accu)
    }

    loop(from, to, xs, Nil) reverse
  }

  // same as above but simpler and cleaner, although not tail recursive
  def sliceNonTailRec[A](from: Int, to: Int, xs: List[A]): List[A] =
    xs match {
      case Nil => Nil
      case _ if from >= to | to <= 0 => Nil
      case h :: t if from <= 0 && to > 0 => h :: sliceNonTailRec(from, to - 1, t)
      case h :: t if from > 0 => sliceNonTailRec(from - 1, to - 1, t)
    }

  def sliceF[A](from: Int, to: Int, xs: List[A]): List[A] = {
    val folded = ((from, to, List[A]()) /: xs) { case (res@(f, t, accu), e) =>
      if (f >= t || t <= 0) res
      else if (f <= 0 && t > 0) (f, t - 1, e :: accu)
      else (f - 1, t - 1, accu)
    }
    folded._3 reverse
  }
}
