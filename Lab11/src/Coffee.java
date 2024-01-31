
public class Coffee extends Drink {
	private int typeCoffee;
	private char sizeCoffee;
	private Barista barista;
	
	Coffee(int type,char sizeCoffee,int typeCoffee,Barista barista){
		super(type,sizeCoffee);
		this.sizeCoffee = sizeCoffee;
		this.typeCoffee = typeCoffee;
		this.barista = barista;
	}
	Coffee(int type,int typeCoffee){
		this.typeCoffee = typeCoffee = type;
		this.sizeCoffee = 0;
		barista = new Barista();
	}
	public String getTypeName() {
		if(this.typeCoffee == 1) {
			return "Americano";
		}else if(this.typeCoffee == 2) {
			return "Espresso";
		}else if(this.typeCoffee == 3) {
			return "Cappuccino";
		}else {
			return "Null";
		}
	}
	public int getTypePrice() {
		if(this.typeCoffee == 1) {
			return 50;
		}else if(this.typeCoffee == 2) {
			return 55;
		}else if(this.typeCoffee == 3) {
			return 65;
		}else {
			return 0;
		}
	}
	public String getSizeName() {
		if(this.sizeCoffee == 'S'||this.sizeCoffee == 's') {
			return "Short";
		}else if(this.sizeCoffee == 'T' || this.sizeCoffee == 't') {
			return "Tall";
		}else if(this.sizeCoffee == 'G' || this.sizeCoffee == 'g') {
			return "Grand";
		}else if(this.sizeCoffee == 'V' || this.sizeCoffee == 'v') {
			return "Venti";
		}else {
			return "Null";
		}
	}
	public int getSizePrice() {
		if(this.sizeCoffee == 'S' || this.sizeCoffee == 's') {
			return 100;
		}else if(this.sizeCoffee == 'T' || this.sizeCoffee == 't') {
			return 150;
		}else if(this.sizeCoffee == 'G' || this.sizeCoffee == 'g') {
			return 200;
		}else if(this.sizeCoffee == 'V' || this.sizeCoffee == 'v') {
			return 250;
		}else {
			return 0;
		}
	}
	public int getTotalPrice() {
		return super.getTypePrice()+getTypePrice()+getSizePrice();
	}
	public String toString() {
		return super.getTypeName()+" "+getTypeName()+" "
				+ "("+getSizeName()+") is "+getTotalPrice()+" baht. "
				+ barista.getName()+"("+barista.getGenderName()+")";
	}
	
}