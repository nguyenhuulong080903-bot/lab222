package model;

/**
 * Subclass representing an Intern Candidate.
 */
public class Intern extends Candidate {
    private String majors;
    private int semester;
    private String universityName;

    /**
     * Default constructor
     */
    public Intern() {
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
     * @param majors Majors
     * @param semester Semester
     * @param universityName University name
     */
    public Intern(String id, String firstName, String lastName, int birthDate, String address, String phone, String email, String majors, int semester, String universityName) {
        super(id, firstName, lastName, birthDate, address, phone, email, 2); // Type 2 for Intern
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }
}
