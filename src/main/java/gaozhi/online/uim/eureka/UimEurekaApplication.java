package gaozhi.online.uim.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class UimEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(UimEurekaApplication.class, args);
	}

}
