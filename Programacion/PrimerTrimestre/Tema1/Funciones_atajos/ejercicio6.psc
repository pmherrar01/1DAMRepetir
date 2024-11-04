//Escribe un pseudocódigo que cuente cuántas palabras hay en una cadena ingresada por el
//usuario (las palabras están separadas por espacios).
//Ejemplo de salida: Para la entrada "Hola, ¿cómo estás?", el resultado sería 3	palabras.
Funcion total<- contarPalabras(cad) 
	Definir total,i Como Entero
	
	total = 0
	
	Para i = 0 Hasta Longitud(cad) Con Paso 1 Hacer
		Si(Subcadena(cad, i,i) == " ") Entonces
			total = total + 1
		FinSi
	Fin Para
	
	Si Longitud(cad) > 0 Entonces
		total = total + 1
	FinSi
	
FinFuncion

Algoritmo ejercicio6
	Definir cad Como Caracter
	Definir total Como Entero
	
	Escribir "Introduce unna frase"
	Leer cad
	
	total = contarPalabras(cad)
	
	Escribir "Para la frase: " cad " tiene un total de " total " palabras"	
FinAlgoritmo
