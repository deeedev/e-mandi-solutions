package utility;

public class Stock {

	String cropsName;
	String quantity;
	String cropsList[] = { "Wheat", "Rice", "Sugarcane", "Pulses", "Tea", "Coffee", "Cotton" };

	public String getProductName() {
		return cropsName;
	}

	public void setProductName(String productName) {
		cropsName = productName;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getCropsName() {
		return cropsName;
	}

	public void setCropsName(String corpsName) {
		cropsName = corpsName;
	}

	public String[] getCropsList() {
		return cropsList;
	}

	public void setCropsList(String[] corpsList) {
		cropsList = corpsList;
	}

}
