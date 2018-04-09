package com.in28minutes.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchimpl
{


    

    @Autowired
    private SortAlgorithm sortAlgorithm;



    public int binarySearch(int[] numbers, int numberToSearchFor)
    {
        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);
        return 3;
    }
    // Sorting an array

    // Search the arry
    // Return the result
}
