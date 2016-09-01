package com.niit.shoppingcart.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.model.Category;
import com.niit.shoppingcart.model.Product;

@Repository(value="categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public CategoryDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public void saveOrUpdate(Category category) {
		sessionFactory.getCurrentSession().saveOrUpdate(category);

	}

	@Transactional
	public void delete(String id) {
		Category categoryToDelete = new Category();
		categoryToDelete.setId(id);
		sessionFactory.getCurrentSession().delete(categoryToDelete);

	}

	@Transactional
	public Category get(String id) {

		// sessionFactory.getCurrentSession().get(Category.class,id);
		String hql = "from Category where id=" + "'" + id + "'";
		Query query = (Query) sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings({ "unchecked", "deprecation" })
		List<Category> listCategory = query.list();
		if (listCategory != null && !listCategory.isEmpty()) {
			return listCategory.get(0);
		}

		return null;

	}

	@Transactional
	public List<Category> listCategory() {
		@SuppressWarnings("unchecked")
		List<Category> listCategory = sessionFactory.getCurrentSession().createCriteria(Category.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listCategory;
	}

	@Override
	public List<Product> selectedCatProdList(String id) {
		// TODO Auto-generated method stub
		
		String hql="from Product where categoryId=" + "'" + id + "'";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<Product> listSelectedProducts = query.getResultList();
		return listSelectedProducts; 
		
	}

	@Override
	public int getProductsByCategory(String id) {
		// TODO Auto-generated method stub
		
		String hql="from Product where categoryId=" + "'" + id + "'";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<Product> listSelectedProducts = query.getResultList();
		return listSelectedProducts.size(); 
		
	}

	@Override
	public Category getByName(String name) {
		// TODO Auto-generated method stub
		String hql = "from Category where name=" + "'"+ name+"'";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<Category> list = (List<Category>) query.list();
		
		if (list != null && !list.isEmpty()) {
			return list.get(0);
		}
		return null;
	}

}