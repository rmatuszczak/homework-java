package chapter2;

public class BigOhNotation {

	static long startTime = 0L;
	static long endTime = 0L;
	long runTime = 0L;
	long n = 0L; //since n is being multiplied by itself in alg5(),it has to be a long instead on an integer
				 //Otherwise, the program cannot execute as n becomes too large for this data type. 
	

	// algorithm 1
	public void alg1() {
		startTime = System.nanoTime();
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum++;
		}
		endTime = System.nanoTime();
		runTime = endTime - startTime;
		System.out.println("For N= " + n + " the total running time of the algorithm number 1 is equal to "
				+ "["+String.format("%.8f", (float)runTime/1000000000)+"]" );

	}

	// algorithm 2
	public void alg2() {
		startTime = System.nanoTime();
		int sum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				sum++;
			}
		}
		endTime = System.nanoTime();
		runTime = endTime - startTime;
		System.out.println("For N= " + n + " the total running time of the algorithm number 2 is equal to "
				+ "["+String.format("%.8f", (float)runTime/1000000000)+"]" );

	}

	// algorithm 3
	public void alg3() {
		startTime = System.nanoTime();
		int sum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n * n; j++) {
				sum++;
			}
		}
		endTime = System.nanoTime();
		runTime = endTime - startTime;
		System.out.println("For N= " + n + " the total running time of the algorithm number 3 is equal to "
				+ "["+String.format("%.8f", (float)runTime/1000000000)+"]" );
	}

	// algorithm 4
	public void alg4() {
		startTime = System.nanoTime();
		int sum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n * n; j++) {
				for (int k = 0; k < j; k++) {
					sum++;
				}
			}
		}
		endTime = System.nanoTime();
		runTime = endTime - startTime;
		System.out.println("For N= " + n + " the total running time of the algorithm number 4 is equal to "
				+ "["+String.format("%.8f", (float)runTime/1000000000)+"]" );
	}

	
	
	BigOhNotation(int N){
		n=N;
	}
	
	public static void test10Elements(){
		BigOhNotation test1 = new BigOhNotation(10);
		test1.alg1();
		test1.alg2();
		test1.alg3();
		test1.alg4();
	}
	
	public static void test100Elements(){
		BigOhNotation test2 = new BigOhNotation(100);
		test2.alg1();
		test2.alg2();
		test2.alg3();
		test2.alg4();
	}
	
	public static void test1000Elements(){
		BigOhNotation test3 = new BigOhNotation(1000);
		test3.alg1();
		test3.alg2();
		test3.alg3();
		test3.alg4();
	}
	
	public static void test10000Elements(){
		BigOhNotation test4 = new BigOhNotation(10000);
		test4.alg1();
		test4.alg2();
		test4.alg3();
		test4.alg4();
	}
	
	
	
	
	public static void main(String[] args) {
		test10Elements();
		test100Elements();
		test1000Elements();
		test10000Elements();
		
	}
}
