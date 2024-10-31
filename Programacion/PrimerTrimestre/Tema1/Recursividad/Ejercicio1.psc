//Escribe una funci髇 recursiva que calcule la potencia de un n鷐ero entero a elevado a b,
//es decir, a^b, sin utilizar el operador de potencia.
//Entrada:
//	Dos enteros, a y b, donde b>=0
//Salida:
//	El valor de a^b (a elevado a b).
//Ejemplo:
//		Entrada: a=3, b=4
//		Salida: 81 (ya que 3^4 = 3󫢫�3 = 81)
//Sugerencia:
//	El caso base es cuando b=0, en cuyo caso cualquier n鷐ero elevado a cero es 1. Para
//		otros valores, la funci髇 debe llamarse a s� misma con b?1 y multiplicar el resultado por a
Funcion potencia<- calcularPotencia(a,b)
	
	Si (b == 0) Entonces
		potencia = 1
	SiNo
		potencia = a * calcularPotencia(a,b-1)
	FinSi

FinFuncion


Algoritmo Ejercicio1
	Definir a,b Como Entero
	
	Escribir "Introduce un numero"
	Leer a
	
	Repetir
		Escribir "Introduce otro numero"
		Leer b
	Hasta Que b >= 0
	
	Escribir calcularPotencia(a,b)
FinAlgoritmo
