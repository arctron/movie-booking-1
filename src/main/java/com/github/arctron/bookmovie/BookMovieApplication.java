package com.github.arctron.bookmovie;

import java.util.List;
import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.github.arctron.bookmovie.dao.BookingRepository;
import com.github.arctron.bookmovie.dao.CustomerRepository;
import com.github.arctron.bookmovie.dao.HallRepository;
import com.github.arctron.bookmovie.dao.MovieRepository;
import com.github.arctron.bookmovie.dao.SeatRepository;
import com.github.arctron.bookmovie.dao.ShowRepository;
import com.github.arctron.bookmovie.dao.TheaterRepository;
import com.github.arctron.bookmovie.entity.Booking;
import com.github.arctron.bookmovie.entity.BookingId;
import com.github.arctron.bookmovie.entity.Customer;
import com.github.arctron.bookmovie.entity.Hall;
import com.github.arctron.bookmovie.entity.Movie;
import com.github.arctron.bookmovie.entity.Seat;
import com.github.arctron.bookmovie.entity.Show;
import com.github.arctron.bookmovie.entity.Theater;

@SpringBootApplication
public class BookMovieApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookMovieApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(MovieRepository movieRepo,
			TheaterRepository theaterRepo, HallRepository hallRepo,
			SeatRepository seatRepo, ShowRepository showRepo,
			CustomerRepository customerRepo, BookingRepository bookingRepo) {
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

			Show show1 = new Show(LocalDate.now(), LocalTime.of(10, 0), hall1, movieRepo.findAll().get(2));
			Show show2 = new Show(LocalDate.now(), LocalTime.of(15, 30), hall1, movieRepo.findAll().get(8));
			show1 = showRepo.save(show1);
			show2 = showRepo.save(show2);

			customerRepo.saveAll(List.of(
					new Customer("John"),
					new Customer("Jane"),
					new Customer("Joe"),
					new Customer("Jill")));

			Booking booking1 = new Booking(new BookingId(show1, seat1), customerRepo.findAll().get(0));
			bookingRepo.save(booking1);
			Booking booking2 = new Booking(new BookingId(show1, seat2), customerRepo.findAll().get(1));
			bookingRepo.save(booking2);
			Booking booking3 = new Booking(new BookingId(show1, seat3), customerRepo.findAll().get(2));
			bookingRepo.save(booking3);
			// Below code will throw unique primary key constraint violation exception
			// Booking booking4 = new Booking(new BookingId(show1, seat1),
			// customerRepo.findAll().get(3));
			// bookingRepo.save(booking4);
		};
	}
}
