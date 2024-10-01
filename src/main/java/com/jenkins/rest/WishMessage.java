package com.jenkins.rest;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wish-api")
public class WishMessage {

	@GetMapping("/msg")
	public ResponseEntity<String> showMessage(){
		LocalDateTime time = LocalDateTime.now();
		String msg = null;
		int hours = time.getHour();
		if (hours < 13) {
			msg = "Good Morning";
		} else if (hours < 16) {
			msg = "Good Afternoon";
		} else if (hours < 20) {
			msg = "Good Evening";
		} else {
			msg = "Good Night";
		}
		
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
}
