package subjects.poo2

/**
  * Created by Pedro.
 *  With anonymous classes, class definitions don’t need to be stable or reusable.
 *  When a subclass will only be needed once, the anonymous class syntax can help to simplify your code base.
 *
 *  To define a one-time anonymous class, instantiate the parent (and potentially abstract) class and follow
 *  the class name and parameters with curly braces containing your implementation.
 *  The result is an instance that does extend the given parent class with a one-time implementation,
 *  but can be used like an instance from a traditional class definition.
  */
object AnonymousClasses_6 extends App {

  abstract class Animal {
    def eat: Unit
  }

  // anonymous class
  val funnyAnimal: Animal = new Animal {
    override def eat: Unit = println("ahahahahahaah")
  }
  println(funnyAnimal.getClass)
  funnyAnimal.eat

  /*
    equivalent with

    class AnonymousClasses extends Animal {
      override def eat: Unit = println("from classs")
    }
    val funnyAnimal2: Animal = new AnonymousClasses
    funnyAnimal2.eat
*/


  class Person(name: String) {
    def sayHi: Unit = println(s"Hi, my name is $name, how can I help?")
  }

  val jim = new Person("Jim") {
    override def sayHi: Unit = println(s"Hi, my name is Jim, how can I be of service?")
  }


  ///Another example of anonimus class

  abstract class Persona(){
    def getName:String="mundo"
  }


  val p: Persona = new Persona{}
  println(p.getName)


}
