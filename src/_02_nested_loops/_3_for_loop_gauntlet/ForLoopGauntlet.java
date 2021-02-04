package _02_nested_loops._3_for_loop_gauntlet;

public class ForLoopGauntlet {
public static void main(String[] args) {
	//display all numbers from 0-100
	/* for (int i = 0; i < 101; i++) {
		System.out.println(i); } */
		
	//display all numbers from 100-0
	/* for (int a = 100; a > -1; a--) {
		System.out.println(a); } */
	
	//display all even numbers from 2-100
	/* for (int b = 2; b < 101; b++) {
		if (b % 2 == 0) {
			System.out.println(b);
		}
	} */
	
	//display all odd numbers from 1-99
	/* for (int c = 1; c < 100; c++) {
		if (c % 2 != 0) {
			System.out.println(c);
		}
	} */
	
	//display numbers 1-500, print if odd or even
	/* for (int d = 1; d < 501; d++) {
		if (d % 2 == 0) {
			System.out.println(d + " is even");
		}
		else if (d % 2 != 0) {
			System.out.println(d + " is odd");
		}
	} */
	
	//display all multiples of 7 from 0 to 777
	/* for (int e = 0; e < 778; e++) {
		if (e % 7 == 0) {
			System.out.println(e);
		}
	} */
	
	//display all the years I was alive and how old I was in each
	/* int year = 2006;
	for (int f = 0; f < 15; f++) {
		System.out.println("In " + year + ", I was " + f + " years old");
		year = year + 1;
	} */ 
	
	//nested for loop #1
	/* for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			System.out.println(i + " " + j);
		}
	} */
	
	//display all numbers from 1-9 in a 3x3 grid
	/* for (int i = 1; i < 8; i+=3) {
		System.out.print(i + " ");
		 for (int j = i + 1; j < i+2; j++) {
			int a = j + 1;
			 System.out.print(j + " " + a + " "); 
		}
		 System.out.println();
	} */
	
	//display all numbers from 1-100 in a 10x10 grid
	for (int i = 1; i < 100; i+=10) {
		System.out.print(i + " ");
		for (int j = i + 1; j < i+10; j++) { 
			System.out.print(j + " ");
		}
		System.out.println();
	}
	}
}
