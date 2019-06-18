package chudalewski.piotr.insertionsort;

public class Main {

    public static void main(String[] args) {


        int[] sortArray = {20, 35, -15, 7, 55, 1, -22};

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < sortArray.length; firstUnsortedIndex++) {
            int newElement = sortArray[firstUnsortedIndex];

            int i;

            for (i = firstUnsortedIndex; i > 0 && sortArray[i - 1] > newElement; i--) {
                sortArray[i] = sortArray[i - 1];

            }

            sortArray[i] = newElement;
        }

        for (int i = 0; i < sortArray.length; i++) System.out.println(sortArray[i]);

    }
}
    