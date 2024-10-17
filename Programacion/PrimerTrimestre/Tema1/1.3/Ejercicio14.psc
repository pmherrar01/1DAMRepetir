//Crea un programa en pseudocódigo que simule el funcionamiento de un cajero
//automático. El cajero tendrá un saldo inicial de 1000 ? y permitirá al usuario
//realizar las siguientes operaciones:
//1. Consultar saldo: Mostrar el saldo actual al usuario.
//2. Depositar dinero: Permitir al usuario ingresar una cantidad de dinero y
//	sumarla al saldo.
//3. Retirar dinero: Permitir al usuario retirar una cantidad de dinero del
//	saldo, pero solo si el saldo es suficiente. Si no hay suficiente saldo,
//	mostrar un mensaje de error.
//4. Salir: Finalizar el programa.
//	El programa debe repetirse hasta que el usuario elija la opción de salir.
Algoritmo Ejercicio14
	
	Definir num, saldo, ingreso, sacar Como Entero
	Definir puede Como Logico
	
	puede = Falso
	saldo = 1000
	
	
	Repetir
		Escribir "1. Consultar saldo:"
		Escribir "2. Depositar dinero:"
		Escribir"3. Retirar dinero:"
		Escribir "	4. Salir:"
		Leer num
		Segun num Hacer
			1: 
				Escribir "Tun saldo actual es: " saldo
			2: 
				Repetir
					Escribir "Dinero a ingresar: " 
					Leer ingreso
					Si (ingreso < 0 ) Entonces
						Escribir "Error. No se puede ingresar esa cantidad de dinero"
					SiNo
						saldo = saldo + ingreso
					FinSi
				Hasta Que ingreso > 0
			3:	
				Repetir
					Escribir "Cantidad de dinero que desea sacar`: "
					Leer sacar
					Si (sacar > saldo) Entonces
						Escribir  "ERROR. No puedes sacar mas de " saldo
						puede = Verdadero
					SiNo
						saldo = saldo - sacar
						puede = falso
					FinSi
				Hasta Que  No puede
			4: Escribir "Saliendo..."
			De Otro Modo:
				Escribir "Seleccione una opcion valida"
		FinSegun
	Hasta Que num == 4
	
FinAlgoritmo
