import java.util.Scanner;
public class RunAnimal {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		String choice;
		
		System.out.println("Choose an animal, Press B for Bird, C For Cat, or D for Dog: ");
		choice = sc.nextLine();
		
		if (choice.equalsIgnoreCase("B")) {
			Bird b = new Bird();
			b.eat();
			b.sleep();
			b.makesound();
		} 
		else if (choice.equalsIgnoreCase("C")) {
			Cat c = new Cat();
			c.eat();
			c.sleep();
			c.makesound();
		}
		else if (choice.equalsIgnoreCase("D")){
			Dog d = new Dog();
			d.eat();
			d.sleep();
			d.makesound();
		}
		else {
		 System.out.print("Invalid Input");
		}
		sc.close();
	}
	
}