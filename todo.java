import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class todo {
	private static List<String> currentList = new ArrayList<String>();
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("TODO MANAGER");
		System.out.println();
		System.out.println("Enter your name : ");
		String name = scanner.nextLine();
		 
		int menu = -1;
		while(menu != 0) {
			menu = menu();
			switch(menu) {
			case 1:
				showList();
				break;
			case 2:
				addItem();
				break;
			case 3:
				removeItem();
				break;
			case 0:
				break;
			default:
				System.out.println("Enter a valid option : ");
			}
		}
	}
	public static int menu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("----------------------------------------------");
		System.out.println("Main Menu");
		System.out.println("----------------------------------------------");
		System.out.println("0. Exit the program");
		System.out.println("1.Display to-do list");
		System.out.println("2.Add item to list");
		System.out.println("3. Remove item from list");
		System.out.println();
		System.out.print("Enter choice : ");
		int choice = scanner.nextInt();
		return choice;
	}
	public static void showList() {
		System.out.println();
		System.out.println("-----------------------------------------------");
		System.out.println("Displaying To-Do List:");
		System.out.println("-----------------------------------------------");
		int number = 0;
		for(String item : currentList) {
			System.out.println(++number + " " + item);
		}
		System.out.println("-----------------------------------------------");
		
	}
	
	public static void addItem() {
		System.out.println("Add item:");
		System.out.println("------------------------------------------------");
		System.out.print("Enter an item : ");
		Scanner scanner = new Scanner(System.in);
		for(int i=1;i<=5;i++) {
			String item = scanner.nextLine();
			if(currentList.contains(item)) {
			   System.out.println("You have already entered the task! Enter some other task");
			   i--;
			}
			else {
				currentList.add(item);
			}
			}
		showList();
	}

	public static void removeItem() {
		// TODO Auto-generated method stub
		System.out.println("Remove item");
		System.out.println("--------------------------------------------------------");
		Scanner s = new Scanner(System.in);
		System.out.println("What do you want to remove?");
		int index = s.nextInt();
		if((index-1)<0 || index>currentList.size()) {
			System.out.println("Wrong index number! Please enter in range of 1 to "+currentList.size());
		}	else {
			currentList.remove(index-1);
		}
		System.out.println("----------------------------------------------------------");
		System.out.println("item is successfully removed!");
		showList();

	}

}
