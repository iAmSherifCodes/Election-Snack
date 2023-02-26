package EVotersApp;

import java.time.Year;

public class BasicPersonalInformation {

    private String first_name;
    private String last_name;
    private String middle_name;
    private Gender gender;
    private Occupation occupation;
    private int day_of_birth;
    private int month_of_birth;
    private int year_of_birth;
    private RelationshipStatus relationshipStatus;

    public BasicPersonalInformation(String first_name, String last_name, String middle_name, RelationshipStatus relationshipStatus, Gender gender, Occupation occupation, int day_of_birth, int month_of_birth, int year_of_birth) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.middle_name = middle_name;
        this.gender = gender;
        this.relationshipStatus = relationshipStatus;
        this.occupation = occupation;
        this.day_of_birth = day_of_birth;
        this.month_of_birth = month_of_birth;
        this.year_of_birth = year_of_birth;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getDay_of_birth() {
        return day_of_birth;
    }

    public void setDay_of_birth(int day_of_birth) {
        this.day_of_birth = day_of_birth;
    }

    public int getMonth_of_birth() {
        return month_of_birth;
    }

    public void setMonth_of_birth(int month_of_birth) {
        this.month_of_birth = month_of_birth;
    }

    public int getYear_of_birth() {
        return year_of_birth;
    }

    public void setYear_of_birth(int year_of_birth) {
        this.year_of_birth = year_of_birth;
    }

    public int getAge() {
        int current_year = Year.now().getValue();
        return current_year - year_of_birth;
    }

    public Occupation getOccupation() {
        return occupation;
    }

    public void setOccupation(Occupation occupation) {
        this.occupation = occupation;
    }

    public RelationshipStatus getRelationshipStatus() {
        return relationshipStatus;
    }

    public void setRelationshipStatus(RelationshipStatus relationshipStatus) {
        this.relationshipStatus = relationshipStatus;
    }

    @Override
    public String toString() {
        return "BasicPersonalInformation{" +
                "first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", middle_name='" + middle_name + '\'' +
                ", gender=" + gender +
                ", occupation=" + occupation +
                ", day_of_birth=" + day_of_birth +
                ", month_of_birth=" + month_of_birth +
                ", year_of_birth=" + year_of_birth +
                ", relationshipStatus=" + relationshipStatus +
                '}';
    }

}
