package com.github.arctron.bookmovie;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.github.arctron.bookmovie.dao.MovieRepository;
import com.github.arctron.bookmovie.entity.Movie;

@SpringBootApplication
public class BookMovieApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookMovieApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(MovieRepository repository) {
		return args -> repository.saveAll(List.of(
				new Movie(1L, "The Godfather"),
				new Movie(2L, "The Godfather: Part II"),
				new Movie(3L, "The Dark Knight"),
				new Movie(4L, "12 Angry Men"),
				new Movie(5L, "Schindler's List"),
				new Movie(6L, "Pulp Fiction"),
				new Movie(7L, "The Lord of the Rings: The Return of the King"),
				new Movie(8L, "The Good, the Bad and the Ugly"),
				new Movie(9L, "Fight Club")));
	}
}
