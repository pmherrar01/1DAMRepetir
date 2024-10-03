Algoritmo Ejercicio3_1
	
	Definir num1 Como Entero
	Definir num2 Como Entero
	Definir num3 Como Entero
	
	Escribir "Introduce 3 numeros"
	
	Leer num1
	Leer num2
	Leer num3
	
	Si (num1 == num2 Y num1 == num3) Entonces
		Escribir "Los tres numeros son iguales"
		SiNo
			Si (num1 == num2  Y num1 > num3) Entonces
				Escribir "El primer numero " num1  " y el segundo numero " num2 " son iguales y son mayores que el tercer numero" num3
			SiNo
				Si (num1 == num3 Y num1 > num2) Entonces
					Escribir "El primer numero " num1  " y el tercer numero " num3 " son iguales y son mayores que el tercer numero" num2
				SiNo
					Si (num2 == num3 Y num2 > num1) Entonces
						Escribir "El segundo numero " num2  " y el tercer numero " num3 " son iguales y son mayores que el primer numero" num1
					Sino
						Si(num1 > num2 Y num1 > num3) Entonces
							Escribir "El mayor de los numeros " num1 ", " num2 ", " num3 " es el primer numero" num1
						Sino
							Si(num2 > num1 Y num2 > num3) Entonces
								Escribir "El mayor de los numeros " num1 ", " num2 ", " num3 " es el segundo numero " num2
							Sino
								Escribir "El mayor de los numeros " num1 ", " num2 ", " num3 " es el tercer numero " num3
						FinSi
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi
FinAlgoritmo
