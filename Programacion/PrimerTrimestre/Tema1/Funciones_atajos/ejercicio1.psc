//Solicita al usuario su nombre y apellido en cualquier formato (may�sculas o min�sculas).
//Usa funciones de cadena para convertir el nombre a un formato de t�tulo (primera letra en
//	may�scula, el resto en min�sculas).
//Pistas:
//	� Usa Mayusculas(cadena) y Minusculas(cadena) para transformar las partes.
//		� Usa SubCadena(cadena, desde, hasta) para obtener las primeras letras.
//		Ejemplo de salida: Para la entrada "jUan p�REz", el resultado deber�a ser "Juan P�rez".
Funcion nombreYApellido<- convertirNombre(nombre)
	Definir nombreMayusculas, apellidoMayusculas, nombreBien,  apellidoBien Como Caracter
	Definir i Como Logico
	
	i = Verdadero
	
	nombreMayusculas = Mayusculas(nombre)
	apellidoMayusculas = Mayusculas(apellido)
	

	nombreBien = Subcadena(nombreMayusculas,0,0) +  Minusculas(Subcadena(nombreMayusculas, 1, Longitud(nombreMayusculas)))
	apellidoBien = Subcadena(apellidoMayusculas,0,0) + Minusculas(Subcadena(apellidoMayusculas, 1, Longitud(apellidoMayusculas)))
 	

	
	nombreYApellido = nombreBien + " " + apellidoBien
	
FinFuncion

Funcion convertirApellido(apellido)
	
FinFuncion


Algoritmo ejercicio1
	Definir nombre, apellido, nombreYApellido Como Caracter
	
	Escribir "Introduce tu nombre"
	Leer nombre
	Escribir "Introduce tu apellido"
	Leer apellido
	
	nombreYApellido = convertirNombre(nombre,apellido)
	
	Escribir  nombreYApellido
	
FinAlgoritmo
