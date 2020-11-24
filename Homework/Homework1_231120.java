package com.b.helloWorld;

public class Homework1_231120 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----------HW1.1----------");
		draw1(4);
		System.out.println("----------HW1.2----------");
		draw2(4);
		System.out.println("----------HW1.3----------");
		draw3(4);
		System.out.println("----------HW1.4----------");
		draw4(4);
		System.out.println("----------HW1.5----------");
		draw5(4);
		System.out.println("----------HW1.6----------");
		draw6(4);
		System.out.println("----------HW1.7----------");
		draw7(4);
		System.out.println("----------HW1.8----------");
		draw8(4);
		System.out.println("----------HW2.0----------");
		String[][] table = { { "1", "2", "3" }, { "4", "5", "6" }, { "7", "8", "9" } };
		multiplyTable(table);
		System.out.println("----------HW3.1----------");
		draw9(4);
		System.out.println("----------HW3.2----------");
		draw10(4);
		System.out.println("----------HW3.3----------");
		draw11(4);
		System.out.println("----------HW3.4----------");
		draw12(4);
		System.out.println("----------HW3.5----------");
		draw13(4);
		System.out.println("----------HW3.6----------");
		draw14(4);
		System.out.println("----------HW3.7----------");
		draw15(4);
		System.out.println("----------HW3.8----------");
		draw16(4);
		System.out.println("----------HW3.9----------");
		draw17(4);
		System.out.println("----------HW4.0----------");
//		Scanner scanner = new Scanner(System.in);
//		String inputString = scanner.nextLine();
		String inputString = "10";
		keyboard(inputString);
//		scanner.close();
		System.out.println("----------HW5.1----------");
		draw18(4);
		System.out.println("----------HW5.2----------");
		draw19(4);
		System.out.println("----------HW5.3----------");
		draw20(4);
		System.out.println("----------HW5.4----------");
		draw21(4);
		System.out.println("----------HW5.5----------");
		draw22(4);
		System.out.println("----------HW5.6----------");
		draw23(4);
		System.out.println("----------HW5.7----------");
		draw24(4);
		System.out.println("----------HW5.8----------");
		draw25(4);
	}

	public static void draw1(int n) {
		String out = "";
		for (int i = 0; i < n; i++) {
			out += "*";
		}
		System.out.println(out);
	}

	public static void draw2(int n) {
		String out = "";
		for (int i = 0; i < n; i++) {
			out += "*";
		}
		for (int i = 0; i < n; i++) {
			System.out.println(out);
		}
	}

	public static void draw3(int n) {
		String out = "";
		for (int i = 0; i < n; i++) {
			out += i + 1;
		}
		for (int i = 0; i < n; i++) {
			System.out.println(out);
		}
	}

	public static void draw4(int n) {
		String out = "";
		for (int i = n; i > 0; i--) {
			out += i;
		}
		for (int i = 0; i < n; i++) {
			System.out.println(out);
		}
	}

	public static void draw5(int n) {
		for (int i = 1; i <= n; i++) {
			String out = "";
			for (int j = 1; j <= n; j++) {
				out += i;
			}
			System.out.println(out);
		}
	}

	public static void draw6(int n) {
		for (int i = n; i > 0; i--) {
			String out = "";
			for (int j = 1; j <= n; j++) {
				out += i;
			}
			System.out.println(out);
		}
	}

	public static void draw7(int n) {
		for (int i = 0; i < n; i++) {
			String out = "";
			for (int j = 1; j <= n; j++) {
				out += i * 4 + j;
			}
			System.out.println(out);
		}
	}

	public static void draw8(int n) {
		for (int i = n - 1; i >= 0; i--) {
			String out = "";
			for (int j = n; j > 0; j--) {
				out += i * 4 + j;
			}
			System.out.println(out);
		}
	}

	public static void multiplyTable(String[][] table) {
		for (String[] row : table) {
			String out = "";
			for (int i = 0; i < row.length; i++) {
				if (i != row.length - 1) {
					out += Integer.parseInt(row[i]) * 2 + ", ";
				} else {
					out += Integer.parseInt(row[i]) * 2;

				}
			}
			System.out.println(out);
		}
	}

	public static void draw9(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(i * 2);
		}
	}

	public static void draw10(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.println(i * 2);
		}
	}

	public static void draw11(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(j * i);
			}
			System.out.println("");
		}
	}

	public static void draw12(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					System.out.print("-");
				} else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}

	public static void draw13(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = n - 1; j >= 0; j--) {
				if (i == j) {
					System.out.print("-");
				} else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}

	public static void draw14(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j > i) {
					System.out.print("-");
				} else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}

	public static void draw15(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = n - 1; j >= 0; j--) {
				if (i > j) {
					System.out.print("-");
				} else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}

	public static void draw16(int n) {
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n; j++) {
				if (j > i) {
					System.out.print("-");
				} else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
		for (int i = 0; i < n; i++) {
			for (int j = n - 1; j >= 0; j--) {
				if (i > j) {
					System.out.print("-");
				} else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}

	public static void draw17(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j > i) {
					System.out.print("-");
				} else {
					System.out.print(i + 1);
				}
			}
			System.out.println("");
		}
		for (int i = n - 1; i > 0; i--) {
			for (int j = 0; j < n; j++) {
				if (j > i - 1) {
					System.out.print("-");
				} else {
					System.out.print(i);
				}
			}
			System.out.println("");
		}
	}

	public static void keyboard(String inputString) {
		for (int i = 1; i <= 12; i++) {
			System.out.println(inputString + " x " + i + " = " + Integer.parseInt(inputString) * i);
		}
	}

	public static void draw18(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i + j < n - 1) {
					System.out.print("-");
				} else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}

	public static void draw19(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i > j) {
					System.out.print("-");
				} else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}

	public static void draw20(int n) {
		for (int i = 0; i < n; i++) {
			if (i != n - 1) {
				for (int j = 0; j < n; j++) {
					if (i + j < n - 1) {
						System.out.print("-");
					} else {
						System.out.print("*");
					}
				}
				System.out.println("");
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i > j) {
					System.out.print("-");
				} else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}

	public static void draw21(int n) {
		int num = 1;
		for (int i = 0; i < n; i++) {
			if (i != n - 1) {
				for (int j = 0; j < n; j++) {
					if (i + j < n - 1) {
						System.out.print("-");
					} else {
						System.out.print(num);
						num++;
					}
				}
				System.out.println("");
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i > j) {
					System.out.print("-");
				} else {
					System.out.print(num);
					num++;
				}
			}
			System.out.println("");
		}
	}

	public static void draw22(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2 * n - 1; j++) {
				if (i + j + 1 < n || j - i >= n) {
					System.out.print("-");
				} else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}

	public static void draw23(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2 * n - 1; j++) {
				if (i > j || j + i >= n + 3) {
					System.out.print("-");
				} else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}

	public static void draw24(int n) {
		for (int i = 0; i < 2 * n - 1; i++) {
			for (int j = 0; j < 2 * n - 1; j++) {
				if (i + j + 1 < n || j - i >= n || i - j >= n || i + j >= 3 * n - 2) {
					System.out.print("-");
				} else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}

	public static void draw25(int n) {
		int num = 1;
		for (int i = 0; i < 2 * n - 1; i++) {
			for (int j = 0; j < 2 * n - 1; j++) {
				if (i + j + 1 < n || j - i >= n || i - j >= n || i + j >= 3 * n - 2) {
					System.out.print("-");
				} else {
					System.out.print(num);
					num++;
				}
			}
			System.out.println("");
		}
	}
}
