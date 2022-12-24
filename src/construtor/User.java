package construtor;

public class User {
	
	// instance variable
	String userName;
	String password;
	
	// ============== default constructor ===============
	
//	User(){
//		userName = "root";
//		password = "1234";
//	}
	
	
	// ============= parameterized constructor =============
	
//	User(String un, String psw){
//		
//		userName = un;
//		password = psw;
//	}
	
	User(String userName, String password){
		
		this.userName = userName;
		this.password = password;
		
		// 'this' keyword is used when instance variable and local variable name is same
		// 'this' keyword represents current object
	}
	
	
	
	void print() {
		System.out.println("Username = "+userName);
		System.out.println("Password = "+password);
	}
	
	public static void main(String[] args) {
		
		
		User u = new User("SUPREME", "rw23!@");
		
		u.print();
		
		// Object obj = new Object();
		
		/*
		 * Class {@Code Object} is the root of the class hierarchy.
		 * Every class has {@code Object} as a superclass.
		 * All objects, including arrays, implement the methods of this class.
		 */
	}

}
