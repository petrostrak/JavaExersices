//created with gedit
public class DaysOFMonth{
	public static void main(String[] args){
		String month = args[0];
		switch(month){
			case "January":
				System.out.println("January has 31 days.");
				break;
			case "February":
				System.out.println("February has 28 days.");
				break;
			case "March":
				System.out.println("March has 31 days.");
				break;
			case "April":
				System.out.println("April has 30 days.");
				break;
			case "May":
				System.out.println("May has 29 days.");
				break;
			case "June":
				System.out.println("June has 30 days.");
				break;
			case "July":
				System.out.println("July has 31 days.");
				break;
			case "August":
				System.out.println("August has 31 days.");
				break;
			case "September":
				System.out.println("September has 30 days.");
				break;
			case "October":
				System.out.println("October has 30 days.");
				break;
			case "November":
				System.out.println("November has 29 days.");
				break;
			case "December":
				System.out.println("December has 31 days.");
				break;
			case "--help":
				System.out.println("The valid months of the year are:\nJanuary\nFebruary\nMarch\nApril\nApril\nMay\nJune\nJuly\nAugust\nSeptember\nOctober\nNovember\nDecember");
				break;
			default :
				System.out.println("Type a valid month or type --help for more options.");
		}
	}
}
