package _0328;

import java.util.Scanner;

class Employee{
	private String name;
	private String dept;
	private int pay;
	private double score;
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setDept(String dept) {
		this.dept=dept;
	}
	
	public String getDept() {
		return dept;
	}
	
	public void setPay(int pay) {
		this.pay=pay;
	}
	
	public int getPay() {
		return pay;
	}
	
	public void setScore(double score) {
		this.score=score;
	}
	
	public double getScore() {
		return score;
	}
	
	public void employee() {
		System.out.println("�̸��� "+name+"�̰� "+dept+"���� �ٹ��ϸ� �޿��� "+pay+"�� �Ի缺���� "+score+"�Դϴ�.");
	}
}

public class EmployeeExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����̸� : ");
		String name=sc.next();
		System.out.println("�ٹ��μ� : ");
		String dept=sc.next();
		System.out.println("�޴±޿� : ");
		int pay=sc.nextInt();
		System.out.println("�Ի����� : ");
		double score=sc.nextDouble();
		
		Employee e = new Employee();
		
		e.setName(name);
		e.setDept(dept);
		e.setPay(pay);
		e.setScore(score);
		
		e.employee();
	}

}
