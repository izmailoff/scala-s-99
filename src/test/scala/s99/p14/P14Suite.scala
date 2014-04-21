package s99.p14

import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith
import P14._

@RunWith(classOf[JUnitRunner])
class P14Suite extends FunSuite {

  test("Duplicate on empty list returns empty list") {
    val input = List()
    val answer = input
    assert(answer === duplicate(input))
  }
  
  test("Duplicate on single element list returns list with 2 elements") {
    val input = List(1)
    val answer = List(1, 1)
    assert(answer === duplicate(input))
  }
  
  test("Duplicate on multiple element list returns list with duplicated elements") {
    val input = List('a', 'b', 'c', 'c', 'd')
    val answer = List('a', 'a', 'b', 'b', 'c', 'c', 'c', 'c', 'd', 'd')
    assert(answer === duplicate(input))
  }
  
  test("Duplicate on large list does not fail with stack overflow") {
    val size = 100000
    val input = (1 to size).toList
    val result = duplicate(input)
    assert(size * 2 === result.length)
    assert(input === result.distinct)
  }
  
}