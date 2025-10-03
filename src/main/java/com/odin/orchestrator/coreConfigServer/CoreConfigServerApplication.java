package com.odin.orchestrator.coreConfigServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableConfigServer
@EnableEurekaClient
@SpringBootApplication(exclude = {
	    org.springframework.boot.actuate.autoconfigure.metrics.SystemMetricsAutoConfiguration.class
	})
class CoreConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoreConfigServerApplication.class, args);
	}

}
