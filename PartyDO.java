package consoleV2;

import java.util.ArrayList;
import java.util.Date;

public class PartyDO {
	private String partyTypeCd;
	private  int partySeq;
	private String title;
	private String firstName;
	private String lastName;
	private Date birthDate;
	private int age;
	private String genderCd;
	
	
	
	private ArrayList<PartyAddressDO> partyaddressList;
	private ArrayList<PartyContactDO> partycontactList;
	
	
	
	public ArrayList<PartyAddressDO> getPartyaddressList() {
		return partyaddressList;
	}
	public void setPartyaddressList(ArrayList<PartyAddressDO> partyaddressList) {
		this.partyaddressList = partyaddressList;
	}
	public ArrayList<PartyContactDO> getPartycontactList() {
		return partycontactList;
	}
	public void setPartycontactList(ArrayList<PartyContactDO> partycontactList) {
		this.partycontactList = partycontactList;
	}
	public String getPartyTypeCd() {
		return partyTypeCd;
	}
	public  void setPartyTypeCd(String partyTypeCd) {
		this.partyTypeCd = partyTypeCd;
	}
	public int getPartySeq() {
		return partySeq;
	}
	public void setPartySeq(int partySeq) {
		this.partySeq = partySeq;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGenderCd() {
		return genderCd;
	}
	public void setGenderCd(String genderCd) {
		this.genderCd = genderCd;
	}
	@Override
	public String toString() {
		return "PartyDO [partyTypeCd=" + partyTypeCd + ", partySeq=" + partySeq
				+ ", title=" + title + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", birthDate=" + birthDate
				+ ", age=" + age + ", genderCd=" + genderCd
				+ ", partyaddressList=" + partyaddressList
				+ ", partycontactList=" + partycontactList + "]";
	}
	
	
	
	
	
}
