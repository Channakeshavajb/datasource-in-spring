package com.xworkz.spring.tester;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class ThreadTest {

	public static void main(String[] args) throws SQLException {
		
		ApplicationContext container=new ClassPathXmlApplicationContext("resource/context.xml");
		Thread thread=container.getBean(Thread.class);
		System.out.println(thread);
		
		DataSource datasource=container.getBean(DriverManagerDataSource.class);
		Connection connection=datasource.getConnection();
		System.out.println(connection);
		connection.close();
	}

}
