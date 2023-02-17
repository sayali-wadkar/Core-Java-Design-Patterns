package com.prowings.configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = "com.prowings")
@EnableWebMvc
@PropertySource(value = "classpath:my.properties")
public class Spring_MVC_Config {

	@Autowired
	Environment enviornment;
	
	 @Bean
	    public DataSource dataSource() {
	        DriverManagerDataSource dataSource = new DriverManagerDataSource();
	        dataSource.setDriverClassName(enviornment.getRequiredProperty("database.driver"));
	        dataSource.setUrl(enviornment.getRequiredProperty("database.url"));
	        dataSource.setUsername(enviornment.getRequiredProperty("database.user"));
	        dataSource.setPassword(enviornment.getRequiredProperty("database.password"));
	        return dataSource;
	    }

	
	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		
		LocalSessionFactoryBean sessionFactory  = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(dataSource());
		sessionFactory.setPackagesToScan(new String [] {"com.prowings.model"});
		sessionFactory.setHibernateProperties(hibernateProperties());
		return sessionFactory;
		
	}

	private Properties hibernateProperties() {
		
		Properties prop = new Properties();
		prop.put("hibernate.dialect", enviornment.getRequiredProperty("hibernate.dialect"));
		prop.put("hibernate.hbm2ddl.auto", enviornment.getRequiredProperty("hibernate.hbm2ddl.auto"));
		prop.put("hibernate.show_sql", enviornment.getRequiredProperty("hibernate.show_sql"));
		prop.put("hibernate.format_sql",enviornment.getRequiredProperty("hibernate.format_sql"));
		return prop;
	}
	
}
