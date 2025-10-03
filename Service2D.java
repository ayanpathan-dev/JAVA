import java.util.*;
class Service2D{
   public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter row size");
   int sizeR = sc.nextInt(); 
   System.out.println("Enter column size");
   int sizeC = sc.nextInt(); 
   int[][] arr= new int[sizeR][sizeC];
   //ArrayAccept(arr,sizeR,sizeC);
   //ArrayDisplay(arr,sizeR,sizeC);
   //2ArrayAdd(arr,sizeR,sizeC);
   //ArrayAddColumn(arr,sizeR,sizeC);
   //ArrayAddrow(arr,sizeR,sizeC);
  }
public static void ArrayAccept(int[][] a,int sizeR,int sizeC){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter array elements");
    for(int i=0 ;i <sizeR ;i++){
      for(int j=0 ;j <sizeC ;j++){
       a[i][j]=sc.nextInt();
      }
     }
   }

public static void ArrayDisplay(int[][] a,int sizeR,int sizeC){
    Scanner sc= new Scanner(System.in);
    System.out.println("array elements are");
    for(int i=0 ;i <sizeR ;i++){
      for(int j=0 ;j <sizeC ;j++){
       System.out.print(a[i][j]+"\t");
      }
      System.out.println();
     }
   }

public static void ArrayAdd(int[][] a,int sizeR,int sizeC){
    Scanner sc= new Scanner(System.in);
    int sum=0;
    System.out.println("array elements are");
    for(int i=0 ;i <sizeR ;i++){
      for(int j=0 ;j <sizeC ;j++){
       sum= sum+a[i][j];
      }
      System.out.println();
     }
    System.out.println("sum of 2D array is "+sum);
   }
public static void ArrayAddColumn(int[][] a,int sizeR,int sizeC){
	System.out.println("Array Column Addition is ");
	Scanner sc= new Scanner(System.in);
    int[] sum =new int[sizeC];
    System.out.println("array elements are");
    for(int i=0 ;i <sizeR ;i++){
      for(int j=0 ;j <sizeC ;j++){
       sum[i]= sum[i]+a[i][j];
      }
      System.out.println();
     }
    for(int i=0;i<sum.length;i++)
    {
    System.out.println(i +"column"+sum[i]);
    }
   }

public static void ArrayAddrow(int[][] a,int sizeR,int sizeC){
    Scanner sc= new Scanner(System.in);
    int[] sum =new int[sizeC];
    System.out.println("array elements are");
    for(int i=0 ;i <sizeR ;i++){
      for(int j=0 ;j <sizeC ;j++){
       sum[i]= sum[i]+a[j][i];
      }
      System.out.println();
     }
    for(int i=0;i<sum.length;i++)
    {
    System.out.println(sum[i]);
    }
   }

public static void Max(int[][] a,int sizeR,int sizeC){
    int max=a[0][0];
    for(int i=0;i<a.length;i++) {
    	for(int j=0;j<a[i].length;j++){
    		if(max<a[i][j]) {
    			max=a[i][j];
    		}  		
    	}
    }
    System.out.println("max is "+ max);
   }

public static void Maxrow(int[][] a,int sizeR,int sizeC){
    int[] max= new int[sizeR];
    for(int i=0;i<a.length;i++){
    	
    	max[i]=a[i][0];
    	for(int j=0;j<a[i].length;j++){
    		if(max[i]<a[i][j]) {
    			max[i]=a[i][j];
    		}  
    	}
    	System.out.println("max num in row "+i +" is " + max[i]);
    }
   }

public static void Maxcolumn(int[][] a,int sizeR,int sizeC){
    int[] max= new int[sizeR];
    for(int i=0;i<a.length;i++){
    	max[i]=a[i][0];
    	for(int j=0;j<a[i].length;j++){
    		if(max[i]<a[j][i]) {                  //wrong logic
    			max[i]=a[j][i];
    		}  
    	}
    	System.out.println("max num in column "+i +" is " + max[i]);
    }
   }



public static void MatrixMulti(int[][] a ,int[][] b,int sizeR,int sizeC){
    int[][] mul= new int[sizeR][sizeC];
    for(int i=0;i<a.length;i++){
    	for(int j=0;j<a[i].length;j++){
    		for(int k=0;k<a[i].length;k++) {
    			mul[i][j]=a[i][k] * b[k][j];
    		}/////////////////////////////
    	}
    
    }
    for(int i=0;i<a.length;i++){
    	for(int j=0;j<a[i].length;j++){
    	System.out.print(mul[i][j]+"\t");
    }
    	System.out.println();
   }

}




public static void Transpose(int[][] a,int sizeR,int sizeC){
    Scanner sc= new Scanner(System.in);
    int[][] temp =new int[sizeR][sizeC];
    for(int i=0 ;i <sizeR ;i++){
        for(int j=0 ;j <sizeC ;j++){
         temp[i][j]=a[j][i];
        }
       }
    System.out.println("Transpose array");
    for(int i=0 ;i <sizeR ;i++){
      for(int j=0 ;j <sizeC ;j++){
       System.out.print(temp[i][j]+" \t");
      }
      System.out.println();
     }
   }



public static void Identity(int[][] a,int sizeR,int sizeC){
    Scanner sc= new Scanner(System.in);
    boolean flag= true;
    for(int i=0 ;i <sizeR ;i++){
        for(int j=0 ;j <sizeC ;j++){
         if((i==j)&&(a[i][j]!=1)){
           flag = false;
           break;
        }else if((i!=j)&&(a[i][j]!=0)){
            flag = false;
            break;
       }
      
    
   }
		public static int[][] rotateRow(int[][] arr) {
		// TODO Auto-generated method stub
		int temp[][] = new int[arr.length][arr[0].length];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				temp[i]=temp[i+1];
				
			}
		}
		int [] temp1 = temp[0];
		for(int i=0;i<temp.length-1;i++) {
			temp[i]=temp[i+1];
		}
		temp[temp.length-1]=temp1;

		return temp;
	}

	public static int[][] rotateCol(int[][] arr) {
		// TODO Auto-generated method stub
		int temp[][] = new int[arr.length][arr[0].length];
		for (int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;i++) {
				temp[i][j]=arr[i][j];
			}
		}
		
		int [] temp1 =new int[temp.length];
		for(int i=0; i<temp1.length;i++) {
			temp1[i]=temp[i][temp[0].length-1];
		}

}


