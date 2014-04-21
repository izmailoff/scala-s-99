package s99.p01

object P01 {
  def last[T](xs: List[T]): T =
    xs match {
      case List() => throw new NoSuchElementException("Last element in list " + xs + " does not exist")
      case x :: List() => x
      case _ :: t => last(t)
    }
}
