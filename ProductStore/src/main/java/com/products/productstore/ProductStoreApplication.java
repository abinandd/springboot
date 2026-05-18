package com.products.productstore;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductStoreApplication {

    public static void main(String[] args) {

        // Taking informations from the env
        Dotenv dotenv = Dotenv.configure().ignoreIfMissing().load();
        dotenv.entries().forEach((dotenvEntry -> System.setProperty(
                dotenvEntry.getKey(),dotenvEntry.getValue()
        )));
        SpringApplication.run(ProductStoreApplication.class, args);
    }
}
