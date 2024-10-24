//Escribe un algoritmo que pida un numero entero por teclado y muestre por pantalla si es 
//positivo, negativo o cero.

Funcion num<- pedirNum(mensaje)
	Definir num Como Entero
	
	Escribir mensaje
	Leer num

FinFuncion

Funcion resultado<- dimeSigno(num)
	Definir resultado Como Entero
	
	Si (num == 0) Entonces
		resultado = 0
	Sino
		Si (num < 0 ) Entonces
			resultado = -1
		SiNo
			resultado = 1
		FinSi
	FinSi
FinFuncion

Algoritmo Ejercicio4
	Definir num, resultado Como Entero
	
	num = pedirNum("Introdue un numero entero")
	
	resultado = dimeSigno(num)
	
	Si (resultado == 0) Entonces
		Escribir num " es 0"
	Sino
		Si (resultado == -1) Entonces
			Escribir num " es negativo"
		SiNo
			Escribir num " es positivo"
		FinSi
	FinSi
FinAlgoritmo
