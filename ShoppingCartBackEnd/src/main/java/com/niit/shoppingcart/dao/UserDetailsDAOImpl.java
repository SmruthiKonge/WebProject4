package com.niit.shoppingcart.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.model.UserDetails;

@Repository("userDetailsDAO")
public class UserDetailsDAOImpl implements UserDetailsDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public UserDetailsDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public void saveOrUpdate(UserDetails userDetails) {
		sessionFactory.getCurrentSession().saveOrUpdate(userDetails);
	}

	@Transactional
	public void delete(String userName) {
		UserDetails userDetailsToDelete = new UserDetails();
		userDetailsToDelete.setUserName(userName);
		sessionFactory.getCurrentSession().delete(userDetailsToDelete);

	}

	@Transactional
	public UserDetails get(String userName) {
		Query query = sessionFactory.openSession().createQuery("from user_details where username = '"+userName+"'");
		List<UserDetails> listUser = (List<UserDetails>) query.getResultList();
		return listUser.get(0);
	}

	@Transactional
	public List<UserDetails> listUsers() {
		List<UserDetails> listUsers = sessionFactory.getCurrentSession().createCriteria(UserDetails.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listUsers;
	}

	@Transactional
	public boolean isValidUser(String id, String password) {
		String hql = "from UserDetails where userid= '" + id + "' and " + " password ='" + password+"'";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<UserDetails> list = (List<UserDetails>) query.list();
		
		if (list != null && !list.isEmpty()) {
			return true;
		}
		
		return false;
	}
	
}
