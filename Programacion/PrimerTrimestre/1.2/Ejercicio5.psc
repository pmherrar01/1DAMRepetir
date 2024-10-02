Algoritmo Ejercicio5
	Definir salario Como Entero
	
	Escribir "Introduzca su salario"
	
	Leer salario
	
	Si (salario >= 0 Y salario <= 9000) Entonces
		salario = salario + salario * 0.2 
		Escribir "Su salario se a incrementado un 20%. Su nuevo salario es: " salario
	SiNo
		Si(salario >= 9001 Y salario <= 15000) Entonces
			salario = salario + salario * 0.1 
			Escribir "Su salario se a incrementado un 10%. Su nuevo salario es: " salario
		SiNo
		FinSi
	FinSi
FinAlgoritmo
