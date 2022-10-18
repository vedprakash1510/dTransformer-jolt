

package com.dchikitsa.transformer.router;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class TransformerRouter extends RouteBuilder {
	@Override
	public void configure() throws Exception {

		from("undertow:{{server}}/search?useStreaming=true").to("jolt:test.json").log("${body}");
	}

}
