Algoritmo Ejercicio3
	//Desarrolar un programa que permita la carga de 10 valores por teclado y calcule la suma del total de ellos y 
	//posteriormente su promedio
	
	
	Definir num Como Entero
	Definir i Como Entero
	Definir suma Como Entero
	Definir media Como Real
	
	i  = 0
	media = 0
	suma = 0
	
	Repetir
		Escribir "Dime un numero"
		Leer num
		i = i+1
		suma = suma +  num
	Hasta Que i == 10
	
	Escribir  "La suma de los numeros es: " suma
	
	media = (suma/10)
	
	Escribir "La media de los numeros es: " media
	
	
	
FinAlgoritmo
