//Realiza un algoritmo que pida introducir tres valores enteros y nos diga cuál de ellos es el más
//elevado. Impleméntalo creando únicamente una función a la que le pasemos dos valores (no
//tres) y nos devuelva el máximo de los dos valores.
Funcion num<- pedirNum(mensaje) 
	Definir num Como Real
	
	Escribir mensaje
	Leer num
	
FinFuncion

Funcion numMayor<- calcularMayor(num1, num2)
	Si (num1 > num2) Entonces
		numMayor = num1
	SiNo
		numMayor = num2
	FinSi
FinFuncion

Algoritmo Ejercicio9
	Definir num1, num2, num3, i Como Real
	num1 = pedirNum("Introduce un numero entero")
	num2 = pedirNum("Introduce un numero entero")
	num3 = pedirNum("Introduce un numero entero")

	i = calcularMayor(calcularMayor(num1, num2), num3)
	
	Escribir "el numerp mayor es: " i 
FinAlgoritmo
