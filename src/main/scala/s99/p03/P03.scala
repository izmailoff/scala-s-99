package s99.p03

object P03 {
  def nth[T](index: Int, input: List[T]): T =
    input match {
      case List() => throw new NoSuchElementException("Can't find " + index + "th element in the list")
      case h :: t => if (index == 0) h else nth(index - 1, t)
    }
}