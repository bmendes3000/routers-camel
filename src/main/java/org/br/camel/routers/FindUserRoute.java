package org.br.camel.routers;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;
/**
 * Direct Route Find user 
 * @author Bruno Mendes
 * @since 1.0
 * @version 1.0
 */
@Component
public class FindUserRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("direct:findUser")
		.log(LoggingLevel.INFO, "Received params [ {body} ] in route insert user")
		.to("bean:userService?method=findUserById(${header.id})");
		
	}

}
