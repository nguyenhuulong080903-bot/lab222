package model;

/**
 * Subclass representing an Experience Candidate.
 */
public class Experience extends Candidate {
    private int expInYear;
    private String proSkill;

    /**
     * Default constructor
     */
    public Experience() {
        super();
    }

    /**
     * Parameterized constructor
     * @param id Candidate ID
     * @param firstName Candidate First Name
     * @param lastName Candidate Last Name
     * @param birthDate Candidate Birth Date (Year)
     * @param address Candidate Address
     * @param phone Candidate Phone number
     * @param email Candidate Email
     * @param expInYear Years of Experience
     * @param proSkill Professional Skill
     */
    public Experience(String id, String firstName, String lastName, int birthDate, String address, String phone, String email, int expInYear, String proSkill) {
        super(id, firstName, lastName, birthDate, address, phone, email, 0); // Type 0 for Experience
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }
}
