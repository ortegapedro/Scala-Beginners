package subjects.poo2

/**
  * Created by Pedro.
  * Scala también tiene un concepto de clase abstracta que es similar a la clase abstracta de Java.
  * Pero debido a que los trait son tan poderosos, rara vez necesitas usar una clase abstracta.
  * De hecho, solo necesita usar una clase abstracta cuando:
  *
  *  1. Desea crear una clase base que requiera argumentos de constructor
  *  2. Su código Scala será llamado desde código Java
  */

object AbstractDataTypes_5 extends App {

  // abstract
  abstract class Animal {
    val creatureType: String = "wild"
    val zone: String
    def eat: Unit
  }

  class Dog extends Animal {
    override val creatureType: String = "Canine"
    def eat: Unit = println("crunch crunch")

    override val zone: String = "zone"
  }


  // traits
  trait Carnivore {
    def eat(animal: Animal): Unit
    val preferredMeal: String = "fresh meat"
  }

  trait ColdBlooded{
    def drink(string: String):Unit
  }

  class Crocodile extends Animal with Carnivore with ColdBlooded {
    override val creatureType: String = "croc"
    def eat: Unit = println("nomnomnom")
    def eat(animal: Animal): Unit = println(s"I'm a croc and I'm eating ${animal.creatureType}")

    override def drink(s: String): Unit = {
      println(s"i come from coolBlooded trait and i drink $s")
    }

    override val zone: String = "zone"
  }

  val dog = new Dog
  val croc = new Crocodile
  croc.eat(dog)
  croc.drink(" wine")

  // traits vs abstract classes
  // 1 - traits do not have constructor parameters
  // 2 - multiple traits may be  inherited by the same class
  // 3 - traits = behavior, abstract class = "thing"
}
