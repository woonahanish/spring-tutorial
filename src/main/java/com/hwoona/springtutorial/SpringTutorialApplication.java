package com.hwoona.springtutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringTutorialApplication {

	public static void main(String[] args) {
		BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		System.out.println(binarySearch.binarySearch(new int[] {12,5,4,3}, 3));

		SpringApplication.run(SpringTutorialApplication.class, args);
	}

}
