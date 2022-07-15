package subjects.intro


import scala.annotation.tailrec
import scala.util.Try




object HelloScala extends App {
  println("Hello")
}

object variables extends App {
  //Mutable e inmutable
  val y = 10
  //val y = 12

  var x = 10
  x = 15
  //  x = 15.5

  //Lazy vals
  //  val  w = z -1
  //  val z = 100

  // lazy : optimización
  lazy val w = z - 1
  lazy val z = 100
  println(w)

  val l = LazyList(1, 2, 3, 4)
  println(l.headOption)
}

object tiposNumericos extends App {
  var b: Byte = 127
  //  b = -129
  //  b = 128

  var s: Short = 32767
  //s = -32769
  //s = 32769

  var i: Int = -2147483647
  //i = -2147483649
  //i = 2147483648

  var l: Long = 9223372036854775807L

  //Convertir  Byte ➤Short ➤Int ➤Long ➤Float ➤Double
  //  var s: Short = 32767
  //  var b: Byte = 127
  s = b
  //b = s

  l = i
  //i = l
}

object otrosTipos extends App {
  val bool: Boolean = !false
  val ch: Char = 'A'
  val empty: Unit = ()

  var person: Any = "Pedro"
  person = 22
  person = List()
  person = Array()
  person = true

  val helloString: String = "Hello"

  // Interpolacion de Strings
  val bookTitle = "Beginning Scala"
  print(s"Book title is ${bookTitle}")
}

object functionsExamples extends App {
  def hello() = {
    "Hello World!"
  }

  def hello2(): String = {
    "Hello World!"
  }

  def squareFc(i: Int): Int = {
    i * i
  }

  println(squareFc(2))

  //funcion anonima asignada a un valor
  val getTheAnswer = () => 42

  val square = (i: Int) => {
    i * i
  }
  println(square(2))

  val sum = (i: Int, y: Int) => {
    i + y
  }
  println(sum(2, 2))

  def add(x: Int, y: Int): Int = {
    x + y
  }

  println(add(2, 3))


}

object arraysExample extends App {

  var books: Array[String] = new Array[String](3)
  books(0) = "Beginning Scala"
  books(1) = "Beginning Java"
  books(2) = "Beginning Groovy"
  println(books(0))

  var books2 = new Array[String](3)

  var books3 = Array("Beginning Scala", "Beginning Java", "Beginning Groovy")
  books3(0) = "Beginning Scala updated"
  println(books3(0))
}

object listasexample extends App {

  val emptyList: List[Nothing] = List()

  val booksList: List[String] = List("Beginning Scala", "Beginning Groovy", "Beginning Java")
  booksList.appended("newBook")
  booksList + "nuevo libro"
  booksList.take(1)
}

object tuplasExample extends App {

  val tuple = (1, false, "Scala")

  val tuple2 = "title" -> "Beginning Scala"

  //acceder
  val third = tuple._3
  println(third)
}

object mapasExample extends App {

  val mapEx = Map('a' -> 1, 'b' -> 2, 'c' -> 3, 'd' -> 4, 'e' -> 5)

  println(mapEx('a'))

  val mapEx2 = Map(('a', 1), ('b', 2), ('c', 3), ('d', 4), ('e', 5))
  println(mapEx2('b'))

}

object condicionesExample extends App {
  val exp = true
  if (exp) {
    println("Line one")
    println("Line two")
  }

  val cond: Int = if (exp) 1
  else {
    val j = System.currentTimeMillis
    (j % 100L).toInt
  }
}

object buclesExample extends App {

  val exp = true
  while (exp) println("Working...")

  while (exp) {
    println("Working...")
  }

  val books = Array("Beginning Scala", "Beginning Java", "Beginning Groovy")

  for (book <- books)
    println(book)

  //Filtros
  for (book <- books
       if book.contains("Scala")
       ) println(book)

  //variables dentro de expresiones
  for {
    book <- books
    bookVal = book.toUpperCase()
  } println(bookVal)

  // Yield para generar nuevas colecciones
  val scalabooks = for {
    book <- books
    if book.contains("Scala")
  } yield book

  println(scalabooks)
  println(scalabooks.mkString("Array(", ", ", ")"))


}

object rangosExample extends App {
  (1 to 5).foreach(x => print(x))
  (1 until 10).foreach(x => print(x))
  (1 to 10 by 2).foreach(x => print(x))
}

object objectAndTuple extends App {
  //  Objeto y tupla son similares
  val tuple = (1, "Daniel", false)
  println(tuple)

  case class Persona(id: Int, nombre: String, activo: Boolean)

  val p = Persona(1, "Pedro", true)
  println(p)
  val p1 = Persona.tupled(tuple)
  println(p1)

  val tuple2 = Persona.unapply(p)
  println(tuple2)
}

//Pattern matching
object patterMatchinExample extends App {

  44 match {
    case 44 => true // if wematch 44,theresult is true
    case _ => false // otherwisetheresult isfalse
  }

  "David" match {
    case "David" => 45 // the result is 45 if we match "David"
    case "Elwood" => 77
    case _ => 0

  }

  //////////////////////////////////////
  case class Person(nombre: String, edad: Int)

  val person1 = Person("Maria", 20)
  val person2 = Person("Maria", 15)

  def whoIS(x: Person) = x match {
    case y if y.edad >= 18 => "Mayor de edad"
    case _ => "No es mayor de edad"
  }

  println(whoIS(person1))
  println(whoIS(person2))

