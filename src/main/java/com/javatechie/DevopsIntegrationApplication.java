package com.sureshrajuvetukuri;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopsIntegrationApplication {

	@GetMapping
	public String message(){
		<h1>Congratulations Luckymegha you have done it</h1>
			<h2>As the night became darker with the stars that glows in sky make me realise how special you are and with this new beginning we gonna be at our best</h2>
		return "At the end of the 2022 all our suffering got ended  and d we have completed your Devops project";
	}

	public static void main(String[] args) {
		SpringApplication.run(DevopsIntegrationApplication.class, args);
	}

}
