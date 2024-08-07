package consoleV2;
import java.util.Scanner;
import java.util.HashMap;

import com.c2lbiz.symbiosys.systemcommon.util.FileUtil;

/*import com.c2lbiz.symbiosys.systemcommon.util.FileUtil;
import com.sun.java.util.jar.pack.Package.File;*/

public class UpdateDO {
	
	public   void UpdatePartyDo(PartyDO party , HashMap<Integer, PartyDO> preg) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Party Sequence : ");
		 int partySeq = sc.nextInt();
	         PartyDO partyup = preg.get(partySeq);

		 if (partyup != null) {

		        boolean valid = true;
		        
		        
		        while(valid) {
		        	System.out.println("Update Information");
		        	System.out.println(" 1.Party Type 2.First Name 3.Last Name 4.BirthDate");
		        	int choice = sc.nextInt();
		        	
		        	switch(choice) {
		        	case 1 : 
		        		System.out.println("Enter updated party type : ");
		        		System.out.println("Select Title 1.Mr 2.Mrs 3.Ms");
		        	 choice = sc.nextInt();
		        	 int ptype = sc.nextInt();
	        		if(ptype == 1){
	        			partyup.setTitle("Mr");
	        			partyup.setGenderCd("Male");
	        		}else if(ptype == 2){
	        			partyup.setTitle("Ms");
	        			partyup.setGenderCd("Female");
	        		}else{
	        			partyup.setTitle("Mrs");
	        			partyup.setGenderCd("Female");
	        		}
	            	break;
	            	
		        	case 2 :
		        		System.out.println("Enter Updated First Name");
		            	partyup.setFirstName(sc.next());
		            	break;
		            	
		        	case 3 :
		        		System.out.println("Enter Updated Last Name");
		            	partyup.setLastName(sc.next());
		            	break;
		            	
		        	case 4: 
		            	System.out.println("Press 1.Individual 2.Organiztion");
		        		int type = sc.nextInt();
		        		if(type ==1 ){
		        			partyup.setPartyTypeCd("Individual");
		        		}else{
		        			partyup.setPartyTypeCd("Organiztion");
		        		}
		            	break;
		            	
		        	case 5: 
		        		System.out.println("Enter Updated Birth date : ");
		        		//partyup.setBirthDate();
		        		break;
		        		
		        	case 6:
		        		System.out.println("Exit ");
		        		valid = false;
		        		break;
		        		
		        		default:
		        			System.out.println("Invalid Input");
		        			break;   			
		        	}	        	
		        }
		        }
		 }
	
	
	public  void  UpdateAddressDo(PartyDO party, HashMap<Integer, PartyDO> preg) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Party Sequence : ");
		int partySeq = sc.nextInt();
	//	System.out.println("hjdgfhjgdf");
		 PartyDO partyup = preg.get(partySeq);

		
		if(/*party.getPartySeq()*/partyup.getPartySeq() == partySeq) {
			
			for (PartyAddressDO address : partyup.getPartyaddressList()) {
				
	        	  System.out.println("Enter Party Address Sequence : ");
	        	  int pa = sc.nextInt();
	        	  
	        	  if (address.getPartyAddressSeq()== pa) {
	        		  boolean valid1 = true;
	             	 while(valid1) {
	             		 System.out.println("1.Address Sequence 2.Country & State 3.Address Type 4.Address Details 5.Pincode 6.Exit ");
	             		 int choice = sc.nextInt();
	             		  sc.nextLine();
	             		  
	             		 switch(choice) {
	             		
	             		 case 1: 
	             			System.out.println("Enter Address Sequence : ");
	           			    address.getPartyAddressSeq();
	   		        		break;
	             			 	 
	             		 case 2:
	             			 System.out.println("Choose country name : ");
	             				System.out.println("1.India(Bharat) 2.USA ");
	             				int countryCd1 = sc.nextInt();
	             				switch (countryCd1) {
	             				case 1:
	             					address.setCountryCd1("India (Bharat)");
	             					System.out.println("Choose state : (1.Maharashtra  2.Gujrat ) ");
	             					int stateCd = sc.nextInt();
	             					switch (stateCd) {
	             					case 1:
	             						address.setStateCd("Maharashtra");
	             						break;
	             					case 2:
	             						address.setStateCd("Gujrat");
	             						break;
	             					}
	             					break;
	             				case 2:
	             					address.setCountryCd1("USA");
	             					System.out.println("1.Alabama  2.Alaska ");
	             					int stateCd1 = sc.nextInt();
	             					switch (stateCd1) {
	             					case 1:
	             						address.setStateCd("Alabama");
	             						break;
	             					case 2:
	             						address.setStateCd("Alaska");
	             						break;
	             					}
	             					break;
	             				}
	             				break;
	             				
	             		 case 3:
	             			System.out.println("Choose Address Type : (1.Residential 2.Office) ");
		             		  int a = sc.nextInt();
	             			if (a == 1) {
	                			 address.setAddressType("Residential");
	             			}else{
	             				address.setAddressType("Office");
	             			}
	                		 break;
	                          
	             		 case 4:
	             			System.out.println("Enter the new Address Details : ");
	                        address.setAddressDetails(sc.nextLine());
	                        break;
	             			
	             			  
	             		 case 5: 
	             			 System.out.println("Enter pincode : ");
	            			 address.setPinCode(sc.next());
	            			 break;
	             			
	             		 case 6: 
	             			System.out.println("Exit ");
	 		        		valid1 = false;
	 		        		break;
	             			 
	             		 default:
	     	        			System.out.println("Invalid Input");
	     	        			break;  		
	             		 }
	             		
	             	 }
	               }
	        		
	        	  }
		}
		else {
			System.out.println("party not found ");
		}
          
        	  
          
		}
	
	public  void updateContactDo(PartyDO party, HashMap<Integer, PartyDO> preg) {
		
		
		 
	//	PartyDO partyup = preg.get(partySeq);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Party Sequence : ");
		int partySeq = sc.nextInt();
		 PartyDO partyup = preg.get(partySeq);
	
			if(partyup.getPartySeq() == partySeq) {
				for(PartyContactDO contact: partyup.getPartycontactList()) {
					
					boolean valid2 = true;
					while(valid2) {
						System.out.println("1.Contact type 2.Contact Number");
						int choice = sc.nextInt();
						
						switch(choice) {
						
						case 1:
							System.out.println("Enter updated contact type : Choose party contact type : (1.MOBILE  2.OFFICE)");
					        int contactType = sc.nextInt();
							if (contactType == 1) {
								contact.setContactType("Mobile");
							} else {
								contact.setContactType("Office");
							}
							break;
							
						case 2:
							System.out.println("Enter updated contact number : ");
							contact.setContactNum(sc.nextInt());
							break;
							
						case 3:
							System.out.println("Exit");
							valid2 = false;
							break;
							
						default:
		        			System.out.println("Invalid Input");
		        			break; 
						}
						
						
						
						
					}
				}
			}
			else {
				System.out.println("party not found ");
			}
		
	}
	
	
	public  void createFile(PartyDO party, HashMap<Integer, PartyDO> preg) throws Exception {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Party Sequence :- ");
		int partySeq = sc.nextInt();
		
		PartyDO partyup = preg.get(partySeq);
		
		if(partyup.getPartySeq()== partySeq) {
			
			String path ="D:\\Rohan\\Tranining_Workspace\\test\\";
			String FilePath = "rtemp.txt";
			
			try {
				FileUtil.createFile(path, FilePath, partyup.toString());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else{
			System.out.println("Party Not found data not downloaded. ");
		}
		}
    }
	
	
	


