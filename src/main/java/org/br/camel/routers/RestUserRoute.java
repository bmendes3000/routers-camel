package org.br.camel.routers;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.apache.camel.model.rest.RestParamType;
import org.br.camel.vos.UserVO;
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
		//aply rest configuration
		restConfiguration().component("restlet")
			.dataFormatProperty("prettyPrint", "true")
			.host("localhost")
			.port("8080")
			.bindingMode(RestBindingMode.auto);
		
		//rest to crud user.
		rest("/user")
			.consumes("application/json")
			.produces("application/json")
			.post("/include")
				.description("service to create the new user")
				.type(UserVO.class)
				.to("direct:insertUser")
			.get("/{id}")
				.description("service to find user by id")
				.param().name("id").type(RestParamType.path).dataType("int").endParam()
				.to("direct:findUser");
	}
	
	

}
