//Diseña un algoritmo que lea 10 numeros no nulos y
//luego muestre un mensaje indicando cuantos son positivos y cuantos negativos
Algoritmo Ejercicio5
	Definir  num Como Entero
	Definir contPositivos Como Entero
	Definir contNegativos Como Entero
	Definir i Como Entero
	
	i = 0
	contNegativos = 0
	contPositivos = 0
		Repetir
			Escribir "introduce un numero distinto de 0"
			Leer num
			Si num == 0 Entonces
				Escribir "Error tiene que ser distinto de 0"
			SiNo
				i = i + 1
				Si num < 0 Entonces
					contNegativos = contNegativos + 1
				SiNo
					contPositivos = contPositivos + 1
				FinSi
			FinSi
		Hasta Que i == 10
		
		Escribir "Has escribido un total de " contNegativos " numeros negativos y un total de " contPositivos " numeros positivos"
FinAlgoritmo
