
public class Exam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer num1 = new Integer(13);
		Integer num2 = new Integer(13);
		Integer num3 = new Integer("13");
		
		System.out.println("num1 �������� "+num1.intValue());
		System.out.println("num2 �������� "+num2.intValue());
		System.out.println("num3 �������� "+num3.intValue());
		
		int hap = num1.intValue()+num2.intValue();
		System.out.println(hap);
		System.out.println("2���ڵ�"+Integer.toBinaryString(hap));
		System.out.println("8���ڵ�"+Integer.toHexString(hap));
		
		System.out.println(num1.equals(num2));
		System.out.println(num2.equals(num3));
		System.out.println(num1==num2);
		System.out.println(num2==num3);
		
	}

}
