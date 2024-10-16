//Diseña un algoritmo que calcule el factorial de un numero 

Algoritmo ejercicio11
	Definir num, i, factorial Como Entero
	
	factorial = 1
	
	Escribir "Dime un numero para decirte su factorial"
	Leer num
	
	Para i = 1 Hasta num Con Paso 1 Hacer
		factorial = factorial * i
	Fin Para
	Escribir "EL factoraial de " num " es: " factorial
	
FinAlgoritmo
