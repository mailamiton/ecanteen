package com.np.mail.app;

import com.np.mail.service.mailService;
import com.np.mail.service.mailServiceImpl;

public class mainApp {
	
	public static void main(String[] args) {

		mailService mail = new mailServiceImpl();
		mail.sendMail("", "", "");
	}

}
