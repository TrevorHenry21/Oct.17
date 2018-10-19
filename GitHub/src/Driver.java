import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Input = new Scanner(System.in);
		String Continue = "";
		
		
		do {
			
		System.out.println("Who made the phone? ");
		String Make = Input.nextLine();
		
		System.out.println("What kind of phone is it? ");
		String Model = Input.nextLine();
		
		System.out.println("How much did it cost? ");
		double Cost = Input.nextDouble();
		Input.nextLine();
		
		System.out.println("What service do you have? ");
		String Server = Input.nextLine();
		
		
		MobilePhone Cell = new MobilePhone(Make, Model, Cost, Server);
		
		System.out.println("What number do you want to call? ");
		
		System.out.println(Cell.Call(Input.nextInt()));
	
		System.out.println("Make a text ");
		System.out.println(Cell.Text(Input.nextLine()));
		
		Input.nextLine();
		System.out.println("To repeat the process press y");
		
		
		Continue = Input.nextLine();
		}
		while (Continue.equalsIgnoreCase("Y"));
		
		}

	
}
