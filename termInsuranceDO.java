package consoleV2;

public class termInsuranceDO extends BasePolicyDO {
     
	 String policySeq;
	 public String getPolicySeq() {
		return policySeq;
	}
	public void setPolicySeq(String policySeq) {
		this.policySeq = policySeq;
	}
	double premiumAmt;
	 double sumAssured;
	
	public termInsuranceDO(String policySeq2,Double sumAssured) {
		
		this.policySeq = policySeq2;
		this.premiumAmt = premeiumCalculationDO.premiumCalTermIns(sumAssured);
		this.sumAssured = sumAssured;
	
		
		termInsuranceDO.this.setPremiumAmt(premeiumCalculationDO.premiumCalTermIns(sumAssured));
	}
	public termInsuranceDO() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "termInsuranceDO [policySeq=" + policySeq + ", premiumAmt="
				+ premiumAmt + ", sumAssured=" + sumAssured + "]";
	}
	public double getPremiumAmt() {
		return premiumAmt;
	}
	public void setPremiumAmt(double premiumAmt) {
		this.premiumAmt = premiumAmt;
	}
	
	
	
	
}
