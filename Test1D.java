import java.util.*;
public class Test1D {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to Operation menu");
    System.out.println("Enter Size of Array");
    int size = sc.nextInt();
    int[] arr = new int[size];
    Service.AcceptData(arr, size);
    int choice;
    do {
    System.out.println("Press choice");
    System.out.println("1.Prime \t  2.Add Odd \t\t3.sum \t");
    System.out.println("4.Factorial \t  5.MaxNthPrime \t 6.MinNthPrime \t");
    System.out.println("7.Occurrence \t  8.MaxNthNumber \t 9.MinNthNumber \t");
    System.out.println("Enter Choice");
    choice = sc.nextInt();
    
     switch(choice){

          case 1:
                  
                  Service.Prime(arr, size);
                  break;
          case 2:
                  
                  Service.AddOdd(arr, size);
                  break; 
          case 3:
                  
                  Service.sum(arr, size);
                  break;
          case 4:
                 
                  Service.Factorial(arr, size);
                  break;  
          case 5:
                  
                  Service.MaxNthPrime(arr, size);
                  break;
          case 6:
                  
                  Service.MinNthPrime(arr, size);
                  break; 
          case 7:
                 
                  Service.Occurrence(arr);
                  break;
          case 8:
                 
                  Service.MaxNthNumber(arr);
                  break; 
          case 9:
                 
                  Service.MinNthNumber(arr);
                  break;
               
          case 10:
        	     System.out.println("Thankyou");
          default:
                 System.out.println("Invalid Choice");      
        }
    }while(choice!=10);
    }
}
