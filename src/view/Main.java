package view;

import controller.Controller;

public class Main 
{

	public static void main (String[] args) 
	{
		Controller c = new Controller();
		
		int numA = 5;
		int numB = 1;
		
		int resultado = c.Multiplica(numA, numB);
		
		System.out.println(resultado);
		
	}
	
}
