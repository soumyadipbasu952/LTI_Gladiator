package com.lti.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.Salaried;
import com.lti.model.SelfEmployedBusiness;
import com.lti.repository.SelfEmployedBusinessRepository;

@Service("selfEmployedService")
public class SelfEmployedBusinessServiceImpl implements SelfEmployedBusinessService
{
	@Autowired
	SelfEmployedBusinessRepository selfEmployedBusinessRepository;
	
	@Override
	public SelfEmployedBusiness addBusiness(SelfEmployedBusiness s)
	{
		//SelfEmployedBusiness s1=new SelfEmployedBusiness();
		double estimatedAmt=s.getTenure()*(s.getPatAsPerLatestItr()-(s.getPatAsPerLatestItr()*0.1)-(12*s.getCostOfLiving())-(12*s.getExistingEmi())-3*(s.getPatAsPerLatestItr()-s.getDepreciationLast3Avg()));
		if(estimatedAmt>=s.getRequiredAmt())
		{
				System.out.println("Loan Granted");
				//s1=s;
				s.setEstimatedAmt(estimatedAmt);
				s.setStatus(true);
				return selfEmployedBusinessRepository.addBusiness(s);
				
		}
		else
		{
			System.out.println("Loan not Granted");
			s.setEstimatedAmt(estimatedAmt);
			s.setStatus(false);
			return selfEmployedBusinessRepository.addBusiness(s);
		}
		

	
	}

}
/*Salaried s1=new Salaried();
		double estimatedAmt=12*s.getTenure()*(s.getNetAmtSalary()-(s.getNetAmtSalary()*0.1)-s.getCostOfLiving()-s.getExistingEmi());
		if(estimatedAmt>=s.getRequiredAmt())
		{
			if(s.getTenure()<=s.getRetirementAge())
			{
				System.out.println("Loan Granted");
				//s1=s;
				s.setEstimatedAmt(estimatedAmt);
				s.setStatus(true);
				return salariedRepository.addSalaried(s);
				
			}
		}
		else
		{
			System.out.println("Loan not Granted");
			s.setEstimatedAmt(estimatedAmt);
			s.setStatus(false);
			return salariedRepository.addSalaried(s);
		}
		
		return s1;
	*/