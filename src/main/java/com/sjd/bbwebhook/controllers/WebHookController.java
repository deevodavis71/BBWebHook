package com.sjd.bbwebhook.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sjd.bbwebhook.domain.PushWrapper;

@RestController
@RequestMapping("/api")
public class WebHookController
{
	@RequestMapping(value = "/webhook/{appId}", method = RequestMethod.POST)
	public String callWebHook (@PathVariable("appId") String appId, @RequestBody PushWrapper pushWrapper)
	{
		// curl -X POST -H "Content-Type: application/json"
		// http://localhost:8080/api/webhook/123 -d
		// '{"push":{"changes":{"target":{"hash":"OLD-HA},"commits":{"hash":"NEW-HASH"}}}}'

		// System.out.println(pushWrapper);
		System.out.println("appId : " + appId);

		try
		{
			if (pushWrapper != null && pushWrapper.getPush() != null && pushWrapper.getPush().getChanges() != null
					&& pushWrapper.getPush().getChanges().length > 0)
			{
				if (pushWrapper.getPush().getChanges()[0].getNew().getTarget() != null)
					System.out.println("NEW = " + pushWrapper.getPush().getChanges()[0].getNew().getTarget().getHash());
				if (pushWrapper.getPush().getChanges()[0].getNew().getTarget().getParents().length > 0
						&& pushWrapper.getPush().getChanges()[0].getNew().getTarget().getParents()[0] != null)
					System.out.println("OLD = "
							+ pushWrapper.getPush().getChanges()[0].getNew().getTarget().getParents()[0].getHash());
			}

			/*
			 * PushWrapper pw = new PushWrapper();
			 * pw.getPush().getChanges().getCommits().setHash("NEW-HASH");
			 * pw.getPush().getChanges().getTarget().setHash("OLD-HASH");
			 * ObjectMapper mapper = new ObjectMapper(); String ps =
			 * mapper.writeValueAsString(pw); System.out.println(ps);
			 */

		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "ACK";
	}
}
