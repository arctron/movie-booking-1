package com.github.arctron.bookmovie;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.github.arctron.bookmovie.dao.HallRepository;
import com.github.arctron.bookmovie.dao.MovieRepository;
import com.github.arctron.bookmovie.dao.SeatRepository;
import com.github.arctron.bookmovie.dao.TheaterRepository;
import com.github.arctron.bookmovie.entity.Hall;
import com.github.arctron.bookmovie.entity.Movie;
import com.github.arctron.bookmovie.entity.Seat;
import com.github.arctron.bookmovie.entity.Theater;

@SpringBootApplication
public class BookMovieApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookMovieApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(MovieRepository movieRepo, TheaterRepository theaterRepo, HallRepository hallRepo,
			SeatRepository seatRepo) {
		return args -> {
			movieRepo.saveAll(List.of(
					new Movie("The Godfather"),
					new Movie("The Godfather: Part II"),
					new Movie("The Dark Knight"),
					new Movie("12 Angry Men"),
					new Movie("Schindler's List"),
					new Movie("Pulp Fiction"),
					new Movie("The Lord of the Rings: The Return of the King"),
					new Movie("The Good, the Bad and the Ugly"),
					new Movie("Fight Club")));

			Theater theater1 = new Theater("Theater_One");
			theater1 = theaterRepo.save(theater1);

			Hall hall1 = new Hall("Hall_One", theater1);
			Hall hall2 = new Hall("Hall_Two", theater1);
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
