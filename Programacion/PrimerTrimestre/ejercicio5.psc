Algoritmo ejercicio5
	
	Definir porcentajeTrimestres Como Real
	Definir porcentajeExamenFinal Como Real
	Definir porcentajeTrabajoFianl Como Real
	Definir nota1trimestre Como Entero
	Definir nota2trimestre Como Entero
	Definir nota3trimestre Como Entero
	Definir notaMedia Como Real
	Definir notaExamenFinal Como Entero
	Definir notaTrabajoFinal Como Entero
	Definir notaFinal Como Real
	
	
	Escribir "Dime la nota del primer trimestre" 
	
	Leer nota1trimestre
	
	Escribir "Dime la nota del segundo trimestre" 
	
	Leer nota2trimestre
	
	Escribir "Dime la nota del tercer trimestre" 
	
	Leer nota3trimestre
	
	notaMedia = (nota1trimestre + nota2trimestre + nota3trimestre) / 3
	
	Escribir "Tu nota media es " notaMedia
	
	porcentajeTrimestres = notaMedia * 0.55
	
	Escribir "Dime tu nota del examen final "
	
	Leer  notaExamenFinal
	
	porcentajeExamenFinal = notaExamenFinal * 0.30
	
	Escribir "Dime tu nota del trabajo final"
	
	Leer notaTrabajoFinal
	
	porcentajeTrabajoFianl = notaTrabajoFinal * 0.15
	
	notaFinal = porcentajeExamenFinal + porcentajeTrabajoFianl + porcentajeTrimestres
	
	Escribir "Tu nota final es " notaFinal
	
FinAlgoritmo
