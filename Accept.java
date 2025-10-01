import java.util.*;

import javax.swing.plaf.synth.SynthStyle;

class Accept {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Size of Array");
    int size = sc.nextInt();
    int[] arr = new int[size];
    AcceptData(arr, size);
    //Prime(arr, size);
    // DisplayData(arr,size);
    //AddOdd(arr,size);
    //sum(arr,size);
    //Factorial(arr,size);
    //MaxNthPrime(arr, size);
    //MinNthPrime(arr, size);
    //Occurrence(arr);
    //MaxNthNumber(arr);
    MinNthNumber(arr);

    sc.close();
  }

  public static void AcceptData(int[] a, int size) {
    System.out.println("Enter Array Elements");
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < a.length; i++) {
      a[i] = sc.nextInt();
    }
  }

  public static void DisplayData(int[] a, int size) {
    System.out.println(" Array Elements Are");
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i] + "\t");
    }
  }

  public static void Prime(int[] a, int size) {
    System.out.println(" Prime number Elements Are");
    for (int i = 0; i < a.length; i++) {
      if (a[i] > 1) {
        boolean flag = true;

        for (int j = 2; j < a[i]; j++) {
          if (a[i] % j == 0) {
            flag = false;
            break;
          }
        }
        if (flag==true) {
          System.out.print(a[i] + "\t");
        }
      }
    }
  }


  public static void AddOdd(int[] a,int size){
    int sum=0;
    for(int i=0;i<a.length;i++){
      if (a[i] %2!=0) {
        sum= sum+a[i];
      }
    }
    System.out.println(sum);
  }

  public static void Factorial(int[] a,int size){
   
    for(int i=1;i<a.length;i++){
      int fact=1;
      for(int j=a[i];j>=1;j--){
         fact=j*fact;
      }
      System.out.println(fact);
    }
    
  }



  public static void MaxNthPrime(int[] a, int size) {
    System.out.println(" Prime number Elements Are");
          System.out.println("Nth Max Prime Number is");
   Scanner sc =new Scanner(System.in);
   int nth =sc.nextInt();
    int cnt=0;
    int[] prime = new int[size];
    for (int i = 0; i < a.length; i++) {
      if (a[i] > 1) {
        boolean flag = true;
        
        for (int j = 2; j < a[i]; j++) {
          if (a[i] % j == 0) {
            flag = false;
            break;
          }else{
            
          }
        }
        if (flag==true) {
          System.out.print(a[i] + "\t");
            prime[cnt]=a[i];
          cnt++;
         }
        }
      }
      System.out.println("prime number");
      for(int i=0;i<cnt;i++){
        System.out.println(prime[i]);
      }
      for(int i=0;i<cnt;i++){
        for(int j=i+1;j<cnt;j++){

        if(prime[i]<prime[j]){
          int temp =prime[i];
          prime[i]=prime[j];
          prime[j]=temp;
        }
      }
        }
      for(int i=0;i<cnt;i++){
        System.out.print(prime[i]);
      }
      System.out.println("Nth Max Prime Number is" +prime[nth-1]);
    }
      
     public static void MinNthPrime(int[] a, int size) {
    System.out.println(" Prime number Elements Are");
          System.out.println("Nth Max Prime Number is");
   Scanner sc =new Scanner(System.in);
   int nth =sc.nextInt();
    int cnt=0;
    int[] prime = new int[size];
    for (int i = 0; i < a.length; i++) {
      if (a[i] > 1) {
        boolean flag = true;
        
        for (int j = 2; j < a[i]; j++) {
          if (a[i] % j == 0) {
            flag = false;
            break;
          }else{
            
          }
        }
        if (flag==true) {
          System.out.print(a[i] + "\t");
            prime[cnt]=a[i];
          cnt++;
         }
        }
      }
      System.out.println("prime number");
      for(int i=0;i<cnt;i++){
        System.out.println(prime[i]);
      }
      for(int i=0;i<cnt;i++){
        for(int j=i+1;j<cnt;j++){

        if(prime[i]>prime[j]){
          int temp =prime[i];
          prime[i]=prime[j];
          prime[j]=temp;
        }
      }
        }
      for(int i=0;i<cnt;i++){
        System.out.print(prime[i]);
      }
      System.out.println("Nth Max Prime Number is" +prime[nth-1]);
    } 

    public static void sum(int[] a,int size){
    int sum=0;
    for(int i=0;i<a.length;i++){
        sum= sum+a[i];
    }
    System.out.println(sum);
  }

  public static void Occurrence(int[] a){
    System.out.println("enter number");
    Scanner sc =new Scanner(System.in);
    int num = sc.nextInt();
    int cnt =0;
    for(int i=0;i<a.length;i++){
       if (a[i]==num) {
        cnt++;
       }
    }
    if (cnt==0) {
      System.out.println("NOT FOUND");
    }else{
      System.out.println("FOUND "+num +" Occurrence "+cnt);
    }
    
  }

  public static void MaxNthNumber(int[] a){
    System.out.println("enter number");
    Scanner sc =new Scanner(System.in);
    int num = sc.nextInt();
    for(int i=0;i<a.length;i++){
        for(int j=i+1;j<a.length;j++){
             if (a[i]<a[j]) {
                 int temp =a[i];
                 a[i]=a[j];
                 a[j]=temp;
             }
            } 
         }


        System.out.println("max"+num+"th number is"+a[num-1]);

  
    
  }


  public static void MinNthNumber(int[] a){
    System.out.println("enter number");
    Scanner sc =new Scanner(System.in);
    int num = sc.nextInt();
    for(int i=0;i<a.length;i++){
        for(int j=i+1;j<a.length;j++){
             if (a[i]>a[j]) {
                 int temp =a[i];
                 a[i]=a[j];
                 a[j]=temp;
             }
            } 
         }


        System.out.println("min"+num+"th number is "+a[num-1]);

  
    
  }
  
      

  }

