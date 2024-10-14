//Diseña un algoritmo que simule la tirada de dos datos y
//muestre al usuario el resultado de la tirada. Si los dos dados tienen el mismo numero
// debe mostrar un mensaje indicando que el resultado es el mismo 
//La aplicacion se debe repetir hasta  que el usuario indique que no quiere tirar mas (pregunntando por 's' o 'n', o 'Si' o 'No' )

Algoritmo Ejercicio8
	Definir dado1 Como Entero
	Definir dado2 Como Entero
	Definir respuesta Como Caracter
	
	Repetir
		dado1 = azar(5)+1
		dado2 = azar(5)+1
		
		Escribir "Dado 1: " dado1 " dado 2: " dado2
		
		Si (dado1 == dado2) Entonces
			Escribir "EL resultado de los dados es igual"
		FinSi
		
		Escribir "¿Quieres seguir tirando dados?, Indica (Si) o (No) " 
		Leer respuesta
	Hasta Que respuesta == "No" O respuesta == "no" O respuesta == "n"
	
FinAlgoritmo
