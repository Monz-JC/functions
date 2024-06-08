package makeFunctions;

import java.util.Scanner;

public class FuncNameCapital {
	
	static String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner (System.in);
		name = scanner.nextLine();
		
		CAPITALNAME("meo");
		
	}
	
	static void  CAPITALNAME (String kk) {
		System.out.println(name.toUpperCase());
	}

}
