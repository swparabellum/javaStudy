
public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []	ar = {79,88,91,55,95};
		int tot =0;
		double avg;
		
		for(int i =0; i<5;i++) {
			tot+=ar[i];
		}
		avg = ((double)tot/5);
		System.out.println("��� = "+avg);
	}

}
