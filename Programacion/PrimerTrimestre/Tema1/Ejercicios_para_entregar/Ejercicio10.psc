//Escribe un programa que pida un n�mero N y comprueba si es un n�mero
//primo.
//�Recuerda! Un n�mero primo es aquel que solo se puede dividir entre el
//mismo y la unidad, en cualquier otro caso la divisi�n tiene decimales.

Algoritmo Ejercicio10
	
	Definir num Como Entero
	Definir primo  Como Logico
	
	Escribir "Introduce un n�mero:"
    Leer num
	
    Si (num <= 1) Entonces
        Escribir "El n�mero no es primo."
    Sino
        primo = Verdadero
        Para i desde 2 hasta num-1 Hacer
            Si num % i = 0 Entonces
                primo = Falso
            FinSi
        FinPara
		
        Si (primo) Entonces
            Escribir "El n�mero es primo."
        Sino
            Escribir "El n�mero no es primo."
        FinSi
    FinSi
FinAlgoritmo
