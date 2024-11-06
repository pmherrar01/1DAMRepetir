//Escribe una funci�n recursiva que reciba un n�mero entero positivo ?? y devuelva la suma de
//sus d�gitos. Este tipo de problema es �til para aprender a manipular n�meros y comprender
	//c�mo dividir un problema en pasos m�s peque�os.
//Entrada:
//	Un n�mero entero positivo ??.
//Salida:
	//La suma de los d�gitos de ??
//Ejemplo:
//? Entrada: 1234
//? Salida: 10 (ya que 1+2+3+4=10)
//Sugerencia:
//	El caso base ocurre cuando ?? es un solo d�gito (entre 0 y 9), en cuyo caso se retorna
	//?? mismo. Para otros valores, la funci�n debe llamarse a s� misma con ?? //10 (eliminando el
		//�ltimo d�gito) y sumar ??%10 (el �ltimo d�gito).
	//NOTA: Como la divisi�n entera ( Por ejemplo 5 divisi�n entera entre 2 es 2 ? 5 / 2 = 2 )
		//no est� implementada en PSEINT, podemos hacer uso de la funci�n TRUNC(numero) de
		//PSEINT que devuelve la parte entera de un n�mero real.
Funcion total <- sumaDigitos(num)
	Si (num >= 0 Y num <= 9) Entonces
		total = num
	SiNo
		total = sumaDigitos(TRUNC(num / 10)) + (num % 10)
	FinSi
FinFuncion

Algoritmo ejercicio3
	Definir num Como Entero
	
	Escribir "Introduce un n�mero entero positivo:"
	Leer num
	
	Escribir "La suma de los d�gitos es:", sumaDigitos(num)
FinAlgoritmo
