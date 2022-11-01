package com.appteka.lapy.ui.shops.product_card_shops;

public class SquareFinder {
    private final int countFrom = 10;
    private final int countUntil = 99;

    public int findSquares(int lowBorder, int highBorder) {
        if (lowBorder > highBorder)
            throw new IllegalStateException("lowBorder must be less or equal than highBorder");

        int result = 0;
        for (int i = countFrom; i <= countUntil; i++) {
            int square = i * i;
            if (square >= lowBorder && square <= highBorder)
                result++;
        }

        return result;
    }
}
