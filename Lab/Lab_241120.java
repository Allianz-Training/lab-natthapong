package Lab;

public class Lab_241120 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createString();
		compareStrPrac();
		compareStrEqEqPrac();
		contains();
		substr();
		trim();
		System.out.println("----------Lab12----------");
		lab12();
		System.out.println("----------Lab13----------");
		lab13();

	}

	public static void createString() {
		char[] myChar = { 'C', 'h', 'A', 'r' };
		String str = new String(myChar);
		System.out.println(str);
	}

	public static void compareStrPrac() {
		String myString = "FirstString";
		String compareString_1 = "FirstString";
		String compareString_2 = "firstString";
		if (myString.equals(compareString_1))
			System.out.println("Equal");
		else
			System.out.println("Not equal");
		if (myString.equals(compareString_2))
			System.out.println("Equal");
		else
			System.out.println("Not equal");
	}

	public static void compareStrEqEqPrac() {
		String firstString = "HelloWorld";
		String secondString = "HelloWorld";
		if (firstString == secondString)
			System.out.println("True");
		else
			System.out.println("False");
		if (firstString == (new String(secondString)))
			System.out.println("True");
		else
			System.out.println("False");

	}

	public static void contains() {
		String str = "This is a str hihihihi HAHAHAHAHA";
		System.out.println("haha " + str.contains("haha"));
		System.out.println("HAHA " + str.contains("HAHA"));
	}

	public static void substr() {
		String str = "0123456789";
		System.out.println(str.substring(4));
		System.out.println(str.substring(0, 5));
		System.out.println(str.substring(0, 10));
	}

	public static void trim() {
		String str = "  trwegfdsj sdlkf;jakl fsdmkfl   ";
		System.out.println(str);
		System.out.println(str.trim());
	}

	public static void lab12() {
		String String1 = "You and Me";
		String String2 = " you and me ";

		System.out.println("\nLab12-1");
		if (String1.equals(String2)) {
			System.out.println("String1 equals to String2");
		} else {
			System.out.println("String1 not equals to String2");
		}
		System.out.println("\nLab12-2");
		System.out.println("You and Me : Me " + String1.contains("Me"));
		System.out.println("You and Me : me " + String1.contains("me"));
		System.out.println("\nLab12-3");
		System.out.println("You and Me : length = " + String1.length());
		System.out.println("\nLab12-4");
		System.out.println("You and Me : substr to = " + String1.substring(4));
		System.out.println("\nLab12-5");
		System.out.println(String2.trim());
		System.out.println("\nLab12-6");
		System.out.println(String1 + " to " + String1.toUpperCase());
		System.out.println("\nLab12-7");
		System.out.println(String2.toUpperCase().trim());
	}

	public static void lab13() {
		int[][] twoD_Array = { { 1, 2, 3 }, { 4, 5, 6, 7 }, { 8, 9 } };
		int sum = 0;
		for (int[] row : twoD_Array) {
			for (int i = 0; i < row.length; i++) {
				if (i == row.length - 1) {
					sum += row[i];
				}
				System.out.print(row[i]);
				System.out.print(" ");
			}
		}
		System.out.println();
		System.out.println(sum);

		int[] row = { 9, 3, 5, 4 };
		for (int element : row) {
			System.out.println(element);
		}
	}

}
