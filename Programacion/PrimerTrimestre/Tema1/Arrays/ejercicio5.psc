//Leer 10 numeros por teclado, 5 iran en un array y 5 para otro array distinto.
//Finalmente juntar los 2 arrays en uno solo y mostrando por pantalla.
Funcion mostrarVector(v)
	Definir i, n Como Entero
	n = 5
	
	Para i = 0 Hasta n-1 Con Paso 1 Hacer
		Escribir Sin Saltar "[" v[i] "]"
	Fin Para
	
FinFuncion


Algoritmo ejercicio5
	Definir v1,v2,v3,n, i Como Entero
	n = 5
	Dimensionar v1[n], v2[n], v3[10] 
	
	Escribir "introduce un numero para el primer array"
	Para i = 0 Hasta n-1 Con Paso 1 Hacer
		Leer v1[i]
		Si (i <> n) Entonces
			Escribir "introduce otro numero"
		FinSi
	Fin Para
	
	
	Escribir "introduce un numero para el segundo array"
	Para i = 0 Hasta n-1 Con Paso 1 Hacer
		Leer v2[i]
		Si (i <> n) Entonces
			Escribir "introduce otro numero"
		FinSi
	Fin Para
	Escribir "Vector 1"
	mostrarVector(v1)
	Escribir " "
	Escribir "Vector 2"
	mostrarVector(v2)
	
	Para i = 0 Hasta n-1 Con Paso 1 Hacer
		v3[i] = v1[i]
		v3[i+n] = v2[i]
	Fin Para
	
	Escribir " "
	Escribir "Vector 3:"
	Para i = 0 Hasta (n*2)-1 Con Paso 1 Hacer
		Escribir Sin Saltar "[" v3[i] "]"
	Fin Para
FinAlgoritmo
