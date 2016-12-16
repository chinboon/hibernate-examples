package com.github.chinboon.hibernate_examples.hibernate_52_jdk_8_eap_7_db2_97.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.chinboon.hibernate_examples.hibernate_52_jdk_8_eap_7_db2_97.data.hbm.Account;
import com.github.chinboon.hibernate_examples.hibernate_52_jdk_8_eap_7_db2_97.web.services.AccountService;

/**
 * Account Controller
 * 
 * @author Oh Chin Boon (chinboon.oh2@gmail.com)
 * @since 1.0.0
 */
@RequestMapping(value = "/accounts/{accountId}")
@RestController
public class AccountController {
	@Autowired
	private AccountService accountService;

	/**
	 * Gets account information
	 * 
	 * @param accountId
	 * @return
	 * @since 1.0.0
	 */
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public String getAccount(@PathVariable("accountId") final String accountId) {
		final Account account = this.accountService.getAccount(accountId);

		return account.toString();
	}
}
