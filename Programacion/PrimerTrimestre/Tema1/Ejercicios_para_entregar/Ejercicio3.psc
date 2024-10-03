//Diseña un programa que calcule la letra de un DNI. Para ello:
	//	1º Pediremos el DNI por teclado al usuario.
		//2º Para calcular la letra, cogeremos el DNI y lo dividiremos entre 23
			//quedándonos con el resto de la división, que debe estar entre 0 y 22.
			//3º La fórmula para saber qué letra le corresponde al DNI es comprobar el
			//resto de la división con esta tabla:
				//POSICION LETRA
				//0 T
				//1 R
				//2 W
				//3 A
				//4 G
				//5 M
				//Ejercicios de programación
				//2
				//POSICION LETRA
				//6 Y
				//7 F
				//8 P
				//9 D
				//10 X
				//11 B
				//12 N
				//13 J
				//14 Z
				//15 S
				//16 Q
				//17 V
				//18 H
				//19 L
				//20 C
				//21 K
				//22 E
			//EJEMPLO: Por ejemplo, si introduzco 70588387, el resto de la división con 23
				//	será 7 que corresponde a ?F?.

Algoritmo Ejercicio3
	Definir dni Como Entero
	Definir letra Como Real
	
	Escribir "Dime tu DNI sin la letra"
	
	Leer dni
	
	letra = dni%23
	
	Segun letra Hacer
		Opcion 0:
			Escribir "La letra de tu DNI es T" 
		Opcion 1:
			Escribir "La letra de tu DNI es R"
		Opcion 2:
			Escribir "La letra de tu DNI es W"
		Opcion 3:
			Escribir "La letra de tu DNI es A"
		Opcion 4:
			Escribir "La letra de tu DNI es G"
		Opcion 5:
			Escribir "La letra de tu DNI es M"
		Opcion 6:
			Escribir "La letra de tu DNI es Y"
		Opcion 7:
			Escribir "La letra de tu DNI es F"
		Opcion 8:
			Escribir "La letra de tu DNI es P"
		Opcion 9:
			Escribir "La letra de tu DNI es D"
		Opcion 10:
			Escribir "La letra de tu DNI es X"
		Opcion 11:
			Escribir "La letra de tu DNI es B"
		Opcion 12:
			Escribir "La letra de tu DNI es N"
		Opcion 13:
			Escribir "La letra de tu DNI es J"
		Opcion 14:
			Escribir "La letra de tu DNI es Z"
		Opcion 15:
			Escribir "La letra de tu DNI es S"
		Opcion 16:
			Escribir "La letra de tu DNI es Q"
		Opcion 17:
			Escribir "La letra de tu DNI es V"
		Opcion 18:
			Escribir "La letra de tu DNI es H"
		Opcion 19:
			Escribir "La letra de tu DNI es L"
		Opcion 20:
			Escribir "La letra de tu DNI es C"
		Opcion 21:
			Escribir "La letra de tu DNI es K"
		Opcion 22:
			Escribir "La letra de tu DNI es E"
	FinSegun
FinAlgoritmo
