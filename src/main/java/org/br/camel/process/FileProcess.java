package org.br.camel.process;

import java.io.BufferedReader;
import java.util.stream.Stream;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
/**
 * Process file 
 * @author Bruno Mendes
 * @since 1.0
 */
@Component
public class FileProcess implements Processor {
	/**
	 * variable of log
	 */
	private static Logger log = Logger.getLogger(FileProcess.class);
	
	/**
	 * Method responsible by process the file.
	 */
	public void process(Exchange exchange) throws Exception {
		log.info("Init process of check of the file");
		BufferedReader buffer = exchange.getIn().getBody(BufferedReader.class); 
		//read lines of the file.
		try (Stream<String> stream = buffer.lines()) {
			//read line
			stream.forEach(line -> {
				//verify line content number 1
				if ("1".contentEquals(line)) {
					log.info("Process first line [" + line + "] of the file" );
				}
				log.debug("Process line [" + line + "] of the file");
			});
			
		} catch (Exception e) {
			log.error("Error on read file", e);
		}
		
		log.info("Finish process");
		
	}

}
