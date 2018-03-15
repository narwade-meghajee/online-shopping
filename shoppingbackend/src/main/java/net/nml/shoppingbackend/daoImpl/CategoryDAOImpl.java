package net.nml.shoppingbackend.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.nml.shoppingbackend.dao.CaterogyDAO;
import net.nml.shoppingbackend.dto.Category;

@Repository("caterogyDAO")
public class CategoryDAOImpl implements CaterogyDAO {
	
	private static List<Category>categories=new ArrayList<>();
	
	static{
		//adding first category
		Category category=new Category();
		category.setId(1);
		category.setName("Television");
		category.setDescription("This is some descriptin for Television");
		category.setImageURL("Cat_1.png");
		categories.add(category);
		
		//second category
		category=new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This is some descriptin for Mobile");
		category.setImageURL("Cat_2.png");
		categories.add(category);
		
		//third category
		category=new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("This is some descriptin for Laptop");
		category.setImageURL("Cat_3.png");
		categories.add(category);
	}
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

}
