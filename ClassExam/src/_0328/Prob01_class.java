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
		
		System.out.println("자바피자의 면적은 "+p1.area());
		System.out.println("자바도넛의 면적은 "+p2.area());
	}

}
