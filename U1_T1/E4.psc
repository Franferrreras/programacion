Algoritmo sin_titulo
	
	//EJERCICIO 4 (ej4.psc)
	
	//Realiza un programa que calcule el m�ximo, el m�nimo y la media de una serie de n�meros enteros positivos introducidos por teclado. El programa terminar� cuando el usuario introduzca un n�mero primo. 
	//Este �ltimo n�mero no se tendr� en cuenta en los c�lculos. El programa debe indicar tambi�n cu�ntos n�meros ha introducido el usuario (sin contar el primo que sirve para salir).
		
//Ejemplo:
//Por favor, vaya introduciendo n�meros enteros positivos. Para terminar, introduzca un n�mero p\
		//rimo:
			//6
			//8
			//15
			//12
			//23
			//Ha introducido 4 n�meros no primos.
		//M�ximo: 15
		//M�nimo: 6
//Media: 10.25
	
	Definir num Como Entero
	
	contador=0
	n1<-Verdadero
	Repetir 
		Escribir "Por favor, vaya introduciendo n�meros enteros positivos. Para terminar , introduzca un n�mero primo"
		leer num
		contador= contador+1
	Hasta Que num%2=1
	
	
	si num%2=1 Entonces
		escribir "ha introducido ", contador-1, " n�meros no primos"
	FinSi
	
	si n1 = Verdadero Entonces
		max<-num
		min<-num
		n1=falso
		Escribir num
	SiNo
		si num > max Entonces
			Escribir "M�ximo ", max<-num
			
		FinSi
		
		si num < min Entonces
			Escribir "M�nimo ", min<-num
		FinSi

	FinSi
	
	
	
	
	
FinAlgoritmo
