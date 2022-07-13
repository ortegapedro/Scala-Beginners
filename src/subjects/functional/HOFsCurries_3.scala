package subjects.functional

/**
  * Created by Pedro.
 *   Estas funciones son las que toman otras funciones como parámetros, o las cuales el resultado es una función.
  */
object HOFsCurries_3 extends App {

  def calcular(f: Int => Int, v: Int) = f(v)
  def sum(v: Int) = v + v
  val s = calcular(sum,2)


  def saludar(elSaludo: String): String => Unit =
    (name: String) => println(s"$elSaludo, $name")

  val sayHello = saludar("Hola")
  sayHello("Pedro")


  // function that applies a function n times over a value x
  // nTimes(f, n, x)
  // nTimes(f, 3, x) = f(f(f(x))) = nTimes(f, 2, f(x)) = f(f(f(x)))
  // nTimes(f, n, x) = f(f(...f(x))) = nTimes(f, n-1, f(x))
  def nTimes(f: Int => Int, n: Int, x: Int): Int =
    if (n <= 0) x
    else nTimes(f, n-1, f(x))

  val plusOneF = (x: Int) =>  x + 1

  println("----   nTimes")
  println(nTimes(plusOneF, 10, 1))


  def nTimesBetter(f: Int => Int, n: Int): (Int => Int) =
    if (n <= 0)  (x: Int) => x
    else (x: Int) => nTimesBetter(f, n-1)(f(x))

  println("----   nTimesBetter")
  val plus10 = nTimesBetter(plusOneF, 10)
  println(plus10(1))

  val plus = nTimesBetter(plusOneF, 10)(2)
  println(plus)

  /*
   Cuando un método es invocado con un número menor de listas de parámetros,
   en su lugar se devolverá una función que toma las listas faltantes como sus argumentos.
   */

  def adder (x:Int)(y:Int):Int = x+y
  val add1: Int => Int = adder(3)
  val add2 = add1(10)
  println(add2)


  println("curried functions")
  val superAdder: Int => Int => Int = (x: Int) => (y: Int) => x + y
  val add3 = superAdder(3)  // y => 3 + y
  println(add3(10))
  //or
  println(superAdder(3)(10))

  /*
  def superAdder2 (x:Int):(Int => Int) = {
    (y:Int) => x+y
  }
  println(superAdder2(3)(10))


  def superAdder3 (x:Int):Int => (Int => Int) = {
    (y:Int) => (z:Int) => x+y+z
  }
  println(superAdder3(3)(10)(5))

  val superAdder4: Int => Int => Int => Int = (x: Int) => (y: Int) => (z:Int) => x + y + z
  println(superAdder4(3)(10)(5))
  */



  // functions with multiple parameter
  def curriedFormatter(c: String)(x: Double): String = c.format(x)

  val standardFormat: (Double => String) = curriedFormatter("%4.2f")
  val preciseFormat: (Double => String) = curriedFormatter("%10.8f")

  println(standardFormat(Math.PI))
  println(preciseFormat(Math.PI))

}
