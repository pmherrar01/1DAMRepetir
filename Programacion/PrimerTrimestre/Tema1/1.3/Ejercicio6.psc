//Diseña un algoritmo que sume independentemente los pares y los impares
//de los números comprendidos entro 0 y 100, y luego muesrtra por pantalla ambas sumas

Algoritmo Ejercicio6
	Definir i Como Entero
	Definir contPares Como Entero
	Definir contImpares Como Entero
	
	contImpares = 0
	contPares = 0
	
	Para i = 0  Hasta 99 Con Paso 1 Hacer
		Si (i % 2 == 0) Entonces
			contPares = contPares + 1
		SiNo
			contImpares = contImpares + 1
		FinSi
	Fin Para
	
	Escribir "Hay un total de " contPares " numeros pares y un total de " contImpares " numeros impares"
FinAlgoritmo
