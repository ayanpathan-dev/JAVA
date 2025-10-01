import java.util.*;
public class Test2D {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of row");
		int r =sc.nextInt();
		System.out.println("Enter size of column");
		int c =sc.nextInt();
		int[][] arr = new int[r][c];
		Service2D.ArrayAccept(arr,r,c);
        Service2D.ArrayDisplay(arr, r, c);
        //Service2D.Max(arr, r, c);
        //Service2D.Maxrow(arr, r, c);
        //Service2D.Maxcolumn(arr, r, c);
        //Service2D.MatrixMulti(arr, arr, r, c);
        //Service2D.Transpose(arr, r, c);
	}

}
