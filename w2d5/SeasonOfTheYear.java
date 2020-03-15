//created with gedit 
public class SeasonOfTheYear{
	public static void main(String[] args){
		String season = args[0];
		switch(season){
			case "December":
				System.out.println("It's Winter!");
				break;
			case  "January":
				System.out.println("It's Winter");
				break;
			case "February":
				System.out.println("It's Winter");
				break;
			case "September":
				System.out.println("It's Autumn");
				break;
			case "Octomber":
				System.out.println("It's Autumn");
				break;
			case "Nomember":
				System.out.println("It's Autumn");
				break;
			case "March":
				System.out.println("It's Spring");
				break;
			case "April":
				System.out.println("It's Spring");
				break;
			case "May":
				System.out.println("It's Spring");
				break;
			case "June":
				System.out.println("It's Summer");
				break;
			case "July":
				System.out.println("It's Summer");
				break;
			case "August":
				System.out.println("It's Summer");
				break;
			default :
				System.out.println("Please give me a valid Month.");
				break;
		}	
	}
}
