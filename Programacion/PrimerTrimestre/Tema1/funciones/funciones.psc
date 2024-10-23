Funcion  datosAlumno(nombre, apellido1, apellido2)
	
	Escribir nombre
	Escribir apellido1
	Escribir apellido2
	
	
FinFuncion

Funcion mensaje(mensaje1)
	
	Escribir mensaje1
	
FinFuncion

Funcion  mayor <- retornarMAyor(a, b)
	mayor = Falso
	Si a < b Entonces
		mayor = Verdadero
	FinSi
FinFuncion


Algoritmo funciones
	Definir nombre, apellido1, apellido2 Como Caracter
	
	nombre = "Pablo"
	apellido1 = "Herrera"
	apellido2 = "Rodriguez"
	
	datosAlumno(nombre, apellido1, apellido2)
	
	mensaje("Hola")
	
FinAlgoritmo
