package utility;

import java.util.Map;
import java.util.TreeMap;

import model.Farmer;
import model.WholeSeller;

public interface License {

	public static Map<String, WholeSeller> licenseRenewalWholeSeller = new TreeMap<String, WholeSeller>();
	public static Map<String, Farmer> licenseRenewalFarmer = new TreeMap<String, Farmer>();

	public void licenseRenewal();

}
