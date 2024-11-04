//Escribe un pseudoc�digo que tome una cadena de texto y la muestre al rev�s.
//Pistas:
//	�Usa Longitud(cadena) para determinar el tama�o de la cadena.
//	�Usa SubCadena(cadena, desde, hasta) para obtener cada car�cter desde el
//	final hacia el inicio.
//	Ejemplo de salida: Para la entrada "Hola", el resultado ser�a "aloH".
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
