package s99.p09

import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith
import P09._

@RunWith(classOf[JUnitRunner])
class P09Suite extends FunSuite {

  test("Pack on empty list returns List(List())") {
    val input = List()
    val answer = List(List())
    assert(answer === pack(input))
  }
  
  test("Pack on single element list returns list of list of 1 element") {
    val input = List(1)
    val answer = List(List(1))
    assert(answer === pack(input))
  }
  
  test("Pack on multiple repeating element list returns proper packed lists") {
    val input = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')
    val answer = List(List('a', 'a', 'a', 'a'), List('b'), List('c', 'c'), List('a', 'a'), List('d'), List('e', 'e', 'e', 'e'))
    assert(answer === pack(input))
  }
  
  test("Pack on mutiple non-repeating multiple element list returns packed list") {
    val input = List(1, 2, 3, 4, 5)
    val answer = List(List(1), List(2), List(3), List(4), List(5))
    assert(answer === pack(input))
  }

}