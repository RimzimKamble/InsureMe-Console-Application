package consoleV2;

public class premeiumCalculationDO {
	
	
	public static double premiumCalTermIns(double sumAssured){
		
		double premium=sumAssured*0.0001;
    	return premium;
		
	}
	
	public static double premiumCalTermHealthIns(double sumAssured) {
		
		double	premium=sumAssured*0.0001*1.25;
		return premium;
	}

}
