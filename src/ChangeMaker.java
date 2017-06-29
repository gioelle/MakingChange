import java.util.Scanner;

public class ChangeMaker {
	
	public static void main(String[] args){
		System.out.println("Please enter the change due in dollars and cents: ");
		Scanner input = new Scanner (System.in);
		double dollarsandcents = input.nextDouble();
		System.out.println("you'll receive " + makinChange(dollarsandcents) + " coins.");
	}
		
	public static int makinChange(double dollarsandcents){
		
		int coinsdue = 0;
		int change = (int) dollarsandcents * 100;
		while (change >= 100) {
			coinsdue += 4;
			change -= 100;
		} 
		while (change >= 25){
			coinsdue += 1;
			change -= 25;
		} 
		while (change >= 10){
			coinsdue += 1;
			change -= 10;
		}
		while (change >= 5){
			coinsdue += 1;
			change -= 5;
		}
		while (change > 0){
			coinsdue += 1;
			change -= 1;
		}
		
	return coinsdue;
	}
		
		
	
}
