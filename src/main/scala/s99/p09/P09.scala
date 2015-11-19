package s99.p09

object P09 {

  def pack[T](input: List[T]): List[List[T]] =
    input.foldRight(List(Nil): List[List[T]]) {
      (e, accu) => accu match {
        case List(Nil) => List(List(e))
        case (h :: t) :: o if h == e => (e :: h :: t) :: o
        case curList :: o => List(e) :: curList :: o
      }
    }

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
