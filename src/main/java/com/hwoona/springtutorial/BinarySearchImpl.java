package com.hwoona.springtutorial;

public class BinarySearchImpl {

    private SortAlgorithm sortAlgorithm;

    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int[] numbers, int numberToSearchFor) {
        int[] sortNumbers = sortAlgorithm.sort(numbers);

        return 3;
    }
}
