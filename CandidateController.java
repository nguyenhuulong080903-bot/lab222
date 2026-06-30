package controller;

import model.Candidate;
import service.CandidateService;
import java.util.ArrayList;

/**
 * Controller class to manage the flow between View and Service layers.
 */
public class CandidateController {
    private CandidateService service;

    /**
     * Constructor initializes the service.
     */
    public CandidateController() {
        this.service = new CandidateService();
    }

    /**
     * Add a generic candidate using polymorphism.
     * @param candidate Candidate object (Experience, Fresher, or Intern)
     * @return true if added successfully, false otherwise
     */
    public boolean addCandidate(Candidate candidate) {
        return service.addCandidate(candidate);
    }

    /**
     * Check if a candidate ID already exists.
     * @param id Candidate ID to check
     * @return true if exists, false otherwise
     */
    public boolean isIdExist(String id) {
        return service.isIdExist(id);
    }

    /**
     * Search candidates by name and type. Returns formatted result strings.
     * @param name Name to search for
     * @param type Candidate type (0, 1, 2)
     * @return List of formatted strings representing the found candidates
     */
    public ArrayList<String> searchCandidate(String name, int type) {
        return service.searchCandidate(name, type);
    }

    /**
     * Retrieves all candidates grouped by type formatted as strings.
     * @return List of strings for displaying
     */
    public ArrayList<String> getAllCandidatesForDisplay() {
        return service.getAllCandidatesForDisplay();
    }
}
