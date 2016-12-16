package com.github.chinboon.hibernate_examples.hibernate_52_jdk_8_eap_7_db2_97.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.chinboon.hibernate_examples.hibernate_52_jdk_8_eap_7_db2_97.data.hbm.Account;
import com.github.chinboon.hibernate_examples.hibernate_52_jdk_8_eap_7_db2_97.data.hbm.tables.AccountTable;

/**
 * Account Service
 * 
 * @author Oh Chin Boon (chinboon.oh2@gmail.com
 * @since 1.0.0
 */
@Service
public class AccountService {
	@Autowired
	private AccountTable accountTable;

	/**
	 * Gets account information
	 * 
	 * @return
	 * @since 1.0.0
	 */
	public Account getAccount(final String accountId) {
		return this.accountTable.findOne(accountId);
	}
}
