package com.np.mail.service;

public interface mailService {

	String sendMail(final String toEmail, final String subject, final String body);
}
