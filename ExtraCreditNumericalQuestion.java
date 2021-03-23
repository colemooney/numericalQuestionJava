import java.util.Scanner;
public class ExtraCreditNumericalQuestion
{
   public static void main(String[] arg)
   {
        //CONSTANTS
        final int SIDES_OF_CUBE = 4;
        
        //VARIABLES
        double sideLength; //mm
        double perimeter; //mm
        double area; //mm
        
        //ARRAYS
        
        //OBJECTS
        Scanner keyboardInput = new Scanner(System.in);
        //SOLUTION
        CS170.information("Cole Mooney", "Extra Credit", "Numerical Question");
        
        //VARIABLE ASSIGNMENT
       
        
        //KEYBOARD INPUT
        System.out.print("What is the length of the cube? (mm): ");
        sideLength = keyboardInput.nextInt();
        
        //Perimeter Calculation
        perimeter = SIDES_OF_CUBE * sideLength;
        
        //Area Calculation
        area = Math.pow(sideLength, 2);
        
        //SCREEN OUTPUT
        System.out.println("Side Length: " + sideLength);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
        
        keyboardInput.close();
        
       
    }
}
