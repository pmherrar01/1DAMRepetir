//Escribe un pseudoc�digo que cuente cu�ntas palabras hay en una cadena ingresada por el
//usuario (las palabras est�n separadas por espacios).
//Ejemplo de salida: Para la entrada "Hola, �c�mo est�s?", el resultado ser�a 3	palabras.
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
