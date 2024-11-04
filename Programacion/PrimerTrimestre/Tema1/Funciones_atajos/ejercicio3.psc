//Solicita al usuario una cadena de texto y un carácter. Luego, sustituye todas las apariciones
//del carácter en la cadena por un asterisco *.
//Ejemplo de salida: Para la entrada "banana" y el carácter "a", el resultado sería
//		"b*n*n*"
Funcion asterisco<- sustituirCaracter(cad, carac)
	Definir i Como Entero
	Definir asterisco Como Caracter
	
	asterisco = ""
	
	Para i = 0 Hasta Longitud(cad) Con Paso 1 Hacer
		Si(Subcadena(cad, i+1,i+1) == carac) Entonces
			asterisco = asterisco + "*"
		SiNo
			asterisco = asterisco + Subcadena(cad, i + 1, i + 1)
		FinSi
	Fin Para
	
	asterisco = Subcadena(cad,0,0) + asterisco
FinFuncion


Algoritmo ejercicio3
	Definir cad, carac, resultado Como Caracter
	
	Escribir "Introduce una cadena de caracteres"
	Leer cad
	
	Escribir "Ahora dime que caracter quieres sustituir por un asterisco"
	Leer carac
	
	resultado = sustituirCaracter(cad, carac)
	
	Escribir  resultado
	
FinAlgoritmo
