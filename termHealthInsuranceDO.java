package consoleV2;

public class termHealthInsuranceDO extends BasePolicyDO {
	
	public String getPolicySeq() {
		return policySeq;
	}





	public void setPolicySeq(String policySeq) {
		this.policySeq = policySeq;
	}


	String policySeq;
    double premiumAmt;
    double sumAssured;
    double healthCover;
 
	
	public termHealthInsuranceDO(String policySeq2, Double sumAssured2) {
		// TODO Auto-generated constructor stub
		this.policySeq = policySeq2;
		this.premiumAmt = premeiumCalculationDO.premiumCalTermHealthIns(sumAssured2);
		this.sumAssured = sumAssured2;
		this.healthCover = 0.05*sumAssured2;
	}


	


	public termHealthInsuranceDO() {
		// TODO Auto-generated constructor stub
	}





	public double getPremiumAmt() {
		return premiumAmt;
	}


	public void setPremiumAmt(double premiumAmt) {
		this.premiumAmt = premiumAmt;
	}


	@Override
	public String toString() {
		return "termHealthInsuranceDO [policySeq=" + policySeq
				+ ", premiumAmt=" + premiumAmt + ", sumAssured=" + sumAssured
				+ ", healthCover=" + healthCover + "]";
	}



	}


	


