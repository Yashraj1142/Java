// Implementation of Multithreaded Countdown Timer with User Input Monitoring

import java.util.Scanner;

// CountdownThread handles the countdown timer
class CountdownThread extends Thread {
    private int startTime;

    public CountdownThread(int startTime) {
        this.startTime = startTime;
    }

    @Override
    public void run() {
        for (int i = startTime; i >= 0; i--) {
            System.out.println("Time remaining: " + i + " seconds");
            try {
                Thread.sleep(1000); // Wait for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Time's up!");
    }
}

// InputThread checks for user input during the countdown
class InputThread extends Thread {
    private Scanner scanner;

    public InputThread() {
        scanner = new Scanner(System.in);
    }

    @Override
    public void run() {
        System.out.println("Enter 'stop' to end the game early:");
        String userInput = scanner.nextLine();
        if (userInput.equalsIgnoreCase("stop")) {
            System.out.println("Game stopped by the user.");
            System.exit(0); // Terminate the program immediately
        }
    }
}

// Main class to test the countdown timer with user input monitoring
public class Ques10 {
    public static void main(String[] args) {
        int countdownTime = 10; // Countdown from 10 seconds

        CountdownThread countdownThread = new CountdownThread(countdownTime);
        InputThread inputThread = new InputThread();

        countdownThread.start();
        inputThread.start();
    }
}
