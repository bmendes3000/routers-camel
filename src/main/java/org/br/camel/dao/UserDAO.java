package org.br.camel.dao;

import org.br.camel.vos.UserVO;

public interface UserDAO {
	/**
	 * method responsible by create user new in database.
	 * @param vo {@link UserVO}
	 */
	void insert(final UserVO vo);
	/**
	 * method responsible by find user by id
	 * @param user {@link UserVO}
	 */
	UserVO findUserById(final Integer id);
}
