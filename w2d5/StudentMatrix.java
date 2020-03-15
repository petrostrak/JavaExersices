//Δεν λειτουργεί εάν ο πίνακάς μας είναι ασύμμετρος. Επίσης τα στοιχεία δεν
//καταχωρούνται τυχαία · είχα μια ιδέα γι αυτό αλλά δεν λειτούργησε.
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
                seatsPerRow = (numOfStudents / rows) + 1;

            //Defining 2D array to hold the inserted data
//            String[] extraSeat= new String[seatsPerRow];
            String[][] studentArray = new String[rows][seatsPerRow];
//            studentArray[0] = new String[rows];
//            studentArray[1] = extraSeat;
            
            //Enter studentArray data
            enterData(input, studentArray, rows, seatsPerRow, numOfStudents);
        
            //Print studentArray 
            printArray(studentArray, rows, seatsPerRow);
    } 
    static void enterData(Scanner input, String[][] studentArray, int rows, int seatsPerRow, int numOfStudents){
        for(int i = 0; i < rows; i ++){
			for(int j = 0; j < seatsPerRow; j++){
					System.out.println("There are "+(numOfStudents --)+" seats available. \nPlease enter student's name for seat "+"["+i+"]"+"["+j+"]"+":\nPlease give a student's name to fill a random seat");
//                    while(studentArray[i][j].isEmpty()){
//                        studentArray[(int)Math.random()][(int)Math.random()] = input.next();
//                    }  
                    studentArray[i][j] = input.next();
//                  studentArray[(int)Math.random()][(int)Math.random()] = input.next();
                    
			 }
		}
    }
    
    static void printArray(String[][] studentArray, int rows, int seatsPerRow){
        System.out.println("All seats are filled, thanks");
            for(int i = 0; i < rows; i++){
                for(int j = 0; j < seatsPerRow; j ++){
                    System.out.print(studentArray[i][j] + "\t");
                }
                System.out.println();
            }
    }
    
}
