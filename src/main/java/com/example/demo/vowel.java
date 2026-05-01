package com.example.demo;
public class vowel {
        public static void main(String[] args) {
            String input = "Karthik k @123";

            int vowels = 0, consonants = 0, digits = 0, spaces = 0, specialChars = 0;

            input = input.toLowerCase();

            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);

                if (ch >= 'a' && ch <= 'z') {
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        vowels++;
                    } else {
                        consonants++;
                    }
                } else if (ch >= '0' && ch <= '9') {
                    digits++;
                } else if (ch == ' ') {
                    spaces++;
                } else {
                    specialChars++;
                }
            }

            System.out.println("Input: " + input);
            System.out.println("Vowels: " + vowels);
            System.out.println("Consonants: " + consonants);
            System.out.println("Digits: " + digits);
            System.out.println("Spaces: " + spaces);
            System.out.println("Special Characters: " + specialChars);
        }
    }

