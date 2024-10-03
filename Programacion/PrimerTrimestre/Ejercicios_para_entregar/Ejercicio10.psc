//Escribe un programa que pida un número N y comprueba si es un número
//primo.
//¡Recuerda! Un número primo es aquel que solo se puede dividir entre el
//mismo y la unidad, en cualquier otro caso la división tiene decimales.

Algoritmo Ejercicio10
	
	Definir num Como Entero
	Definir primo  Como Logico
	
	Escribir "Introduce un número:"
    Leer num
	
    Si (num <= 1) Entonces
        Escribir "El número no es primo."
    Sino
        primo = Verdadero
        Para i desde 2 hasta num-1 Hacer
            Si num % i = 0 Entonces
                primo = Falso
            FinSi
        FinPara
		
        Si (primo) Entonces
            Escribir "El número es primo."
        Sino
            Escribir "El número no es primo."
        FinSi
    FinSi
FinAlgoritmo
