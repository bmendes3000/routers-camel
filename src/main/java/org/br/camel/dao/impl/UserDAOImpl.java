package org.br.camel.dao.impl;

import org.br.camel.dao.UserDAO;
import org.br.camel.vos.UserVO;
import org.springframework.stereotype.Repository;
@Repository("userDAO")
public class UserDAOImpl implements UserDAO {

	@Override
	public void insert(final UserVO vo) {

	}

	@Override
	public UserVO findUserById(final Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
