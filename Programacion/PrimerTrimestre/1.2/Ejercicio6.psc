//Cumpleaños.
//Marta va a realizar su fiesta de quince años. Por lo cual ha invitado a una gran
//cantidad de personas. Pero también ha decidido algunas reglas:
//	Que todas las personas con edades mayores a los quince años sólo pueden
//	entrar si traen regalos; que jóvenes con los quince años cumplidos entra
//	totalmente gratis pero los de menos de quince años no pueden entrar a la fiesta.
//Hacer un algoritmo donde se tome la edad de una persona y que requisito de los
//	anteriores le toca cumplir si quiere entrar.
//Ejemplo:
//> Por favor ingrese su edad:
//Para entrar tienes que traer regalo.
//Ejemplo:
//> Por favor ingrese su edad:
//> 15
//> Entras GRATIS? Bieen..

Algoritmo Ejercicio6
	Definir edad Como Entero
	
	Escribir  "Dime tu edad"
	
	Leer edad
	
	Si (edad == 15) Entonces
		Escribir  "Entras GRATIS... Bien"
	SiNo
		Si(edad > 15) Entonces
			Escribir "Para entrar tienes que tener regalo"
		SiNo
			Escribir "Tienes menos de 15 años no puedes entrar"
		FinSi
	FinSi
FinAlgoritmo

