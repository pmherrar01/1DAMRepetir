//Dise�a un algoritmo qur simule un reloj digital que muestre la hora sin parar.
//Debe esperar un segundo real para darle mas realismo.
//Pasos: 
//1. Pide al usuario que introduzca la hora y los minutos
//2. Inicializa el reloj a esa hora con esos minutos y 0 segunndos
//3. Cada vez que transcurra un segundo incrementa la hora de comprobarlo
// si hay cmabio de minuto y hora
//Muestralo por pantalla

Algoritmo ejercicio10
	Definir hora Como Entero
	Definir min Como Entero
	Definir seg Como Entero
	Definir infinito Como Logico
	
	infinito = Verdadero
	seg = 0
	
	Escribir "Dime la hora"
	Leer  hora
	Escribir "Dime los minutos"
	Leer min
	
	Repetir
		Escribir hora ":" min ":" seg
		seg = seg + 1
		Esperar 1 Segundos
		Si (seg == 60 ) Entonces
			min = min + 1
			seg = 0
			Si (min == 60 ) Entonces
				min = 0
				hora = hora + 1
				Si (hora == 24 ) Entonces
					hora = 0			
				FinSi
			FinSi
		FinSi
		Borrar Pantalla
	Hasta Que No infinito
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Si (min == 60 ) Entonces
		//min = 0
		//hora = hora + 1
	//Sino
		//Si (hora == 24 ) Entonces
		//	hora = 0
		//SiNo
			//Si (seg == 60 ) Entonces
				//min = min + 1
				//seg = 0			
			//FinSi
		//FinSi
//	FinSi
	
FinAlgoritmo
