//Que no.14
class AmericanFlag
{
	public static void main(String[] args)
	{
		for(int i=1; i<=15;i++)
		{
			if(i<=6)
			{
				if(i%2==1)
				{
					System.out.println("* * * * * * = = = = = = = = = = = = = = =");
				}
				else
				{
					System.out.println(" * * * * *  = = = = = = = = = = = = = = =");
				}
			}
			else
			{
				    System.out.println("= = = = = = = = = = = = = = = = = = = = =");
			}
		}
		
	}	

}