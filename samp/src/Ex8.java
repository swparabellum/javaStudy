
public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		
		for (int n=1;n<=10;n++) {
			if(n==3) {break;}
			total +=n;
		}
		System.out.println(total);
		
		for(int i=1;i<=100;i++) {
			if(i%5 != 0)continue;
			System.out.print(i+ " ");
		}
	}

}
