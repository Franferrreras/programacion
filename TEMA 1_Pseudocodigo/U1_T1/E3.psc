Algoritmo sin_titulo
	
	
	//EJERCICIO 3 (ej3.psc)
	
	//Nos han encargado realizar un programa que pinte un 8 por pantalla usando la letra M. Se pide al usuario la altura, que debe ser un número entero impar mayor o igual que 5. Si el número introducido no es correcto, el programa deberá mostrar un mensaje de error y volver a solicitarlo. A continuación se muestran algunos ejemplos.
		
		//La anchura de la figura siempre será de 6 caracteres.
		
	//Ejemplo 1:
	//Por favor, introduzca la altura (número impar mayor o igual a 5): 8
		//La altura introducida no es correcta
		
	//Ejemplo 2:
	//Por favor, introduzca la altura (número impar mayor o igual a 5): 3
		//La altura introducida no es correcta
		
	//Ejemplo 3:
	//Por favor, introduzca la altura (número impar mayor o igual a 5): 5
		//MMMMMM
		//M            M
		//M            M
		//MMMMMM
		//M            M
		//M            M
		//MMMMMM
	
	
	
	Definir tam, f Como Entero
	
	
	Repetir
		Escribir "Por favor, introduzca la altura, número impar maryo o igual que 5"
		leer tam
		
		si tam < 5 O tam%2=0 Entonces
			escribir "La altura no es correcta"
		FinSi
		Escribir ""
		
	Hasta Que tam%2=1 Y tam>=5
	
	
	
	
	Para f<-0 hasta tam-1 Hacer
		si f = 0 O f=tam-1 O f= trunc(tam/2) Entonces
			Escribir "* * * * * *"
		SiNo
			escribir "*         *"
		FinSi
	FinPara
		
	
	
	
	
FinAlgoritmo
