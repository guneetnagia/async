package com.guneet.AsyncExample;

import java.util.concurrent.CompletableFuture;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ApplicationRunner implements CommandLineRunner{

	private MovieService movieService;
	public ApplicationRunner(MovieService movieService){
		this.movieService = movieService;
	}
	@Override
	public void run(String... args) throws Exception {
		System.out.println("starting");
		CompletableFuture<MovieModel> result1 = movieService.lookForMovie("2baf70d1-42bb-4437-b551-e5fed5a87abe");
		CompletableFuture<MovieModel> result2 = movieService.lookForMovie("12cfb892-aac0-4c5b-94af-521852e46d6a");
		CompletableFuture<MovieModel> result3 = movieService.lookForMovie("4e236f34-b981-41c3-8c65-f8c9000b94e7");
		CompletableFuture.allOf(result1,result2,result3).join();
		System.out.println("ending");
		System.out.println(result1.get());
		System.out.println(result2.get());
		System.out.println(result3.get());
	}

}
