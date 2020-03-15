//created with gedit
public class TheySeeMeLoopin{
	public static void main(String[] args){
		String [] array = new String[4];
//		String[] array = {"Giannis", "Despoina", "Greg", "Sotiris"};		
		array[0] = "Giannis";
		array[1] = "Despoina";
		array[2] = "Greg";
		array[3] = "Sotiris";
		
		System.out.println("***Traditional For-Loop***");
		
		for(int i = 0; i < array.length; i ++){
			System.out.print(array[i]+" ");
		}
		
		System.out.println();
		System.out.println("***For - Enhanced***");
		
		for(String names : array){
			System.out.print(names+" ");
		}
		
		System.out.println();
		System.out.println("***Do - While***");
		
		int i = 0;
		do{
			System.out.print(array[i]+" ");
			i ++;
		}while(i<array.length);
		
		System.out.println();
		System.out.println("***While***");
		i = 0;
		while(i < array.length){
			System.out.print(array[i]+" ");
			i ++;
		}
		System.out.println();
	}
}
