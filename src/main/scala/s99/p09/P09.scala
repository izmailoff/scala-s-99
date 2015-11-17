package s99.p09

object P09 {

  def pack[T](input: List[T]): List[List[T]] =
    input.foldRight(Nil : List[List[T]]) ((e, accu) => accu match {
      case Nil => List(List(e))
      case curList@(h :: t) if e == h => List(e) :: curList
      case curList@(h :: t) => List(List(e)) ::: curList
  })

  // no helper functions used like fold:
  def packOld[T](input: List[T]): List[List[T]] = {
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
