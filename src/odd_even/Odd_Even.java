package odd_even;

import java.util.Scanner;

public class Odd_Even {

	public static void main(String[] args) {
		int num;
	    System.out.println("enter the number");
	    
	    Scanner input =new Scanner (System.in);
	    num = input.nextInt();
	    if (num %2 == 0)
	    	System.out.println("is even number");
	    else
	    	System.out.println("is odd number");
		input.close();
    	}

}
