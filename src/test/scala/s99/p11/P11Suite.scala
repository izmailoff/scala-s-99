package s99.p11

import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith
import P11._

@RunWith(classOf[JUnitRunner])
class P11Suite extends FunSuite {

  test("Encode on empty list returns empty list") {
    val input = List()
    val answer = input
    assert(answer === encodeModified(input))
  }

  test("Encode on single element list returns the same list") {
    val input = List(1)
    val answer = input
    assert(answer === encodeModified(input))
  }

  test("Encode on multiple element list with repeating entries correctly groups and counts elements") {
    val input = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')
    val answer = List((4, 'a'), 'b', (2, 'c'), (2, 'a'), 'd', (4, 'e'))
    assert(answer === encodeModified(input))
  }

}