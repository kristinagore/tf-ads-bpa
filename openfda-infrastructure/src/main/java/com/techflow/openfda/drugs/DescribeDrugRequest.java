package com.techflow.openfda.drugs;

public class DescribeDrugRequest implements FindDrugRequest
{
	private String name;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
}
