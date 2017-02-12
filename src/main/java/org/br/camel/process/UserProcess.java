package org.br.camel.process;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;
@Component
public class UserProcess implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		System.out.println(exchange);
		

	}

}
