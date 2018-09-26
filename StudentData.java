import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentData {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        try{
            do{
                Scanner scan = new Scanner(System.in);
                System.out.println( "\n _____________________________"
                        +"\n|                             |"
                        +"\n|      ENTER YOUR ID          |"
                        +"\n|_____________________________|"
                );
                System.out.println();
                int studentRecord;
                studentRecord = scan.nextInt();
                System.out.println(   "\n _____________________________"
                        +"\n|                             |"
                        +"\n|      ENTER YOUR NAME        |"
                        +"\n|_____________________________|"
                );
                System.out.println();
                String studentRecord1;
                studentRecord1 = scan.next();
                int marks=0;
                System.out.println("ENTER MARKS PLEASE---->between 0 and 100");
                marks = scan.nextInt();
                if (marks>=90 && marks<=100) {
                    System.out.println("(A+ *** CGPA ---> 4.00");
                }else if (marks>=85 && marks<=89.99) {
                    System.out.println(" A *** CGPA ---> 4.00");
                }else if (marks>=80 && marks<=84.99) {
                    System.out.println("A- *** CGPA ---> 3.66 ");
                }else if (marks >= 75 && marks<=79.99) {
                    System.out.println("B+ *** CGPA ---> 3.33 ");
                }else if (marks>=71 && marks<=74.99) {
                    System.out.println( "B *** CGPA ---> 3.00 ");
                }else if (marks>=68 && marks<=70.99) {
                    System.out.println("B- *** CGPA ---> 2.66 ");
                }else if (marks>=61  && marks<=67.99) {
                    System.out.println("C *** CGPA ---> 2.00 ");
                }else if (marks>=50 && marks<60.99) {
                    System.out.println("D *** CGPA ---> 1.00");
                }else if (marks<50) {
                    System.out.println("F *** CGPA ---> 0.00");
                    System.out.println("BETTER LUCK NEXT TIME");
                }else{
                    System.out.println("input out of range");
                }


                System.out.println("+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+");
                System.out.println(" ID:"+ studentRecord+ "," + " NAME: " + studentRecord1 + "," +
                        " MARKS :" + marks);
                System.out.println("+~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+");
                System.out.println("type EXIT to quit or press any key to continue ");
                String s1 = scan.next();
                if (s1.equals("EXIT") || s1.equals("exit")) {
                    System.out.println("-------------------");
                    System.out.println(" terminated ");
                    System.out.println("-------------------");
                    System.exit(0);
                }

            }while(true);
        }
        catch(InputMismatchException e){
            System.out.println("Sorry,the data you provide does not match");
            System.out.println("Goodbye");
        } catch(Exception e){
            System.out.println("something went wrong");
        }
    }
}
