package com.sampleApache;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class DataProcessor implements Processor {

	public void process(Exchange dataExchange) throws Exception {
     dataExchange.getIn().setBody("Helloooo");
	}

}
