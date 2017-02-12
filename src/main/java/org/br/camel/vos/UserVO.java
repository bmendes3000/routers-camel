package org.br.camel.vos;

import java.io.Serializable;

public class UserVO implements Serializable {

	/**
	 * serial id class.
	 */
	private static final long serialVersionUID = 1910207445668049132L;
	/**
	 * Id user
	 */
	private Integer id;
	/**
	 * name user
	 */
	private String name;
	/**
	 * email user
	 */
	private String email;
	
	/**
	 * @return the id
	 */
	public final Integer getId() {
		return id;
	}
	/**
	 * @param value the id to set
	 */
	public final void setId(final Integer value) {
		this.id = value;
	}
	/**
	 * @return the name
	 */
	public final String getName() {
		return name;
	}
	/**
	 * @param value the name to set
	 */
	public final void setName(final String value) {
		this.name = value;
	}
	/**
	 * @return the email
	 */
	public final String getEmail() {
		return email;
	}
	/**
	 * @param value the email to set
	 */
	public final void setEmail(final String value) {
		this.email = value;
	}
	
	

}
