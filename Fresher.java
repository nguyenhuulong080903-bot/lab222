package model;

/**
 * Subclass representing a Fresher Candidate.
 */
public class Fresher extends Candidate {
    private String graduationDate;
    private String graduationRank;
    private String education;

    /**
     * Default constructor
     */
    public Fresher() {
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
     * @param graduationDate Graduation Date
     * @param graduationRank Rank of Graduation
     * @param education University where graduated
     */
    public Fresher(String id, String firstName, String lastName, int birthDate, String address, String phone, String email, String graduationDate, String graduationRank, String education) {
        super(id, firstName, lastName, birthDate, address, phone, email, 1); // Type 1 for Fresher
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    public String getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }
}
