package org.ichillous.tests.h2test;

import org.ichillous.tests.h2test.model.Book;
import org.ichillous.tests.h2test.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
public class H2testApplication {

    public static void main(String[] args) {
        SpringApplication.run(H2testApplication.class, args);

    }

    @Bean
    CommandLineRunner commandLineRunner(BookRepository repository) {
        return args -> {
            repository.save(new Book(
                    null, "Sring boot Up and Running :) ", 999, "Trump Donald"
            ));
        };
    }

}
