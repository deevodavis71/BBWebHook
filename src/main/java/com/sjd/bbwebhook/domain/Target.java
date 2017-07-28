package com.sjd.bbwebhook.domain;

public class Target
{
	private Parent[] parents;

	private String hash;

	public String getHash ()
	{
		return hash;
	}

	public void setHash (String hash)
	{
		this.hash = hash;
	}

	public Parent[] getParents ()
	{
		return parents;
	}

	public void setParents (Parent[] parents)
	{
		this.parents = parents;
	}

	public Target ()
	{
		parents = new Parent[0];
	}
}
