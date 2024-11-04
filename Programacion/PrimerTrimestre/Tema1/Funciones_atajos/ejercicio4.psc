//Escribe un pseudocódigo que tome una cadena de texto y la muestre al revés.
//Pistas:
//	ºUsa Longitud(cadena) para determinar el tamaño de la cadena.
//	ºUsa SubCadena(cadena, desde, hasta) para obtener cada carácter desde el
//	final hacia el inicio.
//	Ejemplo de salida: Para la entrada "Hola", el resultado sería "aloH".
Funcion resultado<- cadenaAlReves(cad)
	Definir resultado Como Caracter
	Definir i Como Entero
	
	resultado = ""	
	Para i = Longitud(cad) Hasta 0 Con Paso -1 Hacer
		resultado = resultado + Subcadena(cad,i,i) 
	Fin Para
FinFuncion


Algoritmo ejercicio4
	Definir cad, resultado Como Caracter
	
	Escribir "Introducce una palabra"
	Leer cad
	
	resultado = cadenaAlReves(cad)
	
	Escribir resultado
FinAlgoritmo
