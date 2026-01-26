package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Show;
import com.repository.ShowRepository;

@Service
public class ShowService {
	
	@Autowired
	ShowRepository showRepository;
	
	public Show addShow(Show show) {
		return showRepository.save(show);
	}
	
	public List<Show> getAllShows(){
		return showRepository.findAll();
	}
	
	public List<Show> getShowsByMovie(Long movieId){
		return showRepository.findByMovie_MovieId(movieId);
	}
}
