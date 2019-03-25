import java.util.*;

public class KioskInfo{
	 static Scanner sc = new Scanner(System.in);
	 //The password is Payattention
	 static int password = 0;
	 static boolean choice = false;
	 static double Revenues = 0;
	 static int sstock = 120, hstock=120, Sstock = 120;
	 public static void stocks(int sstock1) {
		sstock = sstock1;
		
		}
	 public static void stocks1(int hstock1) {
			hstock = hstock1;
			
			}
	 public static void stocks2(int Sstock1) {
			Sstock = Sstock1;
			
			}
	 public static void Revenue(double rrevenue) {
			Revenues += rrevenue;
			
			}
	public static void main (String [] arg) {
		System.out.println("");
		
		while (password != 1337) {
			System.out.println("Access Denied.");
			System.out.println("What is the password?(Accepts Numerals only)");
			password = sc.nextInt();
			
		}
		if (password == 1337) {
			System.out.println("Access Granted.");
			System.out.println("Snack Stock: " + sstock);
			System.out.println("Health Stock: " + hstock);
			System.out.println("Sundries Stock: " + Sstock);
			System.out.printf("Revenue: $%6.2f\n ", Revenues);
			
			if (sstock < 115) {
				System.out.println("One or more items in the Snack section needs to be restocked!");
			}
			if (hstock < 115) {
				System.out.println("One or more items in the Health section needs to be restocked!");
			}
			if (Sstock < 115) {
				System.out.println("One or more items in the Sundries section needs to be restocked!");
			}
			System.out.println("");
			System.out.println("Would you like to go back to the main menu? True or False?");
			choice = sc.nextBoolean();
			if( choice == true) {
				
				Kiosk back = new Kiosk();
				back.setVisible(true);
			}
		
		}
	}
}
