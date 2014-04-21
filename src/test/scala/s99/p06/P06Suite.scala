package s99.p06

import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith
import P06._

@RunWith(classOf[JUnitRunner])
class P06Suite extends FunSuite {

  test("palindrome check of empty list is always successful") {
    assert(true === isPalindrome(List()))
  }

  test("palindrome check of single element list is always successful") {
    assert(true === isPalindrome(List(1)))
  }

  test("palindrome check of palindrome 2 elem list") {
    assert(true === isPalindrome(List(2, 2)))
  }

  test("palindrome check of non-palindrome 2 elem list") {
    assert(false === isPalindrome(List(1, 2)))
  }

  test("palindrome check of palindrome 3 elem list") {
    assert(true === isPalindrome(List(6, 3, 6)))
  }

  test("palindrome check of non-palindrome 3 elem list") {
    assert(false === isPalindrome(List(7, 8, 9)))
  }

  test("palindrome check of palindrome 4 elem list") {
    assert(true === isPalindrome(List(9, 0, 0, 9)))
  }

  test("palindrome check of non-palindrome 4 elem list") {
    assert(false === isPalindrome(List(1, 2, 3, 4)))
  }

  test("palindrome check of palindrome 5 elem list") {
    assert(true === isPalindrome(List(777, 0, 111, 0, 777)))
  }

  test("palindrome check of non-palindrome 5 elem list") {
    assert(false === isPalindrome(List(5, 8, 9, 3, 1)))
  }

  test("palindrome check of large palindrome list returns properly and does not fail with stack overflow") {
    val input = (1 to 5000).toList ++ (5000 to 1 by -1).toList
    assert(true === isPalindrome(input))
  }

  test("palindrome check of large non-palindrome list returns properly and does not fail with stack overflow") {
    val input = (1 to 10000).toList
    assert(false === isPalindrome(input))
  }

}