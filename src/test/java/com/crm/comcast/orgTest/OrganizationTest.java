package com.crm.comcast.orgTest;

import org.testng.annotations.Test;

public class OrganizationTest 
{
	@Test(groups="smokeTest")
	public void createOrg()
	{
		System.out.println("Executing createContact test");
	}
	
	@Test(groups="regressionTest")
	public void modifyOrg()
	{
		System.out.println("Executing modifyContact test");
	}
}
