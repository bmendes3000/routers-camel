package org.br.camel.routers;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

/**
 * Class sample for rest with apache camel
 * @author Bruno Mendes
 * @since 1.0
 * @version 1.0
 */
@Component
public class RestUserRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		//rest to crud user.
		rest("/routers")
			.description("User rest service ")
			.consumes("application/json")
			.post("/user")
			.to("direct:insertUser");
	}
	
	

}
