package view;

import controller.CandidateController;
import model.Candidate;
import model.Experience;
import model.Fresher;
import model.Intern;
import utils.Validation;

import java.util.ArrayList;

/**
 * View class to handle user interaction and console output.
 */
public class CandidateView {
    private CandidateController controller;

    /**
     * Constructor initializes the view with a controller.
     */
    public CandidateView() {
        this.controller = new CandidateController();
    }

    /**
     * Starts the main menu loop.
     */
    public void start() {
        while (true) {
            System.out.println("CANDIDATE MANAGEMENT SYSTEM");
            System.out.println("1. Experience");
            System.out.println("2. Fresher");
            System.out.println("3. Internship");
            System.out.println("4. Searching");
            System.out.println("5. Exit");
            int choice = Validation.checkInputIntLimit("Please choose 1 to Create Experience Candidate, 2 to Create Fresher Candidate, 3 to Internship Candidate, 4 to Searching and 5 to Exit program: ", 1, 5);
            switch (choice) {
                case 1:
                    createCandidate(0);
                    break;
                case 2:
                    createCandidate(1);
                    break;
                case 3:
                    createCandidate(2);
                    break;
                case 4:
                    searchCandidate();
                    break;
                case 5:
                    return;
            }
        }
    }

    /**
     * Prompts the user to create a new candidate.
     * @param type The type of candidate (0: Experience, 1: Fresher, 2: Intern)
     */
    private void createCandidate(int type) {
        while (true) {
            String id;
            while (true) {
                id = Validation.checkInputString("Input Candidate ID: ");
                if (controller.isIdExist(id)) {
                    System.err.println("ID is exist. Please input another ID.");
                } else {
                    break;
                }
            }
            String firstName = Validation.checkInputString("Input First Name: ");
            String lastName = Validation.checkInputString("Input Last Name: ");
            int birthDate = Validation.checkInputBirthDate("Input Birth Date (1900 - Current): ");
            String address = Validation.checkInputString("Input Address: ");
            String phone = Validation.checkInputPhone("Input Phone (min 10 digits): ");
            String email = Validation.checkInputEmail("Input Email (e.g. annguyen@fpt.edu.vn): ");

            Candidate candidate = null;
            switch (type) {
                case 0:
                    int expInYear = Validation.checkInputExp("Input Year of Experience (0-100): ");
                    String proSkill = Validation.checkInputString("Input Professional Skill: ");
                    candidate = new Experience(id, firstName, lastName, birthDate, address, phone, email, expInYear, proSkill);
                    break;
                case 1:
                    String graduationDate = Validation.checkInputString("Input Graduation Date: ");
                    String graduationRank = Validation.checkInputGraduationRank("Input Rank of Graduation (Excellence, Good, Fair, Poor): ");
                    String education = Validation.checkInputString("Input Education (University): ");
                    candidate = new Fresher(id, firstName, lastName, birthDate, address, phone, email, graduationDate, graduationRank, education);
                    break;
                case 2:
                    String majors = Validation.checkInputString("Input Majors: ");
                    int semester = Validation.checkInputIntLimit("Input Semester: ", 1, 10);
                    String universityName = Validation.checkInputString("Input University Name: ");
                    candidate = new Intern(id, firstName, lastName, birthDate, address, phone, email, majors, semester, universityName);
                    break;
            }

            boolean success = controller.addCandidate(candidate);

            if (success) {
                System.out.println("Create success.");
            } else {
                System.out.println("Create failed.");
            }

            if (!Validation.checkInputYN("Do you want to continue (Y/N)? ")) {
                displayAllCandidates();
                break;
            }
        }
    }

    /**
     * Prompts the user to search for a candidate.
     */
    private void searchCandidate() {
        displayAllCandidates();
        String nameSearch = Validation.checkInputString("Input Candidate name (First name or Last name): ");
        int typeSearch = Validation.checkInputIntLimit("Input type of candidate: ", 0, 2);

        ArrayList<String> results = controller.searchCandidate(nameSearch, typeSearch);

        System.out.println("The candidates found:");
        if (results.isEmpty()) {
            System.out.println("Not found any candidate!");
        } else {
            for (String result : results) {
                System.out.println(result);
            }
        }
    }

    /**
     * Displays all current candidates grouped by type.
     */
    private void displayAllCandidates() {
        System.out.println("List of candidate:");
        ArrayList<String> displayList = controller.getAllCandidatesForDisplay();
        for (String line : displayList) {
            System.out.println(line);
        }
    }
}
