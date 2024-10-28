//Escribe un algoritmo que pida el ancho y alto de un rectángulo y muestre por pantalla su área y
//su perímetro.
Funcion medida<- pedirMedida(mensaje) 
	Definir medida Como Real
	Repetir
		Escribir mensaje
		Leer medida
		Si (medida <= 0) Entonces
			Escribir "Error. No puede tener una longitud menor o igual a 0"
		FinSi
	Hasta Que medida >= 0
FinFuncion

Funcion area<- calcularAlrea (ancho, largo)
	Definir area Como Real
	
	area = ancho * largo
FinFuncion

Funcion perimetro<- calcularPerimetro(ancho, largo)
	Definir  perimetro Como Real
	
	perimetro = (largo*largo) + (ancho * ancho)
FinFuncion

Algoritmo Ejercicio7
	Definir ancho, alto, area, perimetro Como Real
	
	ancho = pedirMedida("Ancho del rectangulo: ")
	largo = pedirMedida("Largo del rectangulo: ")
	
	area = calcularAlrea(ancho,largo)
	perimetro = calcularPerimetro(ancho, largo)
	
	Escribir "El area de un rectangulo con largo: " largo " y ancho: " ancho " es: " area ". Y el perimetro es: " perimetro
	
FinAlgoritmo
