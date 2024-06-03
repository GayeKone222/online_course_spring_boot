package com.springproject.jpa;

import com.github.javafaker.Faker;
import com.springproject.jpa.models.Author;
import com.springproject.jpa.repositories.AuthorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class  JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}


	@Bean
	public CommandLineRunner commandLineRunner(
			AuthorRepository authorRepository
	){
		return  args -> {
//			for (int i = 0; i < 50; i++) {
//				Faker faker = new Faker();
//				var author = Author.builder()
//						.firstName(faker.name().firstName())
//						.lastName(faker.name().lastName())
//						.age(faker.number().numberBetween(19,50))
//						.email(faker.name().username()+i+"@gmail.com")
//						.build();
//				authorRepository.save(author);
//
//			}

			//update author
//			var author = Author.builder()
//						.id(1)
//						.firstName("Gaye")
//						.lastName("Kone")
//						.age(27)
//						.email("gayekone2013@gmail.com")
//						.build();
//			authorRepository.save(author);

//			authorRepository.updateAuthor(100, 1);

			authorRepository.updateAllAuthorsAges(99);



		};
	}

}
