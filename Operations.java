package consoleV2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.c2lbiz.symbiosys.systemcommon.util.DateUtil;

public class Operations {

	

	public  void Register(PartyDO party) {

		// party Sequence
//		PartyDO party = new PartyDO();
		Scanner seq = new Scanner(System.in);
		System.out.println("Enter Party Seq");
		int partySeq = seq.nextInt();
		party.setPartySeq(partySeq);

		// Party type
		/*
		 * System.out.println("Press 1 . for Inv ; Press 2. For Org"); int ch =
		 * seq.nextInt(); if(ch == 1) { party.setPartyTypeCd("Inv"); }else {
		 * party.setPartyTypeCd("Org"); }
		 */
		int temppartyTypeCd;
		while (true) {
			System.out
					.println("Enter the party type : (1. Individual  2. Organization ) ");
			// System.out.println("1. Individual  2. Organization");
			int partyTypeCd = seq.nextInt();
			temppartyTypeCd = partyTypeCd;
			if (temppartyTypeCd > 2) {
				continue;
			} else {
				break;
			}
		}
		switch (temppartyTypeCd) {
		case 1:
			// System.out.println("Individual");
			party.setPartyTypeCd("Individual");
			break;
		case 2:
			// System.out.println("Organization");
			party.setPartyTypeCd("Organization");
			break;
		default:
			System.out.println("Invalid Input");
		}

		// -------------------------

		// Title (Done)
		int temptitle;
		while (true) {
			Scanner t = new Scanner(System.in);
			System.out.println("Enter the title : (1. Mr  2. Ms  3. Mrs )");
			int title = t.nextInt();
			temptitle = title;
			if (temptitle > 3) {
				continue;
			} else {
				break;
			}
			// break;
		}
		switch (temptitle) {
		case 1:
			// System.out.println("Mr. ");
			party.setTitle("Mr.");
			party.setGenderCd("Gender : Male");
			break;
		case 2:
			// System.out.println("Ms. ");
			party.setTitle("Ms.");
			party.setGenderCd("Gender : Female");
			break;
		case 3:
			// System.out.println("Mrs. ");
			party.setTitle("Mrs.");
			party.setGenderCd("Gender : Female");
			break;
		default:
			System.out.println("Invalid Input");
		}

		// ------------------------

		// first name (Done)

		/*
		 * while (true) { Scanner fn = new Scanner(System.in);
		 * System.out.println("Enter the first name : "); String firstName =
		 * fn.nextLine(); if ((firstName.matches("[a-zA-Z]") &&
		 * !firstName.isEmpty())== true) { partydo.setFirstName(firstName);
		 * break; } else { System.out.println("Invalid Input"); } }
		 */
		// First Name

		while (true) {
			System.out.println("Enter the first name : ");
			String tempFirstName = seq.next();
			if ((!tempFirstName.isEmpty() && tempFirstName.matches("[a-zA-Z]+")) == true) {
				party.setFirstName(tempFirstName.toUpperCase());
				break;
			} else {
				System.out.print("Invalid! Re-enter valid First Name: ");
			}
		}

		// ---------------------------------------------------------------------

		// last name(Done)
		/*
		 * while (true) { Scanner ln = new Scanner(System.in);
		 * System.out.println("Enter the last name : "); String lastName =
		 * ln.nextLine(); if ((lastName.matches("[a-zA-Z]") &&
		 * !lastName.isEmpty())== true ) { partydo.setLastName(lastName); break;
		 * } else { System.out.println("Invalid Input"); } }
		 */

		// Last Name
		while (true) {
			System.out.println("Enter the last name : ");
			String tempLastName = seq.next();
			if (!tempLastName.isEmpty()
					&& tempLastName.matches("[a-zA-Z]+") == true) {
				party.setLastName(tempLastName.toUpperCase());
				break;
			} else {
				System.out.print("Invalid! Re-enter valid FIrst Name: ");
			}
		}

		// -----------------------------------------------------------------

		// Gender()
		int tempgender;
		while (true) {
			System.out
					.println("Enter the gender : (1. Male  2. Female  3. Others)");
			int gender = seq.nextInt();
			tempgender = gender;
			if (tempgender > 3) {
				continue;
			} else {
				break;
			}
			// break;
		}
		switch (tempgender) {
		case 1:
			// System.out.println("Gender : Male");
			party.setGenderCd("Male");
			break;
		case 2:
			// System.out.println("Gender : Female");
			party.setGenderCd("Female");
			break;
		case 3:
			// System.out.println("Gender : Others");
			party.setGenderCd("Others");
			break;
		default:
			// System.out.println("Invalid Input");
			party.setGenderCd("Invalid Input");
		}

		// ---------------------------------------------------------------------

		while (true) {

			System.out.println("Enter D.O.B");

			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

			try {

				Date date = sdf.parse(seq.next());

				java.util.Date today = new java.util.Date();

				if (date.after(today)) {

				
					throw new FutureDateException();
				

					
				} 
					party.setBirthDate(date);

					party.setAge(DateUtil.getAge(date, today));
				
				break;

			} catch (ParseException e) {

				System.out.println("Invalid date format");

			}catch(FutureDateException e) {
				System.out.println(e.getMessage());
			}

		}
		// ---------------------------------------------------------------------
		// Birth Date
		/*
		 * System.out.print("Enter Date of Birth (dd/mm/yyyy) ex - 22/07/2001 ");
		 * while(true){ Scanner bd = new Scanner(System.in); String tempDate
		 * =bd.nextLine(); try{ DateFormat format = new
		 * SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH); Date date =
		 * format.parse(tempDate); java.util.Date today = new java.util.Date();
		 * if(date.after(today)){ System.out.println("Date cannot to future"); }
		 * else{ party.setBirthDate(date);
		 * 
		 * 
		 * party.setAge(DateUtil.getAge(date, today)); }
		 * 
		 * 
		 * break; } catch(Exception e){
		 * System.out.println("Invalid date format. try again"); } }
		 */

		// -------------------------------------------------------------------

		// ArrayList Print
		/*
		 * partydo.setPartyaddList(partyaddList);
		 * partydo.setPartycontList(partycontList);
		 * System.out.println(partydo.toString());
		 */
		// ---------------------------------------------------------------------

		// Address Data Objects

		ArrayList<PartyAddressDO> partyaddList = new ArrayList<PartyAddressDO>();

		while (true) {
			PartyAddressDO partyAdd = new PartyAddressDO();
			// Party Address Sequence
			System.out.println("Party address sequence : ");
			int partyAddSeq = seq.nextInt();
			partyAdd.setPartyAddressSeq(partyAddSeq);

			// Party Sequence
			System.out.println("Party Sequence: ");
			System.out.println(party.getPartySeq());

			// //Address Type
			System.out
					.println("Choose Address Type : (1.Residential 2.Office) ");
			int addressType = seq.nextInt();
			if (addressType == 1) {
				partyAdd.setAddressType("Residential");
			} else {
				partyAdd.setAddressType("Office");
			}
			// country and state
			System.out.println("Choose country name : ");
			System.out.println("1.India(Bharat) 2.USA ");
			int countryCd1 = seq.nextInt();
			switch (countryCd1) {
			case 1:
				// System.out.println("India(Bharat)");
				partyAdd.setCountryCd1("India (Bharat)");
				// break;
				System.out
						.println("Choose state : (1.Maharashtra  2.Gujrat ) ");
				int stateCd = seq.nextInt();
				switch (stateCd) {
				case 1:
					// System.out.println("Maharashtra");
					partyAdd.setStateCd("Maharashtra");
					break;
				case 2:
					// System.out.println("Gujrat");
					partyAdd.setStateCd("Gujrat");
					break;
				}
				break;
			case 2:
				// System.out.println("USA");
				partyAdd.setCountryCd1("USA");
				// break;
				System.out.println("1.Alabama  2.Alaska ");
				int stateCd1 = seq.nextInt();
				switch (stateCd1) {
				case 1:
					// System.out.println("Alabama");
					partyAdd.setStateCd("Alabama");
					break;
				case 2:
					// System.out.println("Alaska");
					partyAdd.setStateCd("Alaska");
					break;
				}
				break;
			}

			while (true) {
				System.out.println("Enter address details  : ");
				String addressDetails = seq.nextLine();
				
				if (addressDetails.length() < 12) {
					System.out.print("Address is too Short. try again:");
					continue;
				} else {
					partyAdd.setAddressDetails(addressDetails);
					break;
				}
			}

			while (true) {
				System.out.println("Enter pincode : ");
				String pincode = seq.next().trim();
				if ((!pincode.isEmpty() && pincode.matches("^[1-9][0-9]{5}$")) == true) {
					partyAdd.setPinCode(pincode);
					break;
				} else {
					System.out.println("Invalid Input");
					continue;
				}
			}
			System.out.println("press 1 for to make resdentials addresss as a primary address ; press 2 for to make resdentials addresss as a seconday address");
			int chh = seq.nextInt();
			if (chh == 1) {
				partyAdd.setPrimaryAddress("Residential");
			} else {
				partyAdd.setPrimaryAddress("Office");
			}
			partyaddList.add(partyAdd);
			System.out.println("want to enter one more addresss");
			String res = seq.next();
			if (res.equals("y")) {
				continue;
			}
			break;
		}
		party.setPartyaddressList(partyaddList);

		// -------------------------------------------------------

		// Contact Data Object
		ArrayList<PartyContactDO> partycontactList = new ArrayList<PartyContactDO>();
		while (true) {
			PartyContactDO partyContactDo = new PartyContactDO();
			System.out.println("Enter party contact sequence : ");
			int partyContactSeq = seq.nextInt();
			
			//Party Sequence
			partyContactDo.setPartyContactSeq(partyContactSeq);

			partyContactDo.setPartyContactSeq(party.getPartySeq());
			System.out.println("Choose party contact type : (1.MOBILE  2.OFFICE)");
			int contactType = seq.nextInt();
			if (contactType == 1) {
				partyContactDo.setContactType("Mobile");

			} else {
				partyContactDo.setContactType("Office");
			}
			System.out.println("Enter Contact No : ");
			partyContactDo.setContactNum(seq.nextInt());

			partycontactList.add(partyContactDo);
			System.out.println("want to enter one more addresss");
			String res = seq.next();
			if (res.equals("y")) {
				continue;
			}
			break;

		}
		party.setPartycontactList(partycontactList);

//		return party;
	}

	public  void Display(PartyDO party, HashMap<Integer, PartyDO> preg) {
// System.out.println(pg);
		// PartyDO pdo = preg.get(partySeq);
		// System.out.println(pdo);
		// for(MapEntry<Integer, PartyDO> var : preg.entryset()) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Party Sequence : ");
		int partySeq = s.nextInt();

		for (Map.Entry<Integer, PartyDO> var : preg.entrySet()) {

			System.out.println(var.getValue());

					party = preg.get(partySeq);

					if(party != null ){

						System.out.println(party.getFirstName());

						System.out.println(party);

					}			

		}
	}

	
	
	
	public  void DeleteParty(PartyDO party, HashMap<Integer, PartyDO> preg) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Party Sequence : ");
		 int partySeq = s.nextInt();

		PartyDO partyToDelete = preg.get(partySeq);

		if (partyToDelete != null) {

			preg.remove(partySeq);

			System.out.println("party Deleted Successfully");

		}

	}
	
	
}
