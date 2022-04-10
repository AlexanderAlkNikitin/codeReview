package ru.anikitin.codereview.task_1.util;

import lombok.experimental.UtilityClass;

@UtilityClass
public class StringConverter {

    public static String convertStringTo(String s, int from, int to) {
        int r = 0;
        int n = s.length();
        int i;
        for (i = 0; i < n; i++) {
            r = r * from + Integer.parseInt("" + s.charAt(i));
        }
        String q = "";
        while (r > 0) {
            q = (r % to) + q;
            r = r / to;
        }
        return q;
    }
}
