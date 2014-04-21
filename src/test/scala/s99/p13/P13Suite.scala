package s99.p13

import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith
import P13._

@RunWith(classOf[JUnitRunner])
class P13Suite extends FunSuite {

  test("Encode on empty list returns empty list") {
    val input = List()
    val answer = input
    assert(answer === encodeDirect(input))
  }

  test("Encode on single element list returns list with 1 pair and count = 1") {
    val input = List(1)
    val answer = List((1, 1))
    assert(answer === encodeDirect(input))
  }

  test("Encode on multiple element list with repeating entries correctly groups and counts elements") {
    val input = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')
    val answer = List((4, 'a'), (1, 'b'), (2, 'c'), (2, 'a'), (1, 'd'), (4, 'e'))
    assert(answer === encodeDirect(input))
  }

}
