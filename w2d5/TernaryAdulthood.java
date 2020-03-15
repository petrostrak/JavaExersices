//Created in gedit
public class TernaryAdulthood{
	public static void main(String[] args){
		int age = Integer.parseInt(args[0]);
		String adulthood = (age >18)? "Adult" : "Child";
		System.out.println(adulthood);
	}
}
