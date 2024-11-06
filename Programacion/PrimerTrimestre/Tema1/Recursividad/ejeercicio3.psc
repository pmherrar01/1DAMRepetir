//Escribe una función recursiva que reciba un número entero positivo ?? y devuelva la suma de
//sus dígitos. Este tipo de problema es útil para aprender a manipular números y comprender
	//cómo dividir un problema en pasos más pequeños.
//Entrada:
//	Un número entero positivo ??.
//Salida:
	//La suma de los dígitos de ??
//Ejemplo:
//? Entrada: 1234
//? Salida: 10 (ya que 1+2+3+4=10)
//Sugerencia:
//	El caso base ocurre cuando ?? es un solo dígito (entre 0 y 9), en cuyo caso se retorna
	//?? mismo. Para otros valores, la función debe llamarse a sí misma con ?? //10 (eliminando el
		//último dígito) y sumar ??%10 (el último dígito).
	//NOTA: Como la división entera ( Por ejemplo 5 división entera entre 2 es 2 ? 5 / 2 = 2 )
		//no está implementada en PSEINT, podemos hacer uso de la función TRUNC(numero) de
		//PSEINT que devuelve la parte entera de un número real.
Funcion total <- sumaDigitos(num)
	Si (num >= 0 Y num <= 9) Entonces
		total = num
	SiNo
		total = sumaDigitos(TRUNC(num / 10)) + (num % 10)
	FinSi
FinFuncion

Algoritmo ejercicio3
	Definir num Como Entero
	
	Escribir "Introduce un número entero positivo:"
	Leer num
	
	Escribir "La suma de los dígitos es:", sumaDigitos(num)
FinAlgoritmo
