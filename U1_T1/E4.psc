Algoritmo sin_titulo
	
	//EJERCICIO 4 (ej4.psc)
	
	//Realiza un programa que calcule el máximo, el mínimo y la media de una serie de números enteros positivos introducidos por teclado. El programa terminará cuando el usuario introduzca un número primo. 
	//Este último número no se tendrá en cuenta en los cálculos. El programa debe indicar también cuántos números ha introducido el usuario (sin contar el primo que sirve para salir).
		
//Ejemplo:
//Por favor, vaya introduciendo números enteros positivos. Para terminar, introduzca un número p\
		//rimo:
			//6
			//8
			//15
			//12
			//23
			//Ha introducido 4 números no primos.
		//Máximo: 15
		//Mínimo: 6
//Media: 10.25
	
	Definir num Como Entero
	
	contador=0
	n1<-Verdadero
	Repetir 
		Escribir "Por favor, vaya introduciendo números enteros positivos. Para terminar , introduzca un número primo"
		leer num
		contador= contador+1
	Hasta Que num%2=1
	
	
	si num%2=1 Entonces
		escribir "ha introducido ", contador-1, " números no primos"
	FinSi
	
	si n1 = Verdadero Entonces
		max<-num
		min<-num
		n1=falso
		Escribir num
	SiNo
		si num > max Entonces
			Escribir "Máximo ", max<-num
			
		FinSi
		
		si num < min Entonces
			Escribir "Mínimo ", min<-num
		FinSi

	FinSi
	
	
	
	
	
FinAlgoritmo
