package dao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

import model.Crops;

public class CRUDOperationCrops {

	public static Map<String, Double> mapCropsPrice = new TreeMap<String, Double>();
	public static Map<String, Crops> mapCropsMSP = new TreeMap<String, Crops>();

	public static Map<String, Double> getMapCropsPrice() {
		return mapCropsPrice;
	}

	public static void setMapCropsPrice(Map<String, Double> mapCropsPrice) {
		CRUDOperationCrops.mapCropsPrice = mapCropsPrice;
	}

	public static Map<String, Crops> getMapCropsMSP() {
		return mapCropsMSP;
	}

	public static void setMapCropsMSP(Map<String, Crops> mapCropsMSP) {
		CRUDOperationCrops.mapCropsMSP = mapCropsMSP;
	}

	Crops c = new Crops();

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public void setMinimumSupportPrice() throws IOException {
		// TODO Auto-generated method stub

		for (int i = 0; i < c.getCropsList().length; i++) {
			String arr[] = c.getCropsList();
			Crops c1 = new Crops();
			c1.setName(arr[i]);

			System.out.printf("Please Enter Minimum Support Price for %s: \n", arr[i]);
			c1.setMsp(br.readLine());

			mapCropsMSP.put(arr[i], c1);
		}

		for (String key : mapCropsMSP.keySet())
			System.out.println(key + ":" + mapCropsMSP.get(key).getMsp());
		System.out.println(mapCropsMSP.size());

		System.out.println("******* Minimum Support Price Updated *******\n");
	}

}
