package com.lti.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.Salaried;
import com.lti.model.UserDetail;
import com.lti.repository.SalariedRepository;

@Service("salariedService")
public class SalariedServiceImpl implements SalariedService
{

	@Autowired
	SalariedRepository salariedRepository;
	
	@Override
	public Salaried addSalaried(Salaried s) 
	{
		Salaried s1=new Salaried();
		double estimatedAmt=12*s.getTenure()*(s.getNetAmtSalary()-(s.getNetAmtSalary()*0.1)-s.getCostOfLiving()-s.getExistingEmi());
		if(estimatedAmt>=s.getRequiredAmt())
		{
			if(s.getTenure()<=s.getRetirementAge())
			{
				System.out.println("Loan Granted");
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
	
	}

}
