package makeFunctions;

public class ChecknameAge {
	
//	static void PrintWelcomeMsg(String name, int age) {
//		if (age>18) {
//			System.out.println("hello " + name + " you can enter ");
//		} else {
//			System.out.println(name +" you can't enter, you must be above 18");
//		}
//	
//	}
	
	
		static double salarymessage (String name, int age, double salary) {
			if (age>18) {
				System.out.println("hello " + name + " you can enter ");
				return salary + 20;
			} else {
				System.out.println(name +" you can't enter, you must be above 18");
				return salary=0;
			}
			
			
		}
		
		static double calTax (double salary, double tax) {
			if(salary>=300) {
				return salary = salary - salary*tax;
				
			} else
				return salary- salary ;
		}
	
		static double mod (double nn, double mm) {
			return nn%mm;
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
//		PrintWelcomeMsg("zain",20);
//		salarymessage("meow", 21, 440);
//		System.out.println(salarymessage("meo", 23, 830));
		
		System.out.println(calTax(310, 0.16)); 
		System.out.println(calTax(299,.99));
		System.out.println(mod(13, 6));
		
	}

}
