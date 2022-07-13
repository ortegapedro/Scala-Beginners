package subjects.poo2

/**
  * Created by Pedro.
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
