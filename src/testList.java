public class testList {

	public static void main(String[] args) {

		LinkedList l = new LinkedList();

		String name;
		int age;

		int choice = 0;
		while (choice != 10) {
			System.out.println();
			System.out.println("Linked List Menu:");
			System.out.println("1: Print list");
			System.out.println("2: Delete");
			System.out.println("3: Insert");
			System.out.println("4: Search");
			System.out.println("5: Count");
			System.out.println("6: Insert last");
			System.out.println("7: Insert second");
			System.out.println("9: Initialize List");
			System.out.println("10: Exit");
			choice = Console.readInt("\nEnter Choice");
			switch (choice) {
			case 1:				
				l.printlist();
				break;
				
			case 2:
				String d = l.delete_first();
				System.out.println(d + " deleted");
				break;

			case 3:
				name = Console.readLine("Enter Name:");
				age = Console.readInt("Enter Age:");
				l.insert(name, age);
				break;

			case 4:
				name = Console.readLine("Enter Name:");
				boolean res1 = l.search(name);
				System.out.println("Found= " + res1);
				break;

			case 5:
				name = Console.readLine("Enter Name:");
				int res2 = l.count(name);
				System.out.println("Count== " + res2);
				break;

			case 6:
				name = Console.readLine("Enter Name:");
				age = Console.readInt("Enter Age:");
				l.insert_last(name, age);
				break;

			case 7:
				name = Console.readLine("Enter Name:");
				age = Console.readInt("Enter Age:");
				l.insert_second(name, age);
				break;

			case 8:
				int res3 = l.addAges();
				break;

			case 9:
				l.insert("Allen", 33);
				l.insert("Ben", 25);
				l.insert("Emer", 11);
				l.insert("Darren", 8);
				l.insert("Buck", 25);
				l.insert("Lorraine", 20);
				break;

			default:
			}
		}
	}
}
