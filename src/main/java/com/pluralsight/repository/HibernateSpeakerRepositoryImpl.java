package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.Speaker;

//After refracting it will change to implements
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {
	
	//method
	@Override
	public List<Speaker> findAll() {
		List<Speaker> speakers=new ArrayList<Speaker>();
		
		Speaker speaker=new Speaker();
		
		speaker.setFirstName("Divyanka");
		speaker.setLastName("Wagh");
		
		speakers.add(speaker);
		
		
		return speakers;
		
		
	}
}
