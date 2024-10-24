//Escribr un algoritmo que pida un valor entero en millas y muestre su equivalente en 
//km. Recuerda que una milla son 1,60934 km.

Funcion num<- pedirNum(mensaje)
	Definir num Como Real
	
	Escribir mensaje
	Leer num
	
FinFuncion

Funcion  km<- calcularKm(num)
	Definir km Como Real
	
	km = num * 1.60934
FinFuncion

Algoritmo Ejercicio5
	Definir millas, km Como Real
	
	millas = pedirNum("Introduce una cantidad de millas")
	km = calcularKm(millas)
	
	Escribir millas " millas son " km " km"
FinAlgoritmo
