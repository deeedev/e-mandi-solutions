package model;

public class Crops {

	String name;
	double price;
	String msp;
	double quantity;

	String[] cropsList = { "Wheat", "Rice", "Pulses", "Cotton", "Potato", "Tomato", "SugarCane", "Coconut", "Onion",
			"Orange", "Apple" };

	public String[] getCropsList() {
		return cropsList;
	}

	public void setCropsList(String[] cropsList) {
		this.cropsList = cropsList;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getMsp() {
		return msp;
	}

	public void setMsp(String msp) {
		this.msp = msp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

}