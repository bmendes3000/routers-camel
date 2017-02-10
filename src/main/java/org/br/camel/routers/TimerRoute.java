package org.br.camel.routers;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;
/**
 * Route used to check a folder on the server, 
 * after processing is sent to another directory
 * @author bruno
 *
 */
@Component 
public class TimerRoute extends RouteBuilder {
	
	@Override
	public void configure() throws Exception {
		from("timer:foo?period=10s")
			.transform()
				.simple("Timer Route Online")
			.to("stream:out");
		
	}

}
