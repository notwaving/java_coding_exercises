package com.techreturners.exercise001;

import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        return Character.toUpperCase(firstName.charAt(0)) + "." + Character.toUpperCase(lastName.charAt(0));
    }

    public double addVat(double originalPrice, double vatRate) {
        // This is how you calculate the answer
        double vatToAdd = (originalPrice * (vatRate / 100)) + originalPrice;
        // Returns answers of up to two decimal places
        return Math.round(vatToAdd * 100.0) / 100.0;
    }

    public String reverse(String sentence) {
        return new StringBuilder(sentence).reverse().toString();
    }

    public int countLinuxUsers(List<User> users) {
        int totalLinuxUsers = 0;

        for (int i = 0; i < users.size(); i++) {
            if (User.get(2) == "Linux"){
                totalLinuxUsers ++;
            }
        }
          return totalLinuxUsers;
    }
}
