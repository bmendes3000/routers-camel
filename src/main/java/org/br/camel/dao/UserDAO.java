package org.br.camel.dao;

import org.br.camel.vos.UserVO;

public interface UserDAO {
	/**
	 * method responsible by create user new in database.
	 * @param vo {@link UserVO}
	 */
	void insert(final UserVO vo);
}