  /**
   * Mejorar el ultimo match, para responder diferente si alguien es mayor de edad
   * cuando se llama Maria y es menor de edad, y los otros caso posibles
   */
}

object recursionExample extends App {
  // Recursion
  def factorial(n: Long): Long =
    if (n == 1) {
      println("Terminó")
      1
    } else {
      println(s"Va calculando ${n}")
      n * factorial(n - 1)
    }

  val res = factorial(3)
  println(res)

  // Tail Recursion
  @tailrec
  def factorialTail(n: Long, resultado: Long = 1L): Long =
    if (n == 0) {
      println("Terminó")
      resultado
    } else {
      println(s"Va calculando: ${n} resltado: ${resultado}")
      factorialTail(n - 1, n * resultado)
    }

  val res2 = factorialTail(3)
  println(res2)
}

object curriedFunction extends App {
  //Agregacion
  val resultado = (1 to 3).foldLeft(1L)((r, n) => r * n)
  println(resultado)
}

object funcionesTotalesParciales extends App {
  //Funciones parciales
  val a = List(1, 2, 3)
  println(a.head)
  println(a.tail)

  val b = Nil
  //  println(b.head)
  //  println(b.tail)

  //Funciones totales
  println(b.take(1))
  println(b.drop(1))
}

object tiposExample extends App {
  //Tipos
  type PersonaId = Int

  case class Persona2(id: PersonaId, nombre: String)

  type Estudiante = Persona2

  var estudent = new Estudiante(1, "Pedro")

  println(estudent)
}

//Genericos

object genericosExample extends App {

  //Comodines ;  letras mayusculas entre corchetes

  def f[A](x: A): String = s"$x"

  println(f("ABC"))
  println(f(true))

  trait ejemplo[A, B] {
    def g(x: A, f: A => B): B = f(x)
  }

  object ejemplo extends ejemplo[Int, String] //[A, B]

  println(ejemplo.g(3, f))
}

object tiposAlgebraicos extends App {

  //Tipos algebraicos o polinomicos (suma o producto(Strings, Case clases))

  sealed trait Persona

  case class Estudiante(nombre: String) extends Persona

  case class Profesor(nombre: String, profesio: String) extends Persona

  val me: Persona = Profesor("Pedro", "Desarrollador")

  println(me)

  me match {
    case Profesor(nombre, profesion) => s"$nombre es $profesion"
    case Estudiante(nombre) => s"$nombre es estudiante"
  }

}

//disyunciones
//enfocados para cuendo se presentan nulos (some y None)
object disyunciones extends App {
  //(a y B)  o (A union B)
  //tratar los valores nulos como inexistentes para operar cuando el valor exista
  //verlos como listas de un elemento

  val opA = Option(2)
  println(opA)

  val opB = Option(null)
  println(opB)

  val list = List(1, 2, 3)
  println(list.find(x => x == 3))
  println(list.find(x => x == 3).map(_ + 1))

  println(list.find(x => x == 4))
  println(list.find(x => x == 4).map(_ + 1))

  val r1 = list.find(x => x == 3).map(x => list.headOption.map(y => x + y))
  println(r1)

  val r2 = list.find(x => x == 3).flatMap(x => list.headOption.map(y => x + y))
  println(r2)

  println(r2.get)
  println(opB.getOrElse(0))
}

// Try and either
// enfocado para cuendo se tienen exepciones ()
object tryExample extends App {

  final case class CustomException(private val message: String = "",
                                   private val cause: Throwable = None.orNull)
    extends Exception(message, cause)

  // Failure  y Success
  try {
          throw CustomException("some exception...")
  } finally {
    println("This will always be printed")
  }

  try {
    //      file.write(stuff)
  } catch {
    case e: java.io.IOException => // handle IO Exception
    case n: NullPointerException => // handle null pointer
  }

  val aTry = Try(1 / 0)
  //  val aTry = Try(Nil.head)

  println(aTry.map(x => s"$x"))

}

object eitherExample extends App {
  //  Convention dictates that Left is used for failure and Right is used for success.

  //El lado derecho es el unico definido por default [Nothing,Int] , map opera sobre el lado derecho

  println(Right(10).map(_ + 1))
  //println(Left(10).map(_ + 1))

  //se especifica ambos lados
  println(Left[Int, Int](10).map(_ + 1))

  val in = "2"
  val result: Either[String, Int] =
    try Right(in.toInt)
    catch {
      case e: NumberFormatException => Left(in)
    }

  result match {
    case Right(x) => s"You passed me the Int: $x, which I will increment. $x + 1 = ${x + 1}"
    case Left(x) => s"You passed me the String: $x"
  }
}

/**
 * 1. ¿Cómo obtener el primer y último carácter de la cadena "Hola" en Scala?
 * 2. Escriba un bucle for para calcular el producto del código Unicode (método toLong) de todas las letras de la cadena.
 * Por ejemplo, el producto de todas las cadenas en "Hola" es 9415087488L
 * 3. Escriba una función WordCount para contar el número de palabras en la cadena entrante
 * 4. Escriba una función llamada minmax (valores: Array [Int]), que devuelve una tupla con de los valores mínimo y máximo en el array
 * 5. Escribe una funcion que reciba una lista de objetos de tipo "Persona" y que al iterar la lista imprima a que tipo de persona
 * corresponde, deben de existir al menos estas tres:
 * Alumno(nombre, edad, materias), Profesor(nombre, edad, departamentoId), Oyente(nombre, edad) y Otro (Director, Suplente).
 *
 */


