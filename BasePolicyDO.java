package consoleV2;

import java.util.LinkedHashMap;

public class BasePolicyDO implements termsAndConditionINTF{

	String partySeq;
	LinkedHashMap<String, Object >PolicyMap = new LinkedHashMap<String, Object >();

	/*public LinkedHashMap<Integer, Object> getPolicyMap() {
		return PolicyMap;
	}

	public void setPolicyMap(LinkedHashMap<Integer, Object> policyMap) {
		this.PolicyMap = policyMap;
	}*/
	public BasePolicyDO(String partySeq) {
		super();
		this.partySeq = partySeq;
	}

	public BasePolicyDO() {
		// TODO Auto-generated constructor stub
	}

	public void disclaimerMessage() {
		System.out.println("Disclaimer");
	}
	
	
}
