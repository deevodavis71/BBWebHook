package com.sjd.bbwebhook.domain;

public class PushWrapper
{
	private Push push;

	public Push getPush ()
	{
		return push;
	}

	public void setPush (Push push)
	{
		this.push = push;
	}

	public PushWrapper ()
	{
		push = new Push();
	}
}
