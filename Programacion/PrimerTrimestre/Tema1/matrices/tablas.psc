Algoritmo tablas
	Definir t, n,i,j Como Entero
	n = 10
	Dimensionar t[n,n]
	
	//Inicialiar t a 0
	Para i = 0 Hasta n-1 Con Paso 1 Hacer
		Para j = 0 Hasta n-1  Con Paso 1 Hacer
			t[i,j] = 0
		Fin Para
	Fin Para
	
	Para i = 0 Hasta n-1 Con Paso 1 Hacer
		Para j = 0 Hasta n-1  Con Paso 1 Hacer
			Escribir Sin Saltar "[" t[i,j] "]"
		Fin Para
		Escribir ""
	Fin Para
FinAlgoritmo
