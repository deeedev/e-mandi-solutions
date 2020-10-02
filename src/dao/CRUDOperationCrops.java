package dao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

import utility.Crops;

public class CRUDOperationCrops {

	Map<String, Double> mapCropsPrice = new TreeMap<String, Double>();
	Map<String, Crops> mapCropsMSP = new TreeMap<String, Crops>();

	public Map<String, Double> getMapCropsPrice() {
		return mapCropsPrice;
	}

	public void setMapCropsPrice(Map<String, Double> mapCropsPrice) {
		this.mapCropsPrice = mapCropsPrice;
	}

	public Map<String, Crops> getMapCropsMSP() {
		return mapCropsMSP;
	}

	public void setMapCropsMSP(Map<String, Crops> mapCropsMSP) {
		this.mapCropsMSP = mapCropsMSP;
	}

	Crops c = new Crops();

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public void setMinimumSupportPrice() throws IOException {
		// TODO Auto-generated method stub

		for (String name : c.getCropsList()) {
			Crops c1 = new Crops();
			c1.setName(name);

			System.out.printf("Please Enter Minimum Support Price for %s", name);
			c1.setMsp(br.readLine());

			mapCropsMSP.put(name, c1);
		}

		System.out.println("******* Minimum Support Price Updated *******\n");
	}

}
