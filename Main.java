package main;

import view.CandidateView;

/**
 * Main class to run the Candidate Management System.
 */
public class Main {
    /**
     * The main entry point of the application.
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        CandidateView view = new CandidateView();
        view.start();
    }
}
