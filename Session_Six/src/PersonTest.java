//Driver class that instantiates all three classes and outputs their toString() methods
public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person("Gibson", "Adam", "10 Barber Dr.", "289-456-1224");
		Student s1 = new Student("Johnson", "Mary", "589 Yulino St", "259-789-4859", "Senior");
		Employee e1 = new Employee("Spinkle", "Loffrey", "458 Gertingston Rd", "223-753-9515", "156B", 50000.00, 4, 25, 1985);
		
		//Assigns Student reference to a Person variable
		Person s2 = new Student("Johnson", "Mary", "589 Yulino St", "259-789-4859", "Senior");
		
		System.out.println(p1);
		System.out.println(s1);
		System.out.println(e1);
		System.out.println(s2);
		
		

	}

}
