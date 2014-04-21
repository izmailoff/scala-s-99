package s99.p02

object P02 {
  def penultimate[T](xs: List[T]): T =
    xs match {
      case List() => throw new NoSuchElementException("Empty list can't contain penultimate element.")
      case List(_) => throw new NoSuchElementException("One element list can't contain penultimate element.")
      case x :: _ :: List() => x
      case _ :: y => penultimate(y)
    }
}