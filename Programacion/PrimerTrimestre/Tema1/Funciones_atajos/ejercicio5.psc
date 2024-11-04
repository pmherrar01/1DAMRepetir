//Solicita al usuario dos cadenas de texto y verifica si son iguales, sin importar si están en
//mayúsculas o minúsculas.
//Ej de salida: Para las entradas "Hola" y "HOLA", el resultado sería Son iguales.

Funcion iguales<- comprarCadenas(cad1, cad2)
	Definir iguales Como Logico
	Definir cad1Mayus, cad2Mayus Como Caracter
	
	iguales = Falso	
	cad1Mayus = Mayusculas(cad1)
	cad2Mayus = Mayusculas(cad2)
	
	Si (cad1Mayus == cad2Mayus) Entonces
		iguales = Verdadero
	FinSi
FinFuncion

Algoritmo ejercicio5
	Definir iguales Como Logico
	Definir cad1, cad2 Como Caracter
	
	Escribir "Introduce una cadena de texto"
	Leer cad1
	Escribir "Introduce otra cadena de texto"
	Leer cad2
	
	iguales = comprarCadenas(cad1,cad2)
	
	Si (iguales)
		Escribir "Las cadenas (" cad1 ") y (" cad2 "), son iguales"
	SiNo
		Escribir "Las cadenas (" cad1 ") y (" cad2 "), no son iguales"
	FinSi
FinAlgoritmo
