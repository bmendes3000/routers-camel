package org.br.camel.routers;

import org.apache.camel.builder.RouteBuilder;
import org.br.camel.process.FileProcess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *  Route used to check a folder on the server, 
 * after processing is sent to another directory
 * @author Bruno Mendes
 * @since 1.0
 */
@Component
public class FileRoute extends RouteBuilder {
	
	/**
	 * variable with inject of process file
	 */
	@Autowired
	private FileProcess process;
	
	@Override
	public void configure() throws Exception {
		from("file://${folder.file.input}?noop=true&delay=200")
		.convertBodyTo(byte[].class, "utf-8")
		.process(process)
		.to("file://${folder.file.output}");
		
	}
	
}
