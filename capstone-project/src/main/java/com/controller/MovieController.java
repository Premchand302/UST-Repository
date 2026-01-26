package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Movie;
import com.service.MovieService;

@RestController
public class MovieController {
	@Autowired
	private MovieService movieService;
	
	@PostMapping("/api/movies")
	public Movie addMovie(@RequestBody Movie movie) {
		return movieService.addMovie(movie);
	}
	
	@GetMapping("/api/movies")
	public List<Movie> getAllMovies(){
		return movieService.getAllMovies();
	}
}
