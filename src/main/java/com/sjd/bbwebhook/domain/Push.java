package com.sjd.bbwebhook.domain;

public class Push
{
	private Changes[] changes;

	public Changes[] getChanges ()
	{
		return changes;
	}

	public void setChanges (Changes[] changes)
	{
		this.changes = changes;
	}

	public Push ()
	{
		changes = new Changes[0];
	}
}
