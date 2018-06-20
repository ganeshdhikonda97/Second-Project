package com.niit.test;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.BlogDAO;
import com.niit.model.Blog;
import com.niit.model.BlogComment;

public class BlogDAOTestCase 
{
	/*static BlogDAO blogDAO;
	
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		
		blogDAO=(BlogDAO)context.getBean("blogDAO");
	}

	@Test
	public void addBlogTest()
	{
		Blog blog=new Blog();
		blog.setBlogId(103);	
		blog.setBlogName("Angularjs Framework");
		blog.setBlogContent("Angularjs Framework and Related Concepts");
		blog.setLikes(0);
		blog.setLoginname("sukanya");
		blog.setStatus("A");
		blog.setCreateDate(new java.util.Date());
		
		assertTrue("Problem in Blog Insertion",blogDAO.addBlog(blog));
	}

	/*@Ignore
	@Test
	public void deleteBlogTest()
	{
		assertTrue("Problem in Blog Deletion:",blogDAO.deleteBlog(952));
	}
	@Ignore
	@Test
	public void rejectBlogTest()
	{
		Blog blog=blogDAO.getBlog(953);
		assertTrue("Proble in Blog Rejection:",blogDAO.rejectBlog(blog));
	}
	@Ignore
	@Test
	public void approvalBlogTest()
	{
		Blog blog=blogDAO.getBlog(953);
		assertTrue("Proble in Blog Rejection:",blogDAO.approveBlog(blog));
	}

	@Test
	public void listBlogsByUserTest()
	{
		List<Blog> listBlogs=blogDAO.listApprovedBlogs(); //Returns an Collection
		assertTrue("Problem in Listing Blogs",listBlogs.size()>0);
		
		for(Blog blog:listBlogs)
		{
			System.out.print(blog.getBlogName()+":::");
			System.out.print(blog.getBlogContent()+":::");
			System.out.println(blog.getLoginname());
		}
	}
	@Ignore
	@Test
	public void incrementBlogLikeTest()
	{
		Blog blog=blogDAO.getBlog(953);
		assertTrue("Problem in Increment of Like:",blogDAO.incrementLike(blog));
	}
	@Ignore
	@Test
	public void addCommentTest()
	{
		BlogComment comment=new BlogComment();
		comment.setCommentText("The Blog is gives overall information:");
		comment.setLoginname("rohit");
		comment.setBlogId(953);
		comment.setCommentDate(new java.util.Date());
		
		assertTrue("Problem in Insertion of Blog Comment",blogDAO.addBlogComment(comment));
	}
	@Ignore
	@Test
	public void listAllBlogCommentsTest()
	{
		List<BlogComment> listBlogComments=blogDAO.listBlogComments(953);
		assertTrue("Problem in Retrieving all the BlogComments:",listBlogComments.size()>0);
		
		for(BlogComment blogComment:listBlogComments)
		{
			System.out.print(blogComment.getBlogId()+":::");
			System.out.print(blogComment.getCommentText()+":::");
			System.out.println(blogComment.getLoginname());
		}
	}
	
	
	
	
	
	*/
	
	
	
	
	
	
}
