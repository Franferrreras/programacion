Algoritmo sin_titulo
	
	
	//EJERCICIO 1 (ej1.psc)
	
	//Escribe un algoritmo que calcule el precio de un pedido de cierto producto la cantidad de producto que solicita el cliente. Para aclararlo, el precio de cada unidad depende de la cantidad de
			
			//-> Las 100 primera unidades del pedido van a precio fijo. Siempre costarán 5.23€ cada una
			
			//-> Las unidades entre la 101 y la 1000 (ambas incluidas) costarán 4.16€ cada una
			
			//-> A partir de esa cantidad el precio será el 50% del precio original.
			
		//Por ejemplo:
			
		//Introduzca la cantidad de unidades: 90
		//El precio del pedido es: 470.70€
			
		//Introduzca la cantidad de unidades: 150
		//El precio del pedido es: 615.70
	
	
	Definir x Como Real
	
	Escribir "Introduzca la cantidad de unidades"
	leer x
	
		
	Si x<=100 Entonces
		Escribir "El precio dle pedido es ",(x*5.23), " euros"
	SiNo
		
		si x>=101 Y x<=1000 entonces
			Escribir "El precio del pedido es ",(x*4.16), " euros"
		FinSi
		
	Fin Si
	
	si x   > 1000 Entonces
		Escribir "El precio es ", x*5.23*0.5 
	FinSi
	
	
	
	
FinAlgoritmo
