package com.guneet.AsyncExample;

import java.util.concurrent.CompletableFuture;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MovieService {
	private RestTemplate restTemplate;
	
	public MovieService(RestTemplateBuilder restTemplateBuilder){
		this.restTemplate = restTemplateBuilder.build();
	}
	
	public CompletableFuture<MovieModel> lookForMovie(String movieId) throws InterruptedException{
		System.out.println("entering in movie hunt");
		String url = String.format("https://ghibliapi.herokuapp.com/films/%s",movieId);
		MovieModel results = restTemplate.getForObject(url, MovieModel.class);
		Thread.sleep(3000);
		return CompletableFuture.completedFuture(results);
	}
}
