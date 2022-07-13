package subjects.basic1

import scala.annotation.tailrec

/**
 * Created by Pedro on 07-May-18.
 */
object Recursion extends App {

  def factorial(n: Int): Int =
    if (n <= 1) 1
    else {
      println("Computing factorial of " + n + " - I first need factorial of " + (n - 1))
      val result = n * factorial(n - 1)
      println("Computed factorial of " + n)

      result
    }

  println(factorial(4))
}

//  println(factorial(5000))
object Recursion2 extends App {
  def anotherFactorial(n: Int): BigInt = {
    @tailrec
    def factHelper(x: Int, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else factHelper(x - 1, x * accumulator) // TAIL RECURSION = use recursive call as the LAST expression

    factHelper(n, 1)
  }

  /*
    anotherFactorial(10) = factHelper(10, 1)
    = factHelper(9, 10 * 1)
    = factHelper(8, 9 * 10 * 1)
    = factHelper(7, 8 * 9 * 10 * 1)
    = ...
    = factHelper(2, 3 * 4 * ... * 10 * 1)
    = factHelper(1, 1 * 2 * 3 * 4 * ... * 10)
    = 1 * 2 * 3 * 4 * ... * 10

   */

  println(anotherFactorial(5))
}
/*
  1.  Concatena un string n veces
  2.  IsPrime function tail recursive
  3.  Fibonacci function, tail recursive.
 */

object RecursionEX extends App {
  // WHEN YOU NEED LOOPS, USE _TAIL_ RECURSION.



  @tailrec
  def concatenateTailrec(aString: String, n: Int, accumulator: String): String =
    if (n <= 0) accumulator
    else concatenateTailrec(aString, n - 1, aString + accumulator)

  println(concatenateTailrec("hello", 3, ""))

}

object RecursionEX2 extends App {
  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeTailrec(t: Int, isStillPrime: Boolean): Boolean =
      if (!isStillPrime) false
      else if (t <= 1) true
      else isPrimeTailrec(t - 1, n % t != 0 && isStillPrime)

    isPrimeTailrec(n / 2, true)
  }

  println(isPrime(17))
//  println(isPrime(629))
//  println("-" * 50)
}

object RecursionEX3 extends App {
  def nombre_funcion(list: Int*){}

  def fibonacci(n: Int): Int = {
    def fiboTailrec(i: Int = 2, last: Int = 1, nextToLast: Int = 1): Int =

      if (i >= n) last
      else {
//        println("i+1 = " + (i + 1) + "   last + nextToLast = " + (last + nextToLast) + "  last = " + (last))
        fiboTailrec(i + 1, last + nextToLast, last)
      }

    if (n <= 2) 1
    else fiboTailrec()
  }

  //i = 2, n = 8
  //i = 3, 2 , 1
  //4 , 3 , 2
  //5 , 5 ,3
  //6 , 8 , 5
  //7 , 13 ,8
  //8
  println(fibonacci(9))
  // 1 1 2 3 5 8 13 21
  // 1 2 3 4 5 6  7  8

}
