package model;

/**
 * Superclass representing a generic Candidate.
 */
public class Candidate {
    private String id;
    private String firstName;
    private String lastName;
    private int birthDate;
    private String address;
    private String phone;
    private String email;
    private int type;

    /**
     * Default constructor
     */
    public Candidate() {
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
     * @param type Candidate Type (0: Experience, 1: Fresher, 2: Intern)
     */
    public Candidate(String id, String firstName, String lastName, int birthDate, String address, String phone, String email, int type) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
