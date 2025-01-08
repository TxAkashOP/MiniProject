package com.guessNumber;

import java.util.Scanner;

public class Guess_Number
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int myNumber=(int)(Math.random()*100);
		
		int userNumber=0;
		
		do 
		{
			System.out.println("Guess the Number(1-100)");
			userNumber=sc.nextInt();
			
			if(userNumber==myNumber)
			{
				System.out.println("Wohhoooo.... CORRECT NUMBER !!....");
				break;
			}
			else if(userNumber>myNumber)
			{
				System.out.println("Your number is large");
			}
			else
			{
				System.out.println("Your number is small");
			}
		} while (myNumber>=0);
		
		System.out.println("MY NUMBER WAS "+myNumber);
	}

}
