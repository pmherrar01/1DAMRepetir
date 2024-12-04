Algoritmo metodoBurbuja
	Definir i, j, n, v1, aux Como Entero
	n = 4
	Dimensionar v1[n]
	
	Para  i = 0 Hasta n-1 Hacer
		Leer v1[i]
	FinPara
	
	Para i = 0 Hasta  n - 2	 Hacer
		Para j = 0 Hasta n - 2 Hacer
			Si(v1[j] > v1[j+1])
				aux = v1[j]
				v1[j] = v1[j+1]
				v1[j+1] = aux
			FinSi
		FinPara
	FinPara
	
	
	Para i = 0 Hasta  n-1 Hacer
		Escribir Sin Saltar "[" v1[i] "]"
	FinPara
	
FinAlgoritmo
