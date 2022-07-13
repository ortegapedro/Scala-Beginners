package subjects.functional

/**
 * Created by Pedro.
 */
object MapFlatmapFilterFor_7 extends App {

  val list = List(1, 2, 3)
  println(list.head)
  println(list.tail)

  // map
  println(list.map(_ + 1))
  println(list.map(_ + " is a number"))

  // filter
  println(list.filter(_ % 2 == 0))

  // flatMap
  val toPair = (x: Int) => List(x, x + 1)
  println(list.flatMap(toPair))

  // print all combinations between two lists
  val numbers = List(1, 2, 3, 4)
  val chars = List('a', 'b', 'c', 'd')
  val colors = List("black", "white")

  // List("a1", "a2"... "d4")

  // "iterating"
  val combinations = numbers.filter(_ % 2 == 0)
    .flatMap(
      n => chars.flatMap(
        c => colors.map(
          color => "" + c + n + "-" + color
        )
      )
    )
  println(combinations)


  // foreach
  list.foreach(println)

  // for-comprehensions
  val forCombinations = for {
    n <- numbers if n % 2 == 0
    c <- chars
    color <- colors
  } yield "" + c + n + "-" + color
  println(forCombinations)

  for {
    n <- numbers
  } println(n)

  // syntax overload
  println(
    list.map { x =>
      x * 2
    }
  )

  println(list.map(_ * 2))

  println(list)
  println(list.foldLeft(2)((x, y) => x + y))
  println(list.foldRight(2)((x, y) => x + y))
  println(list.fold(1)((x, y) => x + y))

}
