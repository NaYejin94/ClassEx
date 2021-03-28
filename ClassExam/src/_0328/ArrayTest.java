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
			
		System.out.println("\n가장 큰 수는 "+arr[4]+"입니다.");
		System.out.println("가장 작은 수는 "+arr[0]+"입니다.");
		System.out.println("중간값은 "+arr[2]+"입니다.");
		
	}

}