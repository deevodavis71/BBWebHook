package com.sjd.bbwebhook.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class WebHookController
{
	@RequestMapping("/webhook")
	public String callWebHook (@RequestParam String appID, @RequestBody String body)
	{
		System.out.println("appID = " + appID);
		System.out.println("Got --> " + body);
		return "ACK";
	}
}
