package net.nml.shoppingbackend.dao;

import java.util.List;

import net.nml.shoppingbackend.dto.Category;
import net.nml.shoppingbackend.test.CategoryTestCase;

public interface CategoryDAO {
	
	// CURD operation
	Category get(int id); //get the single category
	List<Category> list();// get the list of category
	boolean add(Category category);//add the new category
	boolean update(Category category);// update the available category
	boolean delete(Category category);// delete or disable the single category
	
}
