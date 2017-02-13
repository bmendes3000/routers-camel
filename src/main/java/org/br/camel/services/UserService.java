package org.br.camel.services;

import org.br.camel.vos.UserVO;

/**
 * Class of service for process the requests of user
 * @author bruno
 *
 */
public interface UserService {
	/**
	 * method responsible by create new user
	 * @param user {@link UserVO}
	 */
	void insert(final UserVO user);
	/**
	 * Method responsible by find user by id.
	 * @param id {@link Integer}
	 * @return {@link UserVO}
	 */
	UserVO findUserById(final Integer id);
}
