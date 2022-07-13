package subjects.poo2

/**
  * Created by Pedro.
  */
object CaseClasses_3 extends App {

  /*
    equals, hashCode, toString
   */

  case class Person(name: String, age: Int)

  // 1. class parameters are fields
  val jim = new Person("Jim", 34)
  println(jim.name)

//  // 2. sensible toString
//  println(jim.toString)
//  println(jim)
//
//  // 3. equals and hashCode implemented OOTB
//  val jim2 = new Person("Jim", 34)
//  println(jim == jim2)
//
//  // 4. CCs have handy copy method
//  val jim3 = jim.copy(age = 45)
//  println(jim3)
//
//  // 5. CCs have companion objects
//  val thePerson = Person
//  val mary = Person("Mary", 23)
//
//  // 6. CCs are serializable
//  // Akka
//
//  // 7. CCs can be used in PATTERN MATCHING


}
