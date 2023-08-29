package ar.edu.unju.fi.practico2.Punto3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<String> generateSubstrings(String str) {
        List<String> substrings = new ArrayList<>();

        int n = str.length();

        for (int len = 1; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                substrings.add(str.substring(i, j + 1));
            }
        }

        return substrings;
    }
	

	public static void main(String[] args) {
		String input = "123";
        List<String> substrings = generateSubstrings(input);

        System.out.println("Substrings of \"" + input + "\":");
        for (String substring : substrings) {
            System.out.println(substring);
        }

	}

}
