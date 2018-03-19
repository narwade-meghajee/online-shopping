package net.nml.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.nml.shoppingbackend.dao.CategoryDAO;
import net.nml.shoppingbackend.dto.Category;

public class CategoryTestCase {

	private static AnnotationConfigApplicationContext context;

	private static CategoryDAO categoryDAO;

	private Category category;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("net.nml.shoppingbackend");
		context.refresh();
		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
	}

	@Test
	public void testAddCategory() {

		/*
		 //First Category
		category = new Category();
		category.setName("Television");
		category.setDescription("This is some descriptin for Television");
		category.setImageURL("Cat_1.png");
		assertEquals("Successfully added a category inside the table!", true, categoryDAO.add(category));
		
		//Second Category
		category = new Category();
		category.setName("Mobile");
		category.setDescription("This is some descriptin for Mobile");
		category.setImageURL("Cat_2.png");
		assertEquals("Successfully added a category inside the table!", true, categoryDAO.add(category));
		
		//Third category
		category = new Category();
		category.setName("Laptop");
		category.setDescription("This is some descriptin for Laptop");
		category.setImageURL("Cat_3.png");
		assertEquals("Successfully added a category inside the table!", true, categoryDAO.add(category));
       */
	}

}
