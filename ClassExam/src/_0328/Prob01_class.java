package _0328;

class Prob01{
	private int radius;
	
	Prob01(int radius){
		this.radius=radius;
	}
	
	public double area() {
		double area = radius*radius*3.14;
		return area;
	}
}

public class Prob01_class {

	public static void main(String[] args) {
		Prob01 p1 = new Prob01(10);
		Prob01 p2 = new Prob01(2);
		
		System.out.println("�ڹ������� ������ "+p1.area());
		System.out.println("�ڹٵ����� ������ "+p2.area());
	}

}
