//Diseña un programa que realice la opción seleccionada de acuerdo con
//el siguiente menú:
	//a.- Área del triángulo (Solicitar base y altura)
	//b.- Área del Cuadrado (Solicitar lado)
	//c.- Área del Círculo (Solicitar radio)
	//d.- Área del Rectángulo (Solicitar base y altura)
	//¡¡Nota!! Es decir, si el usuario pulsa la letra o carácter ?a? el programa pide al
	//	usuario que introduzca la base y altura del triángulo y calcula su área.

Algoritmo Ejercicio1
	Definir letra Como Caracter
	Definir base, altura, lado, radio, area Como Real
	
	Escribir "a.- Calcular área del trienagulo"
	Escribir "b.- Calcular área del Cuadrado"
	Escribir "c.- Calcular área del Circulo"
	Escribir "d.- Calcular área del Rectangulo"
	
	Leer  letra
	
	Segun letra Hacer
		"a":
			Escribir "Dime la longitud de la base"
			Leer base
			Escribir "Dime la longitud de la altura"
			Leer altura
			
			area = (base * altura)/2
			
			Escribir "El area del triangulo con base " base " y altura " altura " es de " area 
			
		"b":
			Escribir "Dime la longitud de un lado"
			Leer lado
			area = lado * lado
			
			Escribir "El area de un cuadrado con lado " lado "  es de " area 
		"c":
			Escribir "Dime la longitud del radio"
			Leer radio 
			area = pi * (radio * radio)
			
			Escribir "El area de un circulo cuyo  radio es de " radio " es de " area
		De Otro Modo:
			Escribir "Dime la longitud de la base"
			Leer base
			Escribir "Dime la longitud de la altura"
			Leer altura
			
			area = base * altura
			
			Escribir  "El area de un rectangulo cuya base es de " base " y la altura de " altura " es de " area
	Fin Segun
FinAlgoritmo
