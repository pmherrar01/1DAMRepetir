//Realizar un programa en PSeint que nos permita mostrar en pantalla un menú de opciones de la siguiente manera:
	
	//Elige una opción
	
	//1. Calcular Factorial
	
	//2. Mostrar los primeros N números de Fibonacci
	
	//3. Dibujar Pirámide de * 
	
	//4. Salir
	
	//El usuario deberá elegir una de las 4 opciones presentadas. Cada opción llamará a una función que realizará el proceso (el código de cada una de ellas ya lo tenéis desarrollado en otras actividades). 
		
		//El proceso debe repetirse en el algoritmo principal hasta que el usuario introduzca el valor 4 que corresponde a Salir o Finalizar la aplicación.
Funcion num<- pedirNum(mensaje)
	Repetir
		Escribir mensaje
		Leer num
		Si (num < 0 ) Entonces
			Escribir "Error el numero tiene que ser positivo"
		FinSi
	Hasta Que num > 0
FinFuncion



Funcion piramide(mensaje)
	Definir num, i, j, a  Como Entero
	
	num = pedirNum("Introduce un numero")
	
	
	Para i = 1 Hasta num Con Paso 1 Hacer
		
		Para j = 1 Hasta (num-i) Con Paso 1 Hacer
			Escribir Sin Saltar " "
		Fin Para
		
		Para a = 1  Hasta i Con Paso 1 Hacer
			Escribir sin saltar "*"
		Fin Para
		
		Para j =1 Hasta (i)-num Con Paso 1 Hacer
			Escribir Sin Saltar " "
		Fin Para
		
		Para a = 2  Hasta i Con Paso 1 Hacer
			Escribir sin saltar "*"
		Fin Para
		
		Escribir  " "
	Fin Para
	

	
FinFuncion
Funcion menu(mensaje)
	Definir num Como entero
	Escribir mensaje
	Repetir
		Escribir		"1- Calcular Factoriral "
		Escribir		"2- Mostrar los primeros N números de Fibonacci "
		Escribir		"3- Dibujar Pirámide de *"
		Escribir		"4- Salir: "
		Leer num
		
		Segun num Hacer
			
			1:
				
			2:
			
			3:
			piramide("Dime de cuanto de grande va a ser la piramide")
			De Otro Modo:
				Escribir "Saliendo..."
		FinSegun
	Hasta Que num == 4
FinFuncion

Algoritmo ejercicioParaEntregar
	menu("Elige una opcion")
FinAlgoritmo
