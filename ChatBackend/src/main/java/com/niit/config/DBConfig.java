package com.niit.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.dao.BlogDAO;
import com.niit.dao.BlogDAOImpl;
import com.niit.dao.ForumDAO;
import com.niit.dao.ForumDAOImpl;
import com.niit.dao.UserDetailDAO;
import com.niit.dao.UserDetailDAOImpl;
import com.niit.model.Blog;
import com.niit.model.Forum;
import com.niit.model.UserDetail;

@Configuration
@ComponentScan("com.niit")
@EnableTransactionManagement
public class DBConfig 
{
	
	//1.Data Source Object
	public DataSource getDataSource()
	{
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
		dataSource.setUsername("ganesh");
		dataSource.setPassword("ganesh1997");
		return dataSource;
	}
	
	//2.Create SessionFactory Bean
	@Bean(name="sessionFactory")
	public SessionFactory getSessionFactory()
	{
		
		Properties hibernateProp=new Properties();
		hibernateProp.put("hibernate.hbmddl2.auto","update");
		hibernateProp.put("hibernate.dialect", "org.hibernate.dialect.Oracle10gDialect");
		
		LocalSessionFactoryBuilder sessionFactoryBuilder=new LocalSessionFactoryBuilder(getDataSource());
		sessionFactoryBuilder.addProperties(hibernateProp);
		
		
		sessionFactoryBuilder.addAnnotatedClass(UserDetail.class);
		sessionFactoryBuilder.addAnnotatedClass(Blog.class);
		sessionFactoryBuilder.addAnnotatedClass(Forum.class);
		
		
		SessionFactory sessionFactory=sessionFactoryBuilder.buildSessionFactory();
		System.out.println("----SessionFactory Object----------");
		return sessionFactory;
	}
	
	
	
	
	
	@Bean(name="userDetailDAO")
	public UserDetailDAO getUserDetailDAO()
	{
		return new UserDetailDAOImpl();
	}
	
	@Bean(name="blogDAO")
	public BlogDAO getBlogDAO()
	{
		return new BlogDAOImpl();
	}
	
	@Bean(name="forumDAO")
	public ForumDAO getForumDAO()
	{
		return new ForumDAOImpl();
	}
	
	@Bean
	public HibernateTransactionManager getHibernateTransactionManager(SessionFactory sessionFactory)
	{
		System.out.println("----Hibernate Object----------");
		return new HibernateTransactionManager(sessionFactory);
	}
}
