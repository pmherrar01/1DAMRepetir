//2. Escribe un algoritmo que pida la edad por teclado y muestre por pantalla si eres mayor de edad o no

Funcion edad<- pedirEdad(mensaje)
	Definir edad Como Entero
	
	Repetir
		Escribir mensaje
		Leer edad
		Si (edad < 0) Entonces
			Escribir "Error. No puedes terner menos de 0 años"
		FinSi
	Hasta Que edad >= 0
	
FinFuncion

Funcion mayorDeEdad<- esMayorDeEdad(edad)
	Definir mayorDeEdad Como Logico
	
	mayorDeEdad = Falso
	
	Si (edad >= 18) Entonces
		mayorDeEdad = Verdadero
	FinSi
	
FinFuncion

Algoritmo ejercicio2
	Definir edad Como Entero
	Definir esMayor Como Logico
	
	edad = pedirEdad("Dime tu edad")
	
	esMayor = esMayorDeEdad(edad)
	
	Si (esMayor) Entonces
		Escribir "Eres mayor de edad"
	SiNo
		Escribir "Eres menor de edad"
	FinSi
FinAlgoritmo
