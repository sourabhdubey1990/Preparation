package IntPrograms;

public class Patterns {

	public static void main(String[] args) {
		pattern1();
		System.out.println("______________________");
		pattern2();
		System.out.println("______________________");
		pattern3();
		System.out.println("______________________");
		pattern4();
		System.out.println("______________________");
		pattern5();
	}

	public static void pattern1() {

//		 * * * *
//		 * * * *
//		 * * * *
//		 * * * *

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}

	};

//	 * 
//	 * *
//	 * * *
//	 * * * *
	public static void pattern2() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}

	}

//	 1 
//	 2 2
//	 3 3 3
//	 4 4 4 4
	public static void pattern3() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" " + i);
			}
			System.out.println();
		}

	}

//	 * 
//	 *     
//	 *     
//	 * * * *
	public static void pattern4() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {

				if (i == 1 || j == 1 || i == 4 || j == 4)
					System.out.print(" *");
			}
			System.out.println();
		}

	}

//	 * 
//	 *     
//	 *     
//	 * * * *
	public static void pattern5() {
		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= 4; j++) {

				if (i == 1 || j == 1 || i == 4 || j == 4) {

					System.out.print(" *");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
