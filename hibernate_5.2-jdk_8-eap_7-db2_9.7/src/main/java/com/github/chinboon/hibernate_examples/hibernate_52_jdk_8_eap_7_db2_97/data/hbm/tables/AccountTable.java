package com.github.chinboon.hibernate_examples.hibernate_52_jdk_8_eap_7_db2_97.data.hbm.tables;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
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
		// hibernate.cfg.xml
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();

		try {
			this.sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();

		} catch (Exception e) {
			// The registry would be destroyed by the SessionFactory, but we had
			// trouble building the SessionFactory
			// so destroy it manually.
			StandardServiceRegistryBuilder.destroy(registry);
		}
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
