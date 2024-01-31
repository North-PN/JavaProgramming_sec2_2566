import java.util.*;
class CoffeeShopDemo1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Barista staff1 = new Barista("Leon",'M');
		Barista staff2 = new Barista("Clair",'F');
		
		System.out.print("Type of Drink  "
							+ "\n[1] Hot"
							+ "\n[2] Cold"
							+ "\n: ");
		int typedrink = input.nextInt();
		input.nextLine();
		Line();
		
		System.out.print("Type of Coffee"
							+ "\n[1] Americano"
							+ "\n[2] Espresso"
							+ "\n[3] Cappuccino"
							+ "\n: ");
		int typeCoffee = input.nextInt();
		input.nextLine();
		Line();
		
		System.out.print("Type of size "
							+ "\n[S] Short"
							+ "\n[T] Tall"
							+ "\n[G] Grand"
							+ "\n[V] Venti"
							+ "\n: ");
		char typeSize = input.nextLine().charAt(0);
		Line();
		
		System.out.print("Barista"
							+ "\n[1] Leon"
							+ "\n[2] Claire"
							+ "\n: ");
		int bar = input.nextInt();
		input.nextLine();
		Line();
		System.out.println();
		
		if(bar == 2) {
			Coffee order = new Coffee(typedrink,typeSize,typeCoffee,staff2);
			System.out.println(order);
		}else {
			Coffee order = new Coffee(typedrink,typeSize,typeCoffee,staff1);
			System.out.println(order);
		}
		
		
		
		
		
	}
	public static void Line() {
		System.out.println("-".repeat(60));
	}
}