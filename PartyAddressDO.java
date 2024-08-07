package consoleV2;

public class PartyAddressDO {
	
	private int partyAddressSeq;
	 //String partySeq;
	private String addressType;
	private String countryCd1;
	private String stateCd;
	private String addressDetails;
	private String pinCode;
	private String primaryAddress;
	private String secondaryAddress;
	public int getPartyAddressSeq() {
		return partyAddressSeq;
	}
	public void setPartyAddressSeq(int partyAddressSeq) {
		this.partyAddressSeq = partyAddressSeq;
	}
	public String getAddressType() {
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	public String getCountryCd1() {
		return countryCd1;
	}
	public void setCountryCd1(String countryCd1) {
		this.countryCd1 = countryCd1;
	}
	public String getStateCd() {
		return stateCd;
	}
	public void setStateCd(String stateCd) {
		this.stateCd = stateCd;
	}
	public String getAddressDetails() {
		return addressDetails;
	}
	public void setAddressDetails(String addressDetails) {
		this.addressDetails = addressDetails;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public String getPrimaryAddress() {
		return primaryAddress;
	}
	public void setPrimaryAddress(String primaryAddress) {
		this.primaryAddress = primaryAddress;
	}
	public String getSecondaryAddress() {
		return secondaryAddress;
	}
	public void setSecondaryAddress(String secondaryAddress) {
		this.secondaryAddress = secondaryAddress;
	}
	@Override
	public String toString() {
		return "PartyAddressDO [partyAddressSeq=" + partyAddressSeq
				+ ", addressType=" + addressType + ", countryCd1=" + countryCd1
				+ ", stateCd=" + stateCd + ", addressDetails=" + addressDetails
				+ ", pinCode=" + pinCode + ", primaryAddress=" + primaryAddress
				+ "]";
	}
	
	

}
