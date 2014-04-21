package s99.p07

import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith
import P07._

@RunWith(classOf[JUnitRunner])
class P07Suite extends FunSuite {

  test("flatten on empty list returns empty list") {
    val input = List()
    val answer = input
    assert(answer === flatten(input))
  }

  test("flatten on non-list single element list returns itself") {
    val input = List(1)
    val answer = input
    assert(answer === flatten(input))
  }

  test("flatten on non-list multiple element list returns itself") {
    val input = List(1, 2, 3, 4, 5)
    val answer = input
    assert(answer === flatten(input))
  }

  test("flatten on nested list") {
    val answer = List(1, 1)
    val input = List(List(1, 1))
    assert(answer === flatten(input))
  }

  test("flatten with all kinds of list elements") {
    val answer = List(1, 1, 2, 3, 5, 8)
    val input = List(List(1, 1), 2, List(3, List(5, 8)))
    assert(answer === flatten(input))
  }

  test("flatten with strings does not flatten strings") {
    val answer = List("one", "two", "three", "four", "five")
    val input = List(List(List("one", "two"), "three"), List("four"), "five")
    assert(answer === flatten(input))
  }

  /* This test fails. See P07 for explanation.
  test("palindrome poly check of empty list is always successful") {
    val answer = List(1, 1, 2, 3, 5, 8)
    val input = List(List(1, 1), 2, List(3, List(5, 8)))
    assert(answer === flattenPolymorphic(input))
  }
  */
}