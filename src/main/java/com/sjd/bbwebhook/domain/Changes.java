package com.sjd.bbwebhook.domain;

public class Changes
{
	private New _new;

	public New getNew ()
	{
		return _new;
	}

	public void setNew (New _new)
	{
		this._new = _new;
	}

	public Changes ()
	{
		_new = new New();
	}
}
