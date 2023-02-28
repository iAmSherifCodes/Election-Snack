package EVotersApp;

import java.time.Year;

public class PersonInformation {

    private String first_name;
    private String last_name;
    private String middle_name;
    private Gender gender;
    private Occupation occupation;
    private int day_of_birth;
    private int month_of_birth;
    private int year_of_birth;
    private RelationshipStatus relationshipStatus;
    private String state_of_residence;
    private String street_name;
    private String house_number;
    private String local_government;

    public PersonInformation(String first_name, String last_name, String middle_name, RelationshipStatus relationshipStatus, Gender gender, Occupation occupation, int day_of_birth, int month_of_birth, int year_of_birth, String state_of_residence, String street_name, String house_number, String local_government) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.middle_name = middle_name;
        this.gender = gender;
        this.relationshipStatus = relationshipStatus;
        this.occupation = occupation;
        this.day_of_birth = day_of_birth;
        this.month_of_birth = month_of_birth;
        this.year_of_birth = year_of_birth;
        this.state_of_residence = state_of_residence;
        this.street_name = street_name;
        this.house_number = house_number;
        this.local_government = local_government;
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

    public String getDOB(){
        if (this.day_of_birth < 10 || this.month_of_birth < 10) return String.format("0%d-0%d-%d", this.day_of_birth, this.month_of_birth, this.year_of_birth);
        return String.format("%d-%d-%d", this.day_of_birth, this.month_of_birth, this.year_of_birth);
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

    public String getState_of_residence() {
        return state_of_residence;
    }

    public void setState_of_residence(String state_of_residence) {
        this.state_of_residence = state_of_residence;
    }

    public String getStreet_name() {
        return street_name;
    }

    public void setStreet_name(String street_name) {
        this.street_name = street_name;
    }

    public String getHouse_number() {
        return house_number;
    }

    public void setHouse_number(String house_number) {
        this.house_number = house_number;
    }

    public String getLocal_government() {
        return local_government;
    }

    public void setLocal_government(String local_government) {
        this.local_government = local_government;
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
