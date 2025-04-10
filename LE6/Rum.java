class Rum extends Decorator {
	Rum(Offereing offereing) {
		this.offereing = offereing;
	}

	String getName() {
		return offereing.getName()+" with Rum";
	}

	int getPrice() {
		return offereing.getPrice()+55;
	}
}