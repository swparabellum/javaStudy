
public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BB ob = new BB();
		ob.sets(10, 12);
		ob.sum();
		System.out.println(ob.total);
	}

}

class AA{
	int i,j;
	public void sets(int x, int y) {
		i = x;
		j = y;
		
	}
}

class BB extends AA {
	int total;
	public void sum() {
		total = i+j;
	}
}