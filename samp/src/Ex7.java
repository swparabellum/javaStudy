
public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		int i =1;
		do {
			total +=i;
			i++;
		}while(i<=10);
		System.out.println(total);
		
		total = 0;
		i =1;
		for(i=1;i<=10;i++) {
			total +=i;
		}
		System.out.println(total);
	}

}
