package com.pluralsight.repository;

import java.util.List;

import com.example.demo.Speaker;

public interface SpeakerRepository {

	//method
	List<Speaker> findAll();

}