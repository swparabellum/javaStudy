
public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] score = {79,88,91,55,95};
		int max = score[0];
		int min = score[0];
		
		for(int idx=1; idx<score.length;idx++) {
			if(score[idx]>max) {
				max=score[idx];
			}
			if(score[idx]<min) {
				min = score[idx];
			}
		}
		System.out.println("최대= " +max);
		System.out.println("최소= "+min);
	}

}
