package controller;

public class Controller 
{
	
	public Controller()
	{
		super();
	}
	
	
	public int Multiplica(int numA, int numB)
	{
		if (numB == 1)
		{
			return numA;
		}
		else
		{
			return numA + Multiplica(numA, (numB - 1));
		}
	}
	
}
