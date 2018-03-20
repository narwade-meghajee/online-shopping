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
	public void testCRUDCategory() {

		// add operation
		category = new Category();
		category.setName("Laptop");
		category.setDescription("This is some description for laptop!");
		category.setImageURL("CAT_1.png");
		assertEquals("Successfully added a category inside the table!", true, categoryDAO.add(category));
		
		category = new Category();
		category.setName("Television");
		category.setDescription("This is some description for television!");
		category.setImageURL("CAT_2.png");
		assertEquals("Successfully added a category inside the table!", true, categoryDAO.add(category));
		
		category = new Category();
		category.setName("Mobile");
		category.setDescription("This is some description for mobile!");
		category.setImageURL("CAT_3.png");
		assertEquals("Successfully added a category inside the table!", true, categoryDAO.add(category));


		// fetching and updating the category
		category = categoryDAO.get(2);
		category.setName("TV");
		assertEquals("Successfully updated a single category in the table!", true, categoryDAO.update(category));

		// delete the category
		assertEquals("Successfully deleted a single category in the table!", true, categoryDAO.delete(category));

		// fetching the list
		assertEquals("Successfully fetched the list of categories from the table!", 2, categoryDAO.list().size());
	}

}
