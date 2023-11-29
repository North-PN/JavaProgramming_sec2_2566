import java.util.*;
public class Lab401 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int currentNumber,previousNumber ;
		
		System.out.print("Input value of X : ");
		previousNumber = scan.nextInt();
		
		System.out.print("Input value of Y : ");
		currentNumber = scan.nextInt();
		while(currentNumber<previousNumber) 
		{
			System.out.print("Input value of Y, again : ");
			currentNumber = scan.nextInt();
				if(currentNumber>previousNumber) 
					{
						break;
					}
		}
		System.out.println();
		for(int i =previousNumber+1;i<=currentNumber;i++)
		{
			int total = previousNumber + i ;
			System.out.println(previousNumber + "+" + i +"="+ total);
			previousNumber=total;
		}
		
		
	}

}
