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
	     
	public static void main(String[] args) 
	{
		theSmallestNumberInTheArray();
		
	}
	
	public static void  theSmallestNumberInTheArray()
	{
		Scanner scan=new Scanner(System.in);
		
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
