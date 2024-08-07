package consoleV2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class BuyPolicyOP{ 

	//LinkedHashMap<String, BasePolicyDO> policyLHM  = new LinkedHashMap<String, BasePolicyDO>(); 
	
	
	premeiumCalculationDO pc = new premeiumCalculationDO();
	Scanner pt = new Scanner(System.in);
	BasePolicyDO BPD;
	
	
	
	public void termInsurance(LinkedHashMap<String,Object>PolicyMap) {
		
		System.out.println("Enter sum assured amount ");
		Double sumAssured = pt.nextDouble();
		
    	System.out.println("Enter policy sequence : ");
    	String policySeq = pt.next();
    	
    	BPD = new termInsuranceDO(policySeq, sumAssured);
    	
    	 PolicyMap.put("termInsurance", BPD);
    	
	}
	


	public void termHealthInsurance(LinkedHashMap<String,Object>PolicyMap) {
		
		System.out.println("Enter sum assured amount ");
		Double sumAssured = pt.nextDouble();
		
    	System.out.println("Enter policy sequence : ");
    	String policySeq = pt.next();
    	
    	BPD = new termHealthInsuranceDO(policySeq, sumAssured);
    	
    	PolicyMap.put("termHealthInsurance", BPD);
    	
	}
	
	
	public void PolicyOP(LinkedHashMap<Integer,LinkedHashMap<String,Object>> PolicyMapDO,LinkedHashMap<String, Object >PolicyMap) {
		
		BPD = new BasePolicyDO();
		
//		BasePolicyDO BPD = new BasePolicyDO();
		
        double premium = 0.0;
        
        System.out.println("Enter party sequence to Buy Policy");
		Integer partySeq = pt.nextInt();
//		
       /* System.out.println("Enter party sequence to Buy Policy");
		String partySeq = pt.next();
		*/
		/*if(preg.containsKey(partySeq)) { */
			boolean OP = true;
				
		while(OP){
			
			
			
    		System.out.println("Select Policy Type: ");
            System.out.println("1.Term Insurance");
            System.out.println("2.Term Health Insurance");
            System.out.println("3.Exit");
            int policyType = pt.nextInt();
    		
            switch(policyType){
            
            case 1 :
            	
         	BPD.disclaimerMessage();
            	 BPD = new termInsuranceDO();
            	
            		
            	if(!PolicyMap.containsKey("termInsurance")){
            		//BasePolicyDO teh = termIns(policy);
            		
            		termInsurance(PolicyMap);
            		//PolicyMap.put("termInsurance", BPD);
//            		System.out.println(PolicyMap);
                	}else{
                		System.out.println(" you already have this policy if you buy again than override : 1: for again buy ; 2 for exit");
                		int chh = pt.nextInt();
                		if(chh == 1){
                			//BPD = new termInsuranceDO();
                			
                			termInsurance(PolicyMap);
                			//PolicyMap.put("termInsurance", BPD);
                		}else{
                			break;
                		}
                	}
            	//PolicyMapDO.put(partySeq,PolicyMap);
           
            	break;
            	
            case 2: 
            	
            	BPD.disclaimerMessage();
            	BPD = new termHealthInsuranceDO();
            	
            	if(!PolicyMap.containsKey("termHealthInsurance")){
            		/*PolicyMap = new LinkedHashMap<String, Object>();*/
            		termHealthInsurance(PolicyMap);
//            		System.out.println(PolicyMap);

            		//PolicyMap.put("termHealthInsurance", BPD);
                	}else{
                		System.out.println(" you already have this policy if you buy again than override : 1: for again buy ; 2 for exit");
                		int chh = pt.nextInt();
                		if(chh == 1){
                		//	BPD = new termHealthInsuranceDO();
                			//PolicyMap.put("termHealthInsurance", BPD);
                			termHealthInsurance(PolicyMap);
                		}else{
                			break;
                			}
                		}
            	//PolicyMapDO.put(partySeq,PolicyMap);
            	break;
            	
            case 3:
            //	System.out.println(PolicyMapDO);
            	
            	OP = false;
            	
            	break;
            	
            	default :
            		break;
            	}
           
            }
		PolicyMapDO.put(partySeq,PolicyMap);
		//System.out.println(PolicyMapDO);*/
	}
		/*else {
			System.out.println("Invalid Party Sequence");	}*//*}*/
	public void updatePolicy(LinkedHashMap<Integer,LinkedHashMap<String,Object>> PolicyMapDO) {
		/*for(Entry<String, Object> opd : PolicyMapDO.EntrySet()) {
			
		}
			*/	
		for(Entry<Integer, LinkedHashMap<String, Object>> opd : PolicyMapDO.entrySet()) {

            for (Entry<String, Object> mp : opd.getValue().entrySet()) {
            	BasePolicyDO bdo = (BasePolicyDO) mp.getValue();
            	if(bdo instanceof termInsuranceDO) {
            		double premiumAmt = ((termInsuranceDO) bdo).getPremiumAmt()* 1.05;
            		((termInsuranceDO) bdo).setPremiumAmt(premiumAmt);
            	}else {
            		double premiumAmt = ((termHealthInsuranceDO) bdo).getPremiumAmt()* 1.07;
            		((termHealthInsuranceDO) bdo).setPremiumAmt(premiumAmt);
            	}
            }
		}
	}
	
	public void searchPolicyDemo(LinkedHashMap<Integer,LinkedHashMap<String,Object>> PolicyMapDO,
			LinkedHashMap<String, Object >PolicyMap,HashMap<Integer ,PartyDO> preg,PartyDO party) {
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Policy Sequence :");
		String policySeq = sc.nextLine();
		for(Entry<Integer, LinkedHashMap<String, Object>> spd : PolicyMapDO.entrySet()) {
			
			for(Entry<String,Object> sspd1 : spd.getValue().entrySet()) {
				if(sspd1.getKey()=="termInsurance") {
					termInsuranceDO tipolicy = (termInsuranceDO) sspd1.getValue();
				if(tipolicy.getPolicySeq().equals(policySeq)) {
					
					for(Entry<Integer, PartyDO> var : preg.entrySet()) {
						if(spd.getKey() == var.getKey()) {
							PartyDO partyP = preg.get(spd.getKey());
								System.out.println(partyP.getFirstName());
								ArrayList<PartyAddressDO> add = var.getValue().getPartyaddressList();
								System.out.println(add);
								ArrayList<PartyContactDO> con = var.getValue().getPartycontactList();
								System.out.println(con);
								
						}
					}
				}
				
				}
					else {
					termHealthInsuranceDO thpolicy = (termHealthInsuranceDO)sspd1.getValue();
					if(thpolicy.getPolicySeq().equals(policySeq)) {
						for(Entry<Integer, PartyDO> var1 : preg.entrySet()) {
							if(spd.getKey() == var1.getKey()) {
								PartyDO partyP = preg.get(spd.getKey());
								System.out.println(partyP.getFirstName());
									ArrayList<PartyAddressDO> add = var1.getValue().getPartyaddressList();
									System.out.println(add);
									ArrayList<PartyContactDO> con = var1.getValue().getPartycontactList();
									System.out.println(con);
							}
						}
					}	
					
				}



				
			
				
			}  //for Done
		}
		
	}
	
	public void HighestSumAssuredPrint(LinkedHashMap<Integer,LinkedHashMap<String,Object>> PolicyMapDO,
			LinkedHashMap<String, Object >PolicyMap,HashMap<Integer ,PartyDO> preg,PartyDO party) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter highest SumAssured Amount");
		double HighSA = sc.nextDouble();
		for(Entry<Integer, LinkedHashMap<String, Object>> var1 : PolicyMapDO.entrySet()) {
//			outter
			for(Entry<String,Object> var2 : var1.getValue().entrySet()) {
//				inner
				if(var2.getKey()=="termInsurance") {
					termInsuranceDO tiSum = (termInsuranceDO) var2.getValue();
					if(tiSum.sumAssured > HighSA ) {
						for(Entry<Integer, PartyDO> var3 : preg.entrySet()) {
							PartyDO partyP = preg.get(var3.getKey());
							System.out.println(partyP.getFirstName());
						}
						
					
					}
				}
				else {
					termHealthInsuranceDO thSum = (termHealthInsuranceDO) var2.getValue();
					if(thSum.sumAssured > HighSA ) {
						for(Entry<Integer, PartyDO> var3 : preg.entrySet()) {
							PartyDO partyP = preg.get(var3.getKey());
							System.out.println(partyP.getFirstName());
						}
						
					
					}
					
				}
				
				
				
			}
			
		}
		
	}
		
		
}


