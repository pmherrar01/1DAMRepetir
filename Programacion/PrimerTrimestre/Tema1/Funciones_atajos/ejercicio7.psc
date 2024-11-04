//Escribe un pseudocódigo que solicite al usuario una frase y genere un acrónimo con la
//primera letra de cada palabra en mayúsculas.
//Ejemplo de salida: Para la entrada "organización de las naciones unidas", el
//		resultado sería "ODLNU".

Funcion acronimo<- crearAcronimo(cad)
	Definir acronimo Como Caracter
	Definir i Como Entero
	
	acronimo = ""
	
	Para i = 0 Hasta Longitud(cad) Con Paso 1 Hacer
		Si(Subcadena(cad, i,i) == " ") Entonces
			acronimo = acronimo + Subcadena(cad,i+1,i+1)
		FinSi
	Fin Para
	
	acronimo = Subcadena(cad,0,0) + acronimo
	
	acronimo = Mayusculas(acronimo)
	
FinFuncion

Algoritmo ejercicio7
	Definir cad, acronimo Como Caracter
	
	Escribir "Introduce un frase"
	Leer cad
	
	acronimo = crearAcronimo(cad)
	
	Escribir "El acronimo de la frase introsucida es: " acronimo 
	
FinAlgoritmo
