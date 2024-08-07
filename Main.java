package consoleV2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;


public class Main {
	
	
	/*PartyDO findPartyBySeq(int partySeq) {
		return preg.get(partySeq);
    }*/
	
	public static void main(String[] args) throws Exception {
			
		HashMap<Integer ,PartyDO> preg = new HashMap<Integer,PartyDO>();
		
		 LinkedHashMap<Integer,LinkedHashMap<String,Object>> PolicyMapDO = new LinkedHashMap<Integer,LinkedHashMap<String,Object>>();
			
		 LinkedHashMap<String, Object >PolicyMap = null;
		 
			Operations obj = new Operations();
			UpdateDO upobj = new UpdateDO();
			
			Scanner s = new Scanner(System.in);
			boolean ext = true;
			
			
	    while(ext) {
	    	System.out.println("------------------------------------------------------------------");
		System.out.println("Enter 1 for Register");
		System.out.println("Enter 2 for Search");
		System.out.println("Enter 3 for Update Party Do");
		System.out.println("Enter 4 for Delete");
		System.out.println("Enter 5 for Exit");
		System.out.println("Enter 6 for Update Party Address Do");
		System.out.println("Enter 7 for Update Party Contact Do");
		System.out.println("Enter 8 for Download");
		System.out.println("Enter 9 for Policy");
		System.out.println("Enter 10 for Search policy");
		System.out.println("Enter 12 for Search policyDemo & print user details");
		System.out.println("Enter 13 for Print highest sum assured");
		System.out.println("------------------------------------------------------------------");
		int option = s.nextInt();	
		
			switch (option) {
			case 1: //register
				//Operations.Register();
				//PartyDO party = Operations.Register();
				//preg.put(party.getPartySeq(), party);
				PartyDO party = new PartyDO();
				obj.Register(party);
            	preg.put(party.getPartySeq(),party);
            	System.out.println(party);
				break;
				
			case 2:  //search
				PartyDO party1 = new PartyDO();
			    obj.Display(party1,preg);
				break;
				
			case 3: //update
				PartyDO party2 = new PartyDO();
				upobj.UpdatePartyDo(party2 , preg);
				break;
				
			case 4: //Delete
				PartyDO party3 = new PartyDO();
				obj.DeleteParty(party3,preg);
				break;
				
			case 5 :
				//address update
				PartyDO party6 = new PartyDO();
				upobj.UpdateAddressDo(party6, preg);
				break;
			case 6 :
				//Exit
				ext = false;
				System.out.println("Console Exit");
				break;
				
			case 7://Contact update
				PartyDO party7 = new PartyDO();
				upobj.updateContactDo(party7, preg);
				break;
				
			case 8:
				PartyDO party8 = new PartyDO();
				//PartyReg.Download(Seqno2,partyMap);
				upobj.createFile(party8, preg);
				break;
				
			case 9 :
				System.out.println("Enter party sequence to Buy Policy");
				int partySeq = s.nextInt();
				BuyPolicyOP bp = new BuyPolicyOP();
				/*new LinkedHashMap<String, Object>();*/
				for(Entry<Integer ,PartyDO> inn: preg.entrySet()) {
					if(inn.getKey()== partySeq) {
						  boolean hasTermHealthInsurance = false;
					        boolean hasTermInsurance = false;
						for(Entry<Integer,LinkedHashMap<String,Object>> out: PolicyMapDO.entrySet()) {
							  if(out.getKey()== partySeq) {
								 PolicyMap = out.getValue();
							  }
							  for (Entry<String, Object> policyData : PolicyMap.entrySet()) {
								  if (policyData.getKey().equals("termHealthInsurance")) {
//					                	LinkedHashMap<String, BasePolicyDO> an = ann.getValue();
//					                	PartyPolicyMap.put(partySeq,an);
					                    hasTermHealthInsurance = true;
					                } 
					                if (policyData.getKey().equals("termInsurance")) {
					                    hasTermInsurance = true;
//					                    LinkedHashMap<String, BasePolicyDO> an = ann.getValue();
//					                    PartyPolicyMap.put(partySeq,an);
					                }
							  }
						}
						if (hasTermHealthInsurance && hasTermInsurance) {
				            System.out.println("You already have both policies.");
				            System.out.println("1. Buy another policy; 2. Exit");
				            int choice = s.nextInt();
				            if (choice == 1) {
				            	bp.PolicyOP(PolicyMapDO,PolicyMap);
				            } else {
				                // User chose to exit
				                return;
				            }
				        }
						else if (hasTermHealthInsurance || hasTermInsurance) {
				            String existingPolicy = hasTermHealthInsurance ? "termHealthInsurance" : "termInsurance";
				            System.out.println("You already have " + existingPolicy + " policy.");
				            System.out.println("1. Buy another policy; 2. Exit");
				            int choice = s.nextInt();
				            if (choice == 1) {
				            	bp.PolicyOP(PolicyMapDO,PolicyMap);
				            } else {
				                // User chose to exit
				                return;
				            }
				        }else {
				            // User has no policies, so we direct them to the policy method.
				        	PolicyMap = new LinkedHashMap<String, Object>();
				        	bp.PolicyOP(PolicyMapDO,PolicyMap);
				        }
						
						
						
					}
					
					
					
					
					else {
						System.out.println("part not found");
					}
				}
				/*if(preg.containsKey(partySeq)== true) {
					if((!PolicyMapDO.containsKey("termInsurance")) || ()!PolicyMapDO.containsKey("termHealthInsurance")){
						LinkedHashMap<String, BasePolicyDO >PolicyMap = new LinkedHashMap<String, BasePolicyDO>();
						BuyPolicyOP bp = new BuyPolicyOP();
						bp.PolicyOP(PolicyMap, PolicyMapDO);
				}else {
					System.out.println("policy not bought ");
				}
				if(!PolicyMapDO.containsKey("termInsurance") || !PolicyMapDO.containsKey("termHealthInsurance")){
					LinkedHashMap<String, BasePolicyDO >PolicyMap = new LinkedHashMap<String, BasePolicyDO>();
					BuyPolicyOP bp = new BuyPolicyOP();
					bp.PolicyOP(PolicyMap, PolicyMapDO, preg);
				//PolicyMapDO.put(partySeq, PolicyMap);
				}
				}else{
					System.out.println("party Not Found");
				}*/
				break;
				
			case 10: 
				System.out.println("enter party seq to get policy data");
				int partySeq1 = s.nextInt();
			/*	for(Entry<Integer,PartyDO> pdo : preg.entrySet()) {
					if(pdo.getKey()== partySeq1) {
						System.out.println(PolicyMapDO);
					} else {
						System.out.println("Party not found");
					}
				}*/
				if(preg.containsKey(partySeq1)) {
					System.out.println(PolicyMapDO);
				}else {
					System.out.println("Party not found");
				}
				break;
			case 11: 
				BuyPolicyOP bp1 = new BuyPolicyOP();
				bp1.updatePolicy(PolicyMapDO);
				
			case 12 : 
				PartyDO partyP = new PartyDO();
				BuyPolicyOP bp2 = new BuyPolicyOP();
				bp2.searchPolicyDemo(PolicyMapDO,PolicyMap, preg,partyP);
				break;
			case 13 :
				PartyDO party13 = new PartyDO();
				BuyPolicyOP bp3 = new BuyPolicyOP();
				bp3.HighestSumAssuredPrint(PolicyMapDO, PolicyMap, preg, party13);
				break;
			default:
				break;
				
			}
			}
	}
}
		
	


