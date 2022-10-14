package lolo;

import java.util.Arrays;

public class Arraytwodimen {
	public static void main(String[] args) {
		
	
	int[][] marks=new int[2][3];
	marks[0][0]=80;
	marks[0][1]=15;
	marks[0][2]=25;
	marks[1][0]=56;
	marks[1][1]=95;
	marks[1][2]=85;
	System.out.println("marks");
	System.out.println(Arrays.deepToString(marks));
	}

}
