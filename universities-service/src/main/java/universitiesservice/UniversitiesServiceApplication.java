package universitiesservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class UniversitiesServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UniversitiesServiceApplication.class, args);
	}

}
