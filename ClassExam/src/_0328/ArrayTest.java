package _0328;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		int[] arr = new int[5];
		
		for(int i=0;i<5;i++) {
			arr[i] = (int)(Math.random()*100+1);

			for(int k=0;k<i;k++) {
				if(arr[i] == arr[k]) {
					i--; 
					break;
				}
			}
		}//for

		Arrays.sort(arr);
			
		for(int n : arr) {
			System.out.print(n+" ");
		}
			
		System.out.println("\n���� ū ���� "+arr[4]+"�Դϴ�.");
		System.out.println("���� ���� ���� "+arr[0]+"�Դϴ�.");
		System.out.println("�߰����� "+arr[2]+"�Դϴ�.");
		
	}

}