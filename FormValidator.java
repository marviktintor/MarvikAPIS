package com.marvik.apis.formvalidator;

import java.util.regex.Pattern;

import android.util.Patterns;

public class FormValidator {

	private String formInput;
	private boolean isValid;

	public FormValidator() {
		// TODO Auto-generated constructor stub
	}

	public String getFormInput() {
		return formInput;
	}

	public void setFormInput(String formInput) {
		this.formInput = formInput;
	}

	public boolean isValidInput(Pattern pattern, String formInput) {
		setFormInput(formInput);

		isValid = pattern.matcher(formInput).matches();

		return isValid;
	}

	public boolean isValidIdAddress(String ipAddress) {
		return isValidInput(Patterns.IP_ADDRESS, ipAddress);
	}

	public boolean isValidDomain(String domainName) {
		return isValidInput(Patterns.DOMAIN_NAME, domainName);
	}

	public boolean isValidWebsite(String website) {
		return isValidInput(Patterns.WEB_URL, website);
	}

	public boolean isValidEmail(String emailAddress) {
		return isValidInput(Patterns.EMAIL_ADDRESS, emailAddress);
	}

	public boolean isValidPhone(String phonenumber) {
		return isValidInput(Patterns.PHONE, phonenumber);
	}
}
