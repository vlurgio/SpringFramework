package com.in28minutes.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication
{

	public static void main(String[] args)
    {
        // what are the beans? use @Component

        // what are the dependencies of a bean? @Autowired

        // where to search for beans? by default searches in package

		//BinarySearchimpl binarySearch = new BinarySearchimpl(new QuickSortAlgorithm());
        // Aplication Context

        ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsApplication.class, args);
        BinarySearchimpl binarySearch = applicationContext.getBean(BinarySearchimpl.class);
		int result = binarySearch.binarySearch(new int[] { 12, 4, 6},3);
		System.out.print(result);


	}
}
