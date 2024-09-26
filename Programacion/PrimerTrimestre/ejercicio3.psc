Algoritmo ejercicio3
	
	Definir sueldoBase Como Real
	Definir extraPorVenta Como Real
	Definir totalExtra Como Real
	Definir sueldoFinal Como Real
	Definir venta1 Como Real
	Definir venta2 Como Real
	Definir venta3 Como Real
	
	
	sueldoBase =  1134
	extraPorVenta = 10%sueldoBase
	
	Escribir "Cual es la cantidad de la venta 1"
	
	leer venta1
	
	Escribir "Cual es la cantidad de la venta 2"

	leer venta2
	
	Escribir "Cual es la cantidad de la venta 3"
	
	leer venta3
	
	totalExtra = (venta1 + venta2 + venta3) * 0.10
	
	sueldoFinal = totalExtra + sueldoBase
	
	Escribir  "Tu sueldo total con 3 ventas este mes mas tu sueldo base que es de " sueldoBase " te sale un total de " sueldoFinal " euros"
 	
	
FinAlgoritmo
