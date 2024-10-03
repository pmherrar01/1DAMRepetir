Algoritmo Ejercicio5
	Definir salario Como Real
	
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
			Si (salario >= 15001 Y salario <= 20000) Entonces
				salario = salario + salario * 0.05 
				Escribir "Su salario se a incrementado un 5%. Su nuevo salario es: " salario
			SiNo
				salario = salario + salario * 0.03 
				Escribir "Su salario se a incrementado un 3%. Su nuevo salario es: " salario
			FinSi
		FinSi
	FinSi
FinAlgoritmo
