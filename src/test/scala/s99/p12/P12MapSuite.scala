package s99.p12

import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith
import P12Map._

@RunWith(classOf[JUnitRunner])
class P12MapSuite extends FunSuite {

  test("Decode on empty list returns empty list") {
    val input = List()
    val answer = input
    assert(answer === decode(input))
  }

  test("Decode on single element list returns list with 1 element") {
    val input = List((1, 'a'))
    val answer = List('a')
    assert(answer === decode(input))
  }

  test("Encode on multiple element list with repeating entries correctly groups and counts elements") {
    val input = List((4, 'a'), (1, 'b'), (2, 'c'), (2, 'a'), (1, 'd'), (4, 'e'))
    val answer = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')
    assert(answer === decode(input))
  }

}