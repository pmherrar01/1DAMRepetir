Funcion resultado <- invertirNum(num)
    Si num < 10 Entonces
        resultado <- num
    SiNo
        resultado = invertirNum(num MOD 10) * potencia(10, truncar(log10(num))) + invertirNum(num DIV 10)
    FinSi
FinFuncion

Algoritmo ejercicio4
    Definir num Como Entero
	
    Escribir "Introduce un numero"
    Leer num
	
    Escribir "El numero ", num, " invertido es: ", invertirNum(num)
	
FinAlgoritmo
