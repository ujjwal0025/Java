import java.util.*;
import java.io.*;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int FirstN0 = 0 , SecoundNo = 0;
        char task = ' ';

        System.out.println("Enter first number");
        FirstN0 = sc.nextInt();

        System.out.println("Enter secound number");
        SecoundNo = sc.nextInt();

        System.out.println("Enter + - * /");
        task = sc.next().charAt(0);

        switch (task) {
            case '+':
                System.out.println("output is :" + (FirstN0+SecoundNo));
                
                break;
            
            case '-':
                System.out.println("output is :" + (FirstN0-SecoundNo));
                
                break;

             case '*':
                System.out.println("output is :" + (FirstN0*SecoundNo));
                
                break;
            
             case '/':
                try{

                    System.out.println("output is :" + (FirstN0/SecoundNo));
                }
                
                catch (Exception e) {
                    // TODO: handle exception
                    System.out.println("cannot be "+e.getMessage());
                }
                
                break;
            
            default:
                break;
        }


    }
    
}
