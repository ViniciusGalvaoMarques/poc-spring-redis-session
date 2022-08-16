package com.vgmlabs.pocredissession;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@SpringBootApplication
public class PocRedisSessionApplication {

	public static void main(String[] args) {
		SpringApplication.run(PocRedisSessionApplication.class, args);
	}

}
