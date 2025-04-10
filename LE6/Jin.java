
class Jin extends Decorator {
	Jin(Offereing offereing) {
		this.offereing = offereing;
	}

	String getName() {
		return offereing.getName()+" with Jin";
	}

	int getPrice() {
		return offereing.getPrice()+40;
	}
}