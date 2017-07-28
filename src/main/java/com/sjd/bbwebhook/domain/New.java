package com.sjd.bbwebhook.domain;

public class New
{
	private Target target;

	public Target getTarget ()
	{
		return target;
	}

	public void setTarget (Target target)
	{
		this.target = target;
	}

	public New ()
	{
		target = new Target();
	}
}
