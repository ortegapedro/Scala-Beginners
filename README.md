
## Ejercicios
Scala for begginners

###Ejercicio 1:

Cierta persona encargada del cifrado de caracteres requiere de un programa que le permita pasar una vocal a otro
carácter, las correspondencias son las siguientes:

a = L

e = 9

i = $

o = R

u = 4

Ejercicio: Implementa la lógica correspondiente para que la persona pueda terminar su día laboral.

def encryptVowel(vowelsList: List[Char]): List[Char] = ???

NOTA: La persona tiene estrictamente prohibido realizar la correspondencia a través de sentencias match, case o if
puesto que estaría violando su contrato. No hagas que pierda su empleo :(

Ejemplo de entrada y salida:

encryptVowel(List('a', 'i', 'e', 'a')) => List(L, $, 9, L)
encryptVowel(List('a')) => List(L)
encryptVowel(List('i', 'e')) => List($, 9)

###Ejercicio 2:

Una hamburguesería famosa tiene un sistema que le permite establecer un ingrediente principal en un producto y
generar N subproductos basados en el primero, por ejemplo:

 Establecer el ingrediente carne para una hamburguesa
  Crear una hamburguesa de carne con queso
  Crear una hamburguesa de carne con cebolla
  Crear una hamburguesa de carne con cebolla, queso y pepinillo
 Establecer el ingrediente champiñón para una hamburguesa
  Crear una hamburguesa de champiñones y queso
  Crear una hamburguesa de champiñones, queso y papas

Ejercicio: Utilizando el concepto de funciones de orden superior implementa un método que dé soporte al flujo
previamente descrito.

Nota: Considera los ingredientes con un tipo de dato String

###Ejercicio 3:


Utilizando el concepto de funciones de orden superior implementa un método que pueda recibir un String,
ejecutar alguna operación con este String (el consumidor establece el comportamiento) y retornar un String,
en caso de que la ejecución falle se deberá propagar una custom exception llamada HigherOrderFunctionException.

###Ejercicio 4:

El triángulo de Pascal es una representación de los coeficientes binomiales ordenados en forma de triángulo.
Es llamado así en honor al filósofo y matemático francés Blaise Pascal.

Te mostramos una representación del triángulo de Pascal:

                     1
                     
                   1    1
                   
                1    2    1
                
             1    3    3    1
             
         1     4     6     4     1
           
      1     5    10    10     5     1

...

Este triángulo puede crecer en renglones tanto como nosotros queramos (o la memoria de la computadora lo permita),
te explicamos brevemente su funcionamiento:

  1. El renglón 1 del triángulo contiene los elementos [1]
  2. El renglón 2 del triángulo contiene los elementos [1, 1]
  3. El renglón 3 del triángulo contiene los elementos [1, 2, 1]
    Nótese que el dos es la suma de los dos elementos que tiene encima de él en el renglón pasado [1, 1] -> 1 + 1 = 2
  4. El renglón 4 del triángulo contiene los elementos [1, 3, 3, 1]
    Nótese que el primer tres resaltado en negritas [1, 3, 3, 1] es la suma de los elementos que tiene encima de él en el triángulo [1,2,1] -> 1 + 2 = 3
    Nótese que el segundo tres resaltado en negritas [1, 3, 3, 1] es la suma de los elementos que tiene encima de él en el triángulo [1,2,1] -> 2 + 1 = 3
  5. Podemos seguir la iteración hasta el renglón que queramos y el comportamiento será el mismo (Nota que el primer elemento y el último de todos los renglones es 1)
  6. No consideramos como válido el renglón cero o negativos.
  7. El renglón N del triángulo de Pascal está definido por el renglón N-1 del mismo triángulo que a su vez está definido por el renglón N-2.

Ejercicio: Implementa una solución recursiva para obtener el renglón N del triángulo. Utiliza la siguiente firma como base para tu ejercicio.

def pascalTriangle(rowNumber: Int): List[Int] = ???

En caso de entrar en un flujo no permitido deberá propagarse una custom Exception llamada PascalRowException

Ejemplo de uso y salida:
pascalTriangle(-1) => PascalRowException
pascalTriangle(0) => PascalRowException
pascalTriangle(1) => List(1)
pascalTriangle(2) => List(1,1)
pascalTriangle(3) => List(1,2,1)
pascalTriangle(4) => List(1,3,3,1)

###Ejercicio 5:


Por situaciones que se escapan a nuestro entendimiento ha sucedido una calamidad espacio-temporal y te has convertido
en un estudiante universitario.
Te encuentras en la recta final del semestre y recuerdas que tienes un proyecto pendiente  que habías estado posponiendo,
los requerimientos son los siguientes:

Se requiere generar Nodos que cuenten con lo siguiente: Nombre, Descripción; el acceso a estos datos no puede ser directo
ni para lectura ni para escritura. Las estructuras Nodo deben poder relacionarse entre ellas a través de Aristas las
cuales unen dos Nodos, las Aristas deben poder contener un dato adicional llamado Etiqueta el cual una vez establecido
no puede ser modificado pero sí leído de forma indirecta.

Las estructuras antes creadas (Nodos y Aristas) forman parte de una estructura mayor (DataStructure) que cuenta
con N nodos y aristas, la cual a su vez, deberá contener los siguientes datos Nombre, Descripción los cuales deberán
poder cambiarse en el momento que se requiera.

Por último, existe una estructura mucho mayor (DataStructureForest) que está conformada por N estructuras (DataStructure)
y que cuenta con una propiedad llamada Nombre, la cual una vez establecida no deberá ser modificada pero sí leida.

Todas las estructuras deberán tener una implementación para poder recuperar su estructura entera como String

Ejercicio: Realiza el modelado y crea las clases, métodos, atributos correspondientes a lo que se te pide para que la
continuidad espacio-temporal sea restablecida.

###Ejercicio 6:

Una famosa empresa de desarrollo de software tiene una biblioteca heredada que cuenta con las siguientes definiciones:

case class Catalog(index: Int, value: String)
case class Address(index: Int, street: String, name: String)
case class Product(index: Int, name: String, tax: Double)

Actualmente se encuentran en un conflicto ya que requieren convertir variables de tipo Int a cualquiera de las tres
estructuras antes mencionadas pero no pueden realizar métodos independientes para llevar a cabo sus tareas.
Se requiere hacer el casteo directamente en la instancia Int como si de un método nativo se tratara, similar a un 20.toString

Ejercicio.
Ayuda a la empresa a resolver su problemática implementando una solución que permita hacer lo siguiente:
20.toCatalog() => Catalog(20,)
20.toAddress() => Address(20,,)
20.toProduct() = Product(20,,0.0)
20.toCatalog(value) = Catalog(20,value)
20.toAddress(street, name) => Address(20,street,name)
20.toProduct(name, tax) => Product(20,name,tax)

###Ejercicio 7:

Se tiene una lista de nombres y una lista de consulta de nombres. Para cada consulta, se debe determinar cuántas veces
aparece en la lista de nombres.
Por ejemplo, teniendo como entradas:
nombres = [“Brenda”,”Brenda”,”Jorge”,”Anais”] y consulta = [“Jorge”,”Brenda”,”Angelica”]

Se encuentra 1 vez Jorge, 2 veces Brenda y 0 veces Angelica. Se debe retornar una lista con el número de ocurrencias,
por lo que en este caso retornaremos la lista:
resultados = [1,2,0]

Completa la siguiente función:
def consultaNombres (List[String], List[String]): List[Int]


###Ejercicio 8:

Se requiere implementar una función que calcule el peso de una persona dependiendo en qué planeta se encuentre.
Recordando que la fórmula es la siguiente
P = m x g
Donde:
P = peso, m = masa, g = aceleración gravitacional
La aceleración gravitacional varía dependiendo el planeta, se deberá calcular para los siguientes:

Planeta     g
Mercurio    3.70
Tierra      9.81
Saturno     11.67

Utilizando funciones de orden superior obten el peso en cada planeta, solo puedes implementar una sola función
para resolver el problema
def calcularPeso ...

val pesoMercurio = mercurio (70)
val pesoTierra = tierra (70)
val pesoSaturno = saturno (70)


###Ejercicio 9:

Se requiere implementar una función que resuelva una ecuación de segundo grado, se deberán poder calcular cuando se suma
y cuando se resta, recibiendo como argumentos el valor cuadrático, el lineal y el constante.
Se deberá utilizar una función de orden superior.
La expresión if está prohibida en este ejercicio.

x = (-b +/- √(b^2 - 4ac) ) / (2a)

Para obtener los valores de x de la siguiente ecuación: x² - 5x + 6 = 0
Se debe ejecutar algo parecido a lo siguiente:

ecuacionSegundoGrado(x1, 1, -5, 6) => 3.0 (cuando es suma)
ecuacionSegundoGrado(x2, 1, -5, 6) => 2.0 (cuando es resta)


###Ejercicio 10:

Escribe una función que reciba un número entero y retorne su representación en binario, octal y Hexadecimal,
también es necesario que pueda retornar el valor concatenado de los posibles tres valores.
Notas:
En caso de que no se envíe una de las cuatro posibles opciones(BINARY, OCTAL, HEXADECIMAL, ALL) se deberá lanzar
una excepción de tipo ConvertException
  No hacer uso de if else
  Completa la siguiente función: def convertDecimalTo( convertTo: String, value: Int ) : String
  

###Ejercicio 11:

Implementar la clase llamada Hexadecimal, la cual deberá sobrecargar las operaciones de suma y resta.
Es necesario que el método getStringHexa retorne como String la representación hexadecimal de la operación.

Ejemplo:
A(Hexa) + 11 (decimal) => 1b (Hexa)
5(decimal) + 6 (decimal) => b (Hexa)
5(Hexa) + 6(Hexa) => b (Hexa)
Crea la clase Hexadecimal extendiendo de HexaTrait.

Ejemplo de uso de la clase
    val hexaA = new Hexadecimal(10)
    val hexaB = new Hexadecimal(11)

    assert((hexaA + 4).getStringHexa().equals("e"))
    assert((hexaA - 5).getStringHexa().equals("5"))

    assert((hexaB + hexaA).getStringHexa().equals("15"))
    assert((hexaB - hexaA).getStringHexa().equals("1"))

    assert((6 + 10).getStringHexa().equals("10"))
    assert((20 - 5).getStringHexa().equals("f"))

HINT: Recuerde considerar los siguientes casos
	Decimal	op	Decimal
	Decimal 	op  	Hexadecimal
	Hexadecimal 	op   	Decimal
	Hexadecimal  	op   	Hexadecimal