//Crea un vector V de N elementos e inicialízalo con valores aleatorios entre 0 y 100.

//Pide al usuario que introduzca un número e incrementa cada elemento del vector en esa cantidad.

//Ejemplo
//1º Inicializamos un vector 

//V
//0        	1          	2          	3         	4             
//26        27     	   38           19          50           


//El usuario introduce un número por ejemplo el 6

//V
//0        	1          	2          	3         	4             
//32        	33           	44           	25           	56           

Funcion rellenarVector(v,n)
	Definir i Como Entero
	Para i = 0 Hasta n-1 Con Paso 1 Hacer
		v[i] = azar(100)
	FinPara
FinFuncion

Funcion mostrarVector(v,n, mensaje)
	Definir i Como Entero
	i = 0
	Escribir mensaje
	Para i = 0 Hasta n-1 Con Paso 1 Hacer
		Escribir Sin Saltar "[" v[i] "]"
	FinPara
FinFuncion

Funcion num<- pedirNum(mensaje)
	Definir num Como Entero
	Escribir mensaje
	leer num
FinFuncion

Funcion modificarVector(v,n)
	Definir i, num Como Entero
	num = pedirNum("Introduce la cantidad que quieres restar a cada celda del vector")
	Para i = 0 Hasta n-1 Con paso 1 Hacer
		v[i] = v[i] + num
	FinPara
FinFuncion

Algoritmo ejercicio9
	Definir v1, n Como Entero
	n = 4
	Dimensionar v1[n]
	
	rellenarVector(v1,n)
	mostrarVector(v1,n,"Vector sin modificar:")
	modificarVector(v1,n)
	mostrarVector(v1,n,"Vector modificado: ")
FinAlgoritmo
