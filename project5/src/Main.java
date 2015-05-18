
public class Main {

	public static void main(String[] args){
		Person student = new Person("Roderick Morris", 22, "404-901-5919", "1275 Autumn Hill Lane");
		System.out.println(student.getName());
		System.out.println(student.getAge());
		System.out.println(student.getPhoneNumber());
		System.out.println(student.getAddress());
		
		student.growOlder();
		
		System.out.println(student.getAge());
		
		System.out.println(student.greeting());
	}
	
	
}