package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Show;
import com.service.ShowService;

@RestController
public class ShowController {
	@Autowired
	private ShowService showService;
	
	@PostMapping("/api/shows")
	public Show addShow(@RequestBody Show show) {
		return showService.addShow(show);
	}
	
	@GetMapping("/api/shows")
	public List<Show> getAllShows(){
		return showService.getAllShows();
	}
	
	@GetMapping("/api/shows/movie/{movieId}")
    public List<Show> getShowsByMovie(@PathVariable Long movieId) {
        return showService.getShowsByMovie(movieId);
    }
}
