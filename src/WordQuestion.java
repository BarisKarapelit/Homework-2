import java.util.Scanner;

public class WordQuestion 

{
	public WordQuestion()
	{
	
		
	}
	public WordQuestion(int n1,int n2)
	{
	System.out.println(n1 + n2);
		
	}
	public WordQuestion(String name,String surname)
	{
		
		System.out.println(name +" "+ surname);
		
	}
	   
	public static  String  TheTop2LargestNumbersInTheArray()
	{
		Scanner scan =new Scanner(System.in);
		
		System.out.println("What's the limit to the Array ?");
		
		
		
		
		int limitOfTheArray=scan.nextInt();
		
		int[] value=new int[limitOfTheArray];
		
			for(int i=0;i<limitOfTheArray;i++) 
			{
			
				System.out.println("Please Enter "+limitOfTheArray+" numbers :");
			
				value[i]=scan.nextInt();
				
			}
		
			
		int firstSmall,secondSmall ;
		
		firstSmall=value[0];
		
		for (int temprary:value)
		{
			if(firstSmall>temprary)
			{
				firstSmall=temprary;
			}
		}
		
		secondSmall=value[1];
		for (int temprary:value)
		{
			if(firstSmall!=temprary)
			{
				if(secondSmall>temprary ) {
				System.out.println("-------------------------------------------"+secondSmall);
				secondSmall=temprary;
				System.out.println("-------------------------------------------"+secondSmall);
				}
			}
		}
		
		
		String firstSmallString,secondSmallString;
		firstSmallString=String.valueOf(firstSmall);
		secondSmallString=String.valueOf(secondSmall);
		return (firstSmallString +secondSmallString);
	}
	
	
	
	
	public static void main(String[] args) 
	{
		
			
		System.out.println(TheTop2LargestNumbersInTheArray());
		//theSmallestNumberInTheArray();
		
	}
	
	
	
	
	public static void  theSmallestNumberInTheArray()
			{
				try (Scanner scan = new Scanner(System.in)) 
				{
					int[] Values=new int[10]; //Kullanýcýdan alýnacak deðeri tutacak
					int small;
					System.out.println("Please enter ten numbers ");
					
					for(int i=0;i<10;i++)//10 tane deðeri alacak for döngüsü
						{
							System.out.print("Please enter "+i+" number: ");
							Values[i]=scan.nextInt();
						}
					small = Values[0];
					
					for(int numbers:Values)//seach en küçük sayý bulmak için
						{
							if(small>numbers)
							{
								small=numbers;
							}
							
						}
					
					System.out.println(small);
				}
			}
}
