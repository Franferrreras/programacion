Algoritmo sin_titulo
	
	
	//EJERCICIO 2 (ej2.psc) Escribe un programa que si le pasamos un entero nos devuelva ese entero al revés
		
	//Ejemplo:
		
	//Por favor, introduzca un número entero positivo: 123456
		//El número resultante es 654321
		
	//NOTA: No se pueden utilizar funciones de texto de PseInt.
	
	
	Definir num, x , i Como entero
	
	num<-0
	x<-0
	i<-0
	
	Escribir "dime un numero"
	leer num
	
	Mientras num<>0 Hacer
		x<-num%10
		num<-trunc(num/10)
		i<-i*10+x
	FinMientras
	Escribir i
	


	
	
	
FinAlgoritmo
