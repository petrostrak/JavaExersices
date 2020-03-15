//created with gedit
public class EveryDay{
	public static void main(String[] args){
		String dayOfChoice = args[0];
		//System.out.println(dayOfChoice);
		switch(dayOfChoice){
			case "Monday":
				System.out.println("You don't hate Mondays, you hate capitalism");
				break;
			case "Tuesday":
				System.out.println("Its Tuesday. More work for you.");
				break;
			case "Wednesday":
				System.out.println("You re half way there, still you gotta work.");
				break;
			case "Thursday":
				System.out.println("Hang in there buddy, two more days at the office, then drinks!");
				break;
			case "Friday":
				System.out.println("You made it, one more day at work until weekend!");
				break;
			case "Saturday":
				System.out.println("At last Saturday, you may rest now.");
				break;
			case "Sunday":
				System.out.println("Already Sunday? Weekend passed so fast...");
				break;
			case "--help":
				System.out.println("The valid days of the week are:\nMonday\nTuesday\nWednesday\nThursday\nFriday\nSaturday\nSunday");
				break;
			default:
				System.out.println("Type a valid weekday or type --help for more options.");
				break;
		}	
	}
}
