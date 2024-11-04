//Escribe un pseudocódigo que solicite una dirección de correo electrónico y luego extraiga y
//muestre el dominio (la parte después del símbolo @).
//Pistas:
//	ºUsa Longitud(cadena) para recorrer la cadena.
//	ºUsa SubCadena(cadena, desde, hasta) para obtener la parte del dominio.
//		Ejemplo de salida: Para la entrada "usuario@example.com", el resultado sería: example.com".
Funcion cadenaSeparada<- separarCadena(cad)
	Definir cadenaSeparada Como Caracter
	Definir i Como Entero
	
	Para i = 0 Hasta Longitud(cad) Con Paso 1 Hacer
		Si(Subcadena(cad,i,i) == "@") Entonces
			cadenaSeparada = Subcadena(cad, i + 1, Longitud(cad))
		FinSi

	Fin Para
	
FinFuncion


Algoritmo ejercicio2
	Definir cad, cadenaSeparada Como Caracter
	
	Escribir "itroduce tu correo"
	Leer cad
	
	cadenaSeparada = separarCadena(cad)
	
	Escribir cadenaSeparada
	
FinAlgoritmo
