package ru.netology.sqr;

public class SQRService {
    public int square (int BottomLine, int UpperBound) {

        int counter = 0;

        for (int i = 10; i < 99; i++) {
            int ii = i * i;
            if (ii >= BottomLine) {
                if (ii <= UpperBound) {
                    counter++;

                }
            }

        }
        return counter;
    }

}
