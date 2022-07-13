package subjects.functional

import scala.util.Random

/**
  * Created by Pedro.
  */
object Sequences_5 extends App {

  // Seq
  val aSequence = Seq(1,3,2,4)
  println(aSequence)
  println(aSequence.reverse)
  println(aSequence(2))
  println(aSequence ++ Seq(7,5,6))
  println(aSequence.sorted)
  println(aSequence :+ 50)
  println(aSequence.updated(0,2))
  println(aSequence.iterator.next())
  println(aSequence.iterator.hasNext)

  var res = 1
  aSequence.foreach((x:Int) => res*=x)
  println(res)



  // Ranges
//  val aRange: Seq[Int] = 1 until 10
//  aRange.foreach(println)

//  (1 to 10).foreach(x => println("Hello"))
//
  // lists
//  val aList = List(1,2,3)
//  val prepended = 42 +: aList :+ 89
//  println(prepended)
//
//  val apples5 = List.fill(5)("apple")
//  println(apples5)
//  println(aList.mkString("-|-"))

  // arrays

//  val threeElements = Array.ofDim[String](3)
//  threeElements.foreach(println)
//
//  // mutation
//  val numbers = Array(1,2,3,4)
//  numbers(2) = 100  // syntax sugar for numbers.update(2, 0)
//  println(numbers.mkString(" "))
//
//  // arrays and seq
//  val numbersSeq: Seq[Int] = numbers  // implicit conversion
//  println(numbersSeq)

  // vectors
  val vector: Vector[Int] = Vector(1,2,3)
  println(vector)

  // vectors vs lists

  val maxRuns = 1000
  val maxCapacity = 1000000

  def getWriteTime(collection: Seq[Int]): Double = {
    val r = new Random
    val times = for {
      it <- 1 to maxRuns
    } yield {
      val currentTime = System.nanoTime()
      collection.updated(r.nextInt(maxCapacity), r.nextInt())
      System.nanoTime() - currentTime
    }
    times.sum / maxRuns
  }

  val numbersList = (1 to maxCapacity).toList
  val numbersVector = (1 to maxCapacity).toVector


  // depth of the tree is small
  println(getWriteTime(numbersVector))

  // keeps reference to tail
  // updating an element in the middle takes long
  println(getWriteTime(numbersList))


}
