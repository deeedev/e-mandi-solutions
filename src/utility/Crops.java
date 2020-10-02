package utility;

public class Crops {

	String name;
	String price;
	String msp;
	String quantity;

	String[] cropsList = { "Wheat", "Rice", "Pulses", "Cotton", "Potato", "Tomato", "SugarCane", "Coconut", "Onion",
			"Orange", "Apple" };

	public String[] getCropsList() {
		return cropsList;
	}

	public void setCropsList(String[] cropsList) {
		this.cropsList = cropsList;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
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

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

}