import java.util.Arrays;

public class Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str1 = new StringBuffer("안녕 자바"); //문자열 길이 + 15
		System.out.println("버퍼 내용 "+str1);
		System.out.println("버퍼 크기 "+str1.length());
		System.out.println("버퍼 용량 "+str1.capacity());
		
		System.out.println("뒤로 추가"+str1.append(" 문자열"));
		System.out.println("끼워 넣기"+str1.insert(3, " power "));
		System.out.println("4번 idx의 문자"+str1.charAt(4));
		str1.setCharAt(0, '정');
		System.out.println("0번 인덱스의 값을 정으로 변경. " +str1);
		
		str1.setLength(8); //문자열 길이를 8로 설정 나머지는 손실.
		System.out.println("버퍼 내용 "+str1);
		System.out.println("버퍼 크기 "+str1.length());
		System.out.println("버퍼 용량 "+str1.capacity());
		System.out.println("문자열 역순 출력 "+str1.reverse());
		
	}
	

}
