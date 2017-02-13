package org.br.camel.services.impl;

import org.br.camel.dao.UserDAO;
import org.br.camel.services.UserService;
import org.br.camel.vos.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * class of service to user.
 * @author Bruno Mendes
 * @since 1.0
 * @version 1.0
 */
@Service("userService")
public class UserServiceImpl implements UserService {
	/**
	 * variable with access the layer of repository
	 */
	@Autowired
	private UserDAO dao;
	
	@Override
	public void insert(final UserVO user) {
		//create new user in database
		dao.insert(user);
	}

	@Override
	public UserVO findUserById(final Integer id) {
		//find user by id
		return dao.findUserById(id);
	}

}
