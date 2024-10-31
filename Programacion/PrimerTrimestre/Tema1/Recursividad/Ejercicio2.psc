Funcion binario <- calcularBinario(a)
	Si (a < 2) Entonces
		binario = a
	SiNo
		Escribir Sin Saltar calcularBinario(TRUNC(a/2)) a % 2
	FinSi
FinFuncion

Algoritmo Ejercicio2
	Definir a Como Entero
	Escribir "Introduce un numero"
	Leer a
	
	Escribir calcularBinario(a)
FinAlgoritmo
