package com.zkteco.webhoook.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.zkteco.webhoook.model.WebhookEventDTO;


@RestController
@RequestMapping("/webhook/notifications")
public class WebhookNotificationsController {
	
	private static final Logger LOG = LoggerFactory.getLogger(WebhookNotificationsController.class);
			
	@PostMapping(path = "/user")
	@ResponseStatus(value = HttpStatus.OK)
	public WebhookEventDTO userNotifications(@RequestBody WebhookEventDTO webhookEventDTO) {
		LOG.info("Web Hook Response Comming From The Zoom Is : {}", webhookEventDTO);
		return webhookEventDTO;
	}

}
