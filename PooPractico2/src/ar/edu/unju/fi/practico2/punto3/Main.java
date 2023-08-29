package ar.edu.unju.fi.practico2.punto3;

public class Main {
	
    public static double calculateSubstringSum(String str) {
        int totalSum = 0;

        for (int i = 0; i < str.length(); i++) {
            int num = 0;
            for (int j = i; j < str.length(); j++) {
                num = num * 10 + (str.charAt(j) - '0');
                System.out.println(num);
                totalSum += num%(Math.pow(10,9)+7);
            }
        }

        return totalSum;
    }

	public static void main(String[] args) {
		 String input = "42";
	        double substringSum = calculateSubstringSum(input);

	        System.out.println("Suma : " + substringSum);
	}

}
