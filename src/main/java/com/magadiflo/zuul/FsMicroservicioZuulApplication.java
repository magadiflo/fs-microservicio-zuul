package com.magadiflo.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy // Este proy. será un servidor gateway de Zuul (servidor proxy) enrutador
@EnableEurekaClient // Este proy. será cliente de eureka
@SpringBootApplication
public class FsMicroservicioZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(FsMicroservicioZuulApplication.class, args);
	}

}
