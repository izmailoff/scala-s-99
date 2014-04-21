package s99.p08

object P08 {

  def compress[T](input: List[T]): List[T] = {
    def compressWithPrevious(previous: Option[T], remaining: List[T]): List[T] =
      remaining match {
        case List() => List()
        case head :: tail =>
          val nextIter = compressWithPrevious(Some(head), tail)
          if (previous.isEmpty || head != previous.get)
            head :: nextIter
          else
            nextIter
      }
    compressWithPrevious(None, input)
  }
}