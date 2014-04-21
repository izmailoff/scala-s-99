package s99.p05

import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith
import P05._

@RunWith(classOf[JUnitRunner])
class P05Suite extends FunSuite {

  test("reverse of empty list returns empty list") {
    assert(List() === reverse(List()))
  }

  test("reverse of single element list returns the same list") {
    assert(List(1) === reverse(List(1)))
  }

  test("reverse of multiple element list returns proper reverse") {
    assert(List(3, 2, 1) === reverse(List(1, 2, 3)))
  }
  
  test("reverse of large list returns proper reverse and does not fail with stack overflow") {
    val input = (1 to 10000).toList
    assert(input.reverse === reverse(input))
  }

}