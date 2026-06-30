package service;

import model.Candidate;
import java.util.ArrayList;

/**
 * Service class to manage the business logic and data access of candidates.
 */
public class CandidateService {
    private ArrayList<Candidate> candidates;

    /**
     * Constructor initializes the candidates list.
     */
    public CandidateService() {
        this.candidates = new ArrayList<>();
    }

    /**
     * Add a generic candidate.
     * @param candidate Candidate object
     * @return true if added successfully, false otherwise
     */
    public boolean addCandidate(Candidate candidate) {
        if (candidate != null) {
            candidates.add(candidate);
            return true;
        }
        return false;
    }

    /**
     * Check if a candidate ID already exists.
     * @param id Candidate ID to check
     * @return true if exists, false otherwise
     */
    public boolean isIdExist(String id) {
        for (Candidate c : candidates) {
            if (c.getId().equalsIgnoreCase(id)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Search candidates by name and type.
     * @param name Name to search for
     * @param type Candidate type (0, 1, 2)
     * @return List of formatted strings representing the found candidates
     */
    public ArrayList<String> searchCandidate(String name, int type) {
        ArrayList<String> result = new ArrayList<>();
        for (Candidate c : candidates) {
            if (c.getType() == type) {
                String fullName = c.getFirstName() + " " + c.getLastName();
                if (fullName.toLowerCase().contains(name.toLowerCase())) {
                    result.add(formatCandidate(c));
                }
            }
        }
        return result;
    }

    /**
     * Helper method to format candidate output string.
     */
    private String formatCandidate(Candidate c) {
        return c.getFirstName() + " " + c.getLastName() + " | " + c.getBirthDate() + " | " + 
               c.getAddress() + " | " + c.getPhone() + " | " + c.getEmail() + " | " + c.getType();
    }

    /**
     * Retrieves all candidates grouped by type formatted as strings.
     * @return List of strings for displaying
     */
    public ArrayList<String> getAllCandidatesForDisplay() {
        ArrayList<String> list = new ArrayList<>();
        list.add("===========EXPERIENCE CANDIDATE============");
        for (Candidate c : candidates) {
            if (c.getType() == 0) list.add(c.getFirstName() + " " + c.getLastName());
        }
        list.add("==========FRESHER CANDIDATE==============");
        for (Candidate c : candidates) {
            if (c.getType() == 1) list.add(c.getFirstName() + " " + c.getLastName());
        }
        list.add("===========INTERN CANDIDATE==============");
        for (Candidate c : candidates) {
            if (c.getType() == 2) list.add(c.getFirstName() + " " + c.getLastName());
        }
        return list;
    }
}
