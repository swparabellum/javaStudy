
public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {3,4,5,6,7};
		System.out.println(arr.length);
		
		for(int i=0;i<arr.length; i++) {
			System.out.print(arr[i]+", ");
		}
		System.out.println( );
		
		for(int k: arr) {
			System.out.print(k+", ");
		}
		System.out.println();
		
		
		
	}

}
