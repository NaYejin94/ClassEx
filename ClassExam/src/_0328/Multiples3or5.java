package _0328;


public class Multiples3or5 {

	public static int multi() {
		int sum=0;
		for(int i=1;i<1000;i++) {
			if(i%3==0 || i%5==0) {
				sum+=i;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int result = multi();
		System.out.println("1000�̸��� �ڿ������� 3,5�� ����� ���� : "+result);
	}

}
