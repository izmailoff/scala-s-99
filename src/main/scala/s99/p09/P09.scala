package s99.p09

object P09 {

  def pack[T](input: List[T]): List[List[T]] = {
    def packWithPrevious(remaining: List[T])(previous: List[T]): List[List[T]] =
      remaining match {
        case List() => List(previous)
        case head :: tail =>
          val nextIter = packWithPrevious(tail)(_)
          previous match {
            case List() => nextIter(List(head))
            case prevHead :: _ =>
              if (head != prevHead)
                previous :: nextIter(List(head))
              else
                nextIter(head :: previous)
          }
      }
    packWithPrevious(input)(List())
  }

}