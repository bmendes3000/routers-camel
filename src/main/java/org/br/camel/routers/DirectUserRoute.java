package org.br.camel.routers;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.br.camel.process.UserProcess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
/**
 * Direct Route User route
 * @author Bruno Mendes
 * @since 1.0
 * @version 1.0
 */
@Component
public class DirectUserRoute extends RouteBuilder {
	
	/**
	 * variable with inject of process user
	 */
	@Autowired
	private UserProcess process;
	
	@Override
	public void configure() throws Exception {
		from("direct:user")
			.log(LoggingLevel.INFO, "Send params [ {body} ] to process in routine")	
			.process(process)
			.end();
		
	}

}
