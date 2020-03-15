//created with gedit
import java.util.Scanner;
import java.util.ArrayList;

public class StudentMatrix {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
    
            System.out.println("Enter the number of rows.");
        
            int rows = input.nextInt();
    
            System.out.println("Enter the number of srudents.");
    
            int numOfStudents = input.nextInt();
            
            int seatsPerRow;
            
            if(numOfStudents%rows==0){
                seatsPerRow = numOfStudents / rows;
            }else
                seatsPerRow = (numOfStudents / rows) +1 ;

            //Defining 2D array to hold the inserted data

            String[][] studentArray = new String[rows][];
            studentArray[0] = new String[rows];
            studentArray[1] = new String[seatsPerRow];
            
            //Enter studentArray data
            enterData(input, studentArray, numOfStudents);
        
            //Print studentArray 
            printArray(studentArray);
    } 
    
    //Method that fills our 2d with data
    static void enterData(Scanner input, String[][] studentArray, int numOfStudents){
        for(int i = 0; i < studentArray.length; i ++){
			for(int j = 0; j < studentArray[i].length; j++){
					System.out.println("There are "+(numOfStudents --)+" seats available. \nPlease enter student's name for seat "+"["+i+"]"+"["+j+"]"+":\nPlease give a student's name to fill a random seat");
//                    while(studentArray[i][j].isEmpty()){
//                        studentArray[(int)Math.random()][(int)Math.random()] = input.next();
//                    }  
                    studentArray[i][j] = input.next();
//                  studentArray[(int)Math.random()][(int)Math.random()] = input.next();
                    
			 }
		}
    }
    
    //Method that prints our 2d Array
    static void printArray(String[][] studentArray){
        System.out.println("All seats are filled, thanks");
            for(int i = 0; i < studentArray.length; i++){
                for(int j = 0; j < studentArray[i].length; j ++){
                    System.out.print(studentArray[i][j] + "\t");
                }
                System.out.println();
            }
    }
    
}
