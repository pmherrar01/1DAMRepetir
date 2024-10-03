//Diseñar un programa que muestre el producto de los 10 primeros números
//impares.

Algoritmo Ejercicio7
	
	Definir producto Como Entero
	Definir i Como Entero
	
	i = 0
	producto = 1
	
	Mientras i <= 20 Hacer
		Si(i % 2 <> 0) Entonces
			producto = producto * i
			Escribir "numero impar: " i 
		SiNo
			Si(i == 20 )
				Escribir "Producto: " producto
			FinSi
		FinSi
		i = i + 1
	Fin Mientras
	
FinAlgoritmo
