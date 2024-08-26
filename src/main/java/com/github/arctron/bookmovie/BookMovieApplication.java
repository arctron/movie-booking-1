package com.github.arctron.bookmovie;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.github.arctron.bookmovie.dao.HallRepository;
import com.github.arctron.bookmovie.dao.MovieRepository;
import com.github.arctron.bookmovie.dao.SeatRepository;
import com.github.arctron.bookmovie.entity.Hall;
import com.github.arctron.bookmovie.entity.Movie;
import com.github.arctron.bookmovie.entity.Seat;

@SpringBootApplication
public class BookMovieApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookMovieApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(MovieRepository movieRepo, HallRepository hallRepo, SeatRepository seatRepo) {
		return args -> {
			movieRepo.saveAll(List.of(
					new Movie(1L, "The Godfather"),
					new Movie(2L, "The Godfather: Part II"),
					new Movie(3L, "The Dark Knight"),
					new Movie(4L, "12 Angry Men"),
					new Movie(5L, "Schindler's List"),
					new Movie(6L, "Pulp Fiction"),
					new Movie(7L, "The Lord of the Rings: The Return of the King"),
					new Movie(8L, "The Good, the Bad and the Ugly"),
					new Movie(9L, "Fight Club")));
			Hall hall1 = new Hall("Hall_One");
			Hall hall2 = new Hall("Hall_Two");
			hall1 = hallRepo.save(hall1);
			hall2 = hallRepo.save(hall2);
			Seat seat1 = new Seat("Seat_1", hall1);
			Seat seat2 = new Seat("Seat_2", hall1);
			Seat seat3 = new Seat("Seat_3", hall1);
			seat1 = seatRepo.save(seat1);
			seat2 = seatRepo.save(seat2);
			seat3 = seatRepo.save(seat3);
		};
	}
}
