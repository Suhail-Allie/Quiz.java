package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
                public static void Main(String[] args) {
                    String[] questions = {
                            "1. What is the capital of France?\nA. Berlin\nB. Madrid\nC. Paris",
                            "2. What is the largest planet in our solar system?\nA. Earth\nB. Jupiter\nC. Saturn",
                            "3. Who wrote 'Romeo and Juliet'?\nA. Charles Dickens\nB. William Shakespeare\nC. Mark Twain",
                            "4. What is the main ingredient in guacamole?\nA. Tomato\nB. Avocado\nC. Onion",
                            "5. What is the freezing point of water?\nA. 0°C\nB. 100°C\nC. 50°C",
                            "6. Which ocean is the largest?\nA. Atlantic\nB. Indian\nC. Pacific",
                            "7. Who painted the Mona Lisa?\nA. Van Gogh\nB. Da Vinci\nC. Picasso",
                            "8. What is the hardest natural substance on Earth?\nA. Gold\nB. Diamond\nC. Iron",
                            "9. How many continents are there?\nA. 5\nB. 6\nC. 7",
                            "10. What is the chemical symbol for water?\nA. O2\nB. H2O\nC. CO2"
                    };

                    char[] answers = {'C', 'B', 'B', 'B', 'A', 'C', 'B', 'B', 'C', 'B'};
                    int correctCount = 0;
                    int totalQuestions = questions.length;
                    Scanner scanner = new Scanner(System.in);

                    for (int i = 0; i < totalQuestions; i++) {
                        char userAnswer = ' ';
                        boolean validAnswer = false;

                        while (!validAnswer) {
                            System.out.println(questions[i]);
                            System.out.print("Enter A, B, or C: ");
                            userAnswer = scanner.nextLine().toUpperCase().charAt(0);

                            if (userAnswer == 'A' || userAnswer == 'B' || userAnswer == 'C') {
                                validAnswer = true;
                            } else {
                                System.out.println("Invalid input. Please enter A, B, or C.");
                            }
                        }

                        if (userAnswer == answers[i]) {
                            System.out.println("Correct!");
                            correctCount++;
                        } else {
                            System.out.println("The correct answer is " + answers[i]);
                        }
                    }

                    System.out.println("You got " + correctCount + " out of " + totalQuestions + " correct.");
                    scanner.close();
                }
            }
        }

    }
}