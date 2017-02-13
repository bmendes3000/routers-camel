package org.br.camel.dao.impl;

import org.br.camel.dao.UserDAO;
import org.br.camel.jooq.db.public_.tables.User;
import org.br.camel.vos.UserVO;
import org.jooq.DSLContext;
import org.jooq.Record3;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
/**
 * Class to repository database
 * @author Bruno Mendes
 * @since 1.0
 * @version 1.0
 */
@Repository("userDAO")
public class UserDAOImpl implements UserDAO {
	
	@Autowired
	private DSLContext dsl;

	@Override
	public void insert(final UserVO vo) {
		//create new user in database
		dsl.insertInto(User.USER)
			.set(User.USER.ID, vo.getId())
			.set(User.USER.NAME, vo.getName())
			.set(User.USER.EMAIL, vo.getEmail())
			.execute();
	}

	@Override
	public UserVO findUserById(final Integer id) {
		//variable to return
		UserVO vo = new UserVO();
		
		//table for select
		User user = User.USER.as("u");
		
		//Result of the select
		Result<Record3<Integer, String, String>> result = dsl
				 	.select(user.ID, user.NAME, user.EMAIL)
							.from(user)
							.where(user.ID.eq(id)).fetch();
		
		//foreach
		result.forEach(record -> {
			//put values in value object 
			vo.setId(record.get(user.ID));
			vo.setName(record.get(user.NAME));
			vo.setEmail(record.get(user.EMAIL));
		 });
		//return result of the select in database
		return vo;
	}

}
