//created with gedit 3.34.0
public class WhatClass{
	public static void main(String[] args){
		int age = Integer.parseInt(args[0]);	//Convert String into Integer.
		char a;
		System.out.println(age);
		if(age > 0){
			if(age < 5 ){
				a = 'A';
				//System.out.println("You re still baby, no education for you yet.");		
			}else if(age < 12){
				//System.out.println("You need to go to Elementary School.");
				a = 'B';
			}else if(age < 14){
				//System.out.println("You need to go to Junior High School.");
				a = 'C';
			}else if(age < 18){
				//System.out.println("You need to go to High School.");
				a = 'D';
			}else{
				//System.out.println("You need to go to College");
				a = 'E';			
			}
		}else
			//System.out.println("Give me a positive number.");
			a = 'F';

		switch(a){
			case 'A':
				System.out.println("You re still baby, no education for you yet.");
			break;
			case 'B':
				System.out.println("You need to go to Elementary School.");
			break;	
			case 'C':
				System.out.println("You need to go to Junior High School.");
			break;
			case 'D':
				System.out.println("You need to go to High School.");
			break;
			default:
				System.out.println("Give me a positive number.");
			break;
		}
	}
}
