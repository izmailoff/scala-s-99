package s99.p08

import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith
import P08._

@RunWith(classOf[JUnitRunner])
class P08Suite extends FunSuite {

  test("Compress removes all duplicate adjacent elements") {
    val input = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')
    val answer = List('a', 'b', 'c', 'a', 'd', 'e')
    assert(answer === compress(input))
  }
  
  test("Compress doesn't remove any elements in a list with unique elements") {
    val input = List(1, 2, 3, 4, 5)
    val answer = input
    assert(answer === compress(input))
  }
  
  test("Compress on empty list returns empty list") {
    val input = List()
    val answer = input
    assert(answer === compress(input))
  }
  
  test("Compress on single element list returns the same list") {
    val input = List(1)
    val answer = input
    assert(answer === compress(input))
  }
  
  test("Compress on a list will all elements being same returns 1 elem list") {
    val input = List(5, 5, 5, 5, 5, 5)
    val answer = List(5)
    assert(answer === compress(input))
  }
  
}