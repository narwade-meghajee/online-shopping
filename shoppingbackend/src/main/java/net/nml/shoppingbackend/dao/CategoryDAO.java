package net.nml.shoppingbackend.dao;

import java.util.List;

import net.nml.shoppingbackend.dto.Category;

public interface CategoryDAO {
	boolean add(Category category);
	List<Category> list();
	Category get(int id);
}
