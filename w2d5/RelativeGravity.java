//created with gedit
import java.util.Scanner;

public class RelativeGravity{
	public static void main(String[] agrs){
		Scanner input = new Scanner(System.in);
		System.out.println("What is your weight?(in kg)");
		double weight = input.nextDouble();
		String[] planets = {"Venus", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
		double[] relativeGravity = {0.78, 0.39, 2.65, 1.17, 1.05, 1.23};
		for(int i = 0; i < planets.length; i ++){
			System.out.printf("\nOn %S with relative gravity %.2f you would "+
			"weight : %.1fkg",planets[i], relativeGravity[i], +
			gravityOnSpace(weight, relativeGravity[i]));			
		}
		System.out.println();		
	}
	
	static double gravityOnSpace(double weight, double relativeGravity){
		weight = weight * relativeGravity;
		return weight;
	}
	
}
