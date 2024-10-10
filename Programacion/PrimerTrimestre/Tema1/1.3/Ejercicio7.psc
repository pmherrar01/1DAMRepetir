//Diseña un algoritmo que lea 10 números no nulos y
//luego muestre un mensaje de si ha leido algun numero negativo o no

Algoritmo Ejercicio7
	
	Definir num Como Entero
	Definir i Como Entero
	Definir numNegativo Como Logico
	
	numNegativo = Falso
	i = 0
	
	Repetir
		Escribir "introduce un numero distinto de 0"
		Leer num
		Si num == 0 Entonces
			Escribir "Error tiene que ser distinto de 0"
		SiNo
			i = i + 1
			Si (num < 0) Entonces
				numNegativo = Verdadero
			FinSi
		FinSi
	Hasta Que i == 10
	
	Si (numNegativo) Entonces
		Escribir "Si has introducido un numero negativo"
	SiNo
		Escribir "No has introducido ningun numero negativo"
	FinSi
FinAlgoritmo
