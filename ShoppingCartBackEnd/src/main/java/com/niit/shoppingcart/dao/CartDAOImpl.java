package com.niit.shoppingcart.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.model.Cart;

@Repository("cartDAO")
public class CartDAOImpl implements CartDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public CartDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public void saveOrUpdate(Cart cart) {
		sessionFactory.getCurrentSession().saveOrUpdate(cart);

	}

	@Transactional
	public void delete(String id) {
		Cart cartItemToDelete = new Cart();
		cartItemToDelete.setCartProductId(id);
		sessionFactory.getCurrentSession().delete(cartItemToDelete);

	}

	@Transactional
	public Cart get(String id) {
	
		// sessionFactory.getCurrentSession().get(Cart.class, id);
		String hql = "from Cart where cartProductId=" + "'" + id + "'";
		Query query = (Query) sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings({ "deprecation", "unchecked" })
		List<Cart> listCartProduct = query.list();
		if (listCartProduct != null && !listCartProduct.isEmpty()) {
			return listCartProduct.get(0);
		}
		return null;
	}

	@Transactional
	@SuppressWarnings({ "unchecked", "deprecation" })
	public List<Cart> listCartItems() {
		List<Cart> listCartItems = sessionFactory.getCurrentSession().createCriteria(Cart.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listCartItems;
	}

}