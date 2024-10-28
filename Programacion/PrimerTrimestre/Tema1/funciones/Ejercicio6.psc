//Escribe un algoritmo ama que pida cinco precios y muestre por pantalla el precio de venta de
//cada uno tras aplicarle un 21% de IVA.
Funcion precio<- pedirPrecio(mensaje) 
	Definir precio Como Real
	Repetir
		Escribir mensaje
		Leer precio
		Si (precio < 0) Entonces
			Escribir "Error. No puedes terner menos de 0 años"
		FinSi
	Hasta Que precio >= 0
FinFuncion


Funcion conIva<- calcularPrecioIva
	Definir conIva Como Real
	sinIva = pedirPrecio("Introduce un precio")
	
	conIva = sinIva + (sinIva * 0.21)
FinFuncion

Algoritmo Ejercicio6
	Definir i, precio Como Real
	
	Para i = 0 Hasta 4 Con Paso 1 Hacer
		precio = calcularPrecioIva()
		Escribir "precio con iva " (i+1) ": " precio
	Fin Para
FinAlgoritmo
