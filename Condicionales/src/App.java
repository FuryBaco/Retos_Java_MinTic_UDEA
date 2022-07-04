//import scanner
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        //create a new variable of type int and assign it the value of 10
        int myInt = 10;
        //create a new variable of type double and assign it the value of 10.5
        double myDouble = 10.5;
        //print the sum of myInt and myDouble
        System.out.println(myInt + myDouble);
        //ask the user for a number
        Scanner sc = new Scanner(System.in) ;
        try {
            System.out.println("Enter a number: ");
            //creae a new variable of type int and assign it the value of the user's number
            int userNumber = sc.nextInt();
            //print the user's number
            System.out.println(userNumber);
            System.out.println("Enter a radius: ");
            //creae a new variable of type int and assign it the value of the user's number
            double radius = sc.nextDouble();
            //print the user's number
            System.out.println("The radius of the circle is: " + radius + " units");
            //calculate the area of a circle
            double area = Math.PI * radius * radius;
            //print the area
            System.out.println("The area of the circle is: " + area + " units");

    }finally {
        sc.close();
    }
}
}
