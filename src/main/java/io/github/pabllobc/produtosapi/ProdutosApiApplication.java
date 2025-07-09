package io.github.pabllobc.produtosapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProdutosApiApplication {

	@GetMapping("helloworld")
	public String helloWord(){
		return "Hello World!";
	}

	public static void main(String[] args) {
		SpringApplication.run(ProdutosApiApplication.class, args);
	}

}
