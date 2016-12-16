package com.github.chinboon.hibernate_examples.hibernate_52_jdk_8_eap_7_db2_97.data.hbm.tables;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import com.github.chinboon.hibernate_examples.hibernate_52_jdk_8_eap_7_db2_97.data.hbm.Account;

/**
 * Account Table
 * 
 * @author Oh Chin Boon (chinboon.oh2@gmail.com)
 * @since 1.0.0
 */
@Repository
public class AccountTable {
	private SessionFactory sessionFactory;

	/**
	 * Setup Session Factory
	 * 
	 * @since 1.0.0
	 */
	private void setup() {
		// laods hibernate.cfg.xml
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		this.sessionFactory = configuration.buildSessionFactory(builder.build());

	}

	/**
	 * Read all the Students.
	 * 
	 * @return a List of Students
	 * @since 1.0.0
	 */
	public Account findOne(final String accountId) {
		this.setup();

		Session session = sessionFactory.openSession();

		return session.find(Account.class, accountId);
	}
}
