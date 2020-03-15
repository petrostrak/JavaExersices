public class DriversLicense{
	public static void main(String[] args){
		int age = Integer.parseInt(args[0]);
		int counter;
//		String possibility =(age <16)?"You cannot drive." : "";
//			System.out.println(possibility);
		if(age > 0){
			if(age < 16)
				counter = 1;
//				System.out.println("You cannot drive.");
			else if(age <=17)
				counter = 2;
//				System.out.println("You can drive, but not vote.");
			else if(age <=21)
				counter = 3;
//				System.out.println("You can vote but not drink.");
			else
				counter = 4;
//				System.out.println("You can do anything.");
		
			switch(counter){
				case 1:
					System.out.println("You cannot drive.");
					break;
				case 2:
					System.out.println("You can drive, but not vote.");
					break;
				case 3:
					System.out.println("You can vote but not drink.");
					break;
				case 4:
					System.out.println("You can do anything.");
					break;
				default:
					System.out.println("Give a positive number.");
					break;
			}
		}else	
			System.out.println("Type a positive number.");		
	}
}
