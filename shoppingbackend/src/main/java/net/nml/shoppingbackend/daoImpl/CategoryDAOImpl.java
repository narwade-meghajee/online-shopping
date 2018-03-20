package net.nml.shoppingbackend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.nml.shoppingbackend.dao.CategoryDAO;
import net.nml.shoppingbackend.dto.Category;

@Repository("categoryDAO")
@Transactional
public class CategoryDAOImpl implements CategoryDAO {
	@Autowired
	private SessionFactory sessionFactory;

	/*
	 * private static List<Category> categories = new ArrayList<>();
	 * 
	 * static { // adding first category Category category = new Category();
	 * category.setId(1); category.setName("Television");
	 * category.setDescription("This is some descriptin for Television");
	 * category.setImageURL("Cat_1.png"); categories.add(category);
	 * 
	 * // second category category = new Category(); category.setId(2);
	 * category.setName("Mobile"); category.setDescription(
	 * "This is some descriptin for Mobile"); category.setImageURL("Cat_2.png");
	 * categories.add(category);
	 * 
	 * // third category category = new Category(); category.setId(3);
	 * category.setName("Laptop"); category.setDescription(
	 * "This is some descriptin for Laptop"); category.setImageURL("Cat_3.png");
	 * categories.add(category); }
	 * 
	 * @Override public List<Category> list() { return categories; }
	 */

	/*
	 * @Override public Category get(int id) { // TODO Auto-generated method
	 * stub
	 * 
	 * // Enhanced for loop for (Category category : categories) { if
	 * (category.getId() == id) return category;
	 * 
	 * } return null; }
	 * 
	 */

	/*
	 * Getting single category based on id
	 */

	@Override
	public Category get(int id) {

		return sessionFactory.getCurrentSession().get(Category.class, Integer.valueOf(id));

	}
	/*
	 * Getting List categories
	 */

	@Override
	public List<Category> list() {

		String selectActiveCategory = "FROM Category WHERE active = :active";

		Query query = sessionFactory.getCurrentSession().createQuery(selectActiveCategory);

		query.setParameter("active", true);

		return query.getResultList();
	}

	@Override
	public boolean add(Category category) {

		try {
			// add the category to the database table
			sessionFactory.getCurrentSession().persist(category);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean update(Category category) {
		try {
			sessionFactory.getCurrentSession().update(category);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean delete(Category category) {
		category.setActive(false);
		try {
			sessionFactory.getCurrentSession().update(category);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}

	}

}
