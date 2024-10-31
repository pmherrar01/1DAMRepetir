//Explicacion de la recursividad
Funcion f<- factorialSecuencial(num)
	//Solucion secuencial
	Definir f Como Entero
	
	f = 1
	
	Para i = num Hasta 1 Con Paso -1 Hacer
		f = f * i
	Fin Para
	
FinFuncion

Funcion f<- factorialRecursiva(num)
	//solucion recursiva
	
	Si (num == 1)  Entonces //caso base (caso base es por donde el "bucle" de la recursividad sale, siempre tiene que haber un caso base o mas )
		f = 1
	SiNo
		f = num * factorialRecursiva(num - 1)
	FinSi
	
FinFuncion

Algoritmo algoritmoFactorial 
	Definir num Como Entero
	
	Escribir "Dime un numero"
	Leer num

	Escribir factorialSecuencial(num)

	Escribir  factorialRecursiva(num)
	
FinAlgoritmo
