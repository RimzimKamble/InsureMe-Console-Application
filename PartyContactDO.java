package consoleV2;

public class PartyContactDO {
	
	private int partyContactSeq;
	private String contactType;
	private long contactNum;
	@Override
	public String toString() {
		return "PartyContactDO [partyContactSeq=" + partyContactSeq
				+ ", contactType=" + contactType + ", contactNum=" + contactNum
				+ "]";
	}
	public int getPartyContactSeq() {
		return partyContactSeq;
	}
	public void setPartyContactSeq(int partyContactSeq) {
		this.partyContactSeq = partyContactSeq;
	}
	public String getContactType() {
		return contactType;
	}
	public void setContactType(String contactType) {
		this.contactType = contactType;
	}
	public long getContactNum() {
		return contactNum;
	}
	public void setContactNum(long contactNum) {
		this.contactNum = contactNum;
	}

}
