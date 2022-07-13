package subjects.poo2
import otherPackage.{PrinceCharming, Cinderella => Princess}
import java.sql.{Date => SqlDate}
import java.util.Date

/**
  * Created by Pedro.
  */
object PackagingAndImports_2 extends App {

  // package members are accessible by their simple name
  val writer = new Writer("Pedro", "Ortega", 2018)

  // import the package
  val princess = new Princess  // otherPackage.Cinderella = fully qualified name

  // packages are in hierarchy

  // package object
  sayHello
  println(SPEED_OF_LIGHT)

  // imports
  val prince = new PrinceCharming

  // 1. use fully qualified name
  val date = new Date

  // 2. use aliasing
  val sqlDate = new SqlDate(2018, 5, 4)


  // default imports
  // java.lang - String, Object, Exception
  // scala - Int, Nothing, Function
  // scala.Predef - println, ???

}
