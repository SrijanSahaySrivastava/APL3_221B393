
public class Main
{
	public static void main(String[] args) {
		Offereing offereing = new Coffee();
		offereing = new Rum(offereing);
		offereing = new Jin(offereing);
		System.out.println("Name: " + offereing.getName());
		System.out.println("Price: " + offereing.getPrice());
	}
}
