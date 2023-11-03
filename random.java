import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int number = 1 + (int) (100 * Math.random());
        int K = 7;
        int count = 0;

        int i, guess;

        System.out.println("A number is chosen" + " between 1 to 100." + "Guess the number" + " within 7 trials.");

        for (i = 0; i < K; i++) {

            System.out.println("Guess the number:");
            guess = s.nextInt();
            if (guess > 1 && guess <= 100) {
                if (number == guess) {
                    count++;
                    System.out.println("Congratulations!" + " You correctly  guessed the number.");
                    System.out.println("you completed the game in " + count + "trails");

                    break;

                } else if (number > guess) {
                    System.out.println("The number is " + "greater than " + guess);
                    count++;
                } else if (number < guess) {
                    System.out.println("The number is" + " less than " + guess);
                    count++;
                }
            } else {
                System.out.println("sorry you have entered beyond number,please enter between 1 to 100 ");
            }
        }

        if (i == K) {
            System.out.println("Sorry your guesses are wrong");

            System.out.println("The number was " + number);
        }
    }
}