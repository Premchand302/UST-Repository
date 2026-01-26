package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.Show;

public interface ShowRepository extends JpaRepository<Show, Long>{
	List<Show> findByMovie_MovieId(Long movieId);
}
