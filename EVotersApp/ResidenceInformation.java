package EVotersApp;

public class ResidenceInformation {
    private String state_of_residence;
    private String street_name;
    private String house_number;
    private String local_government;

    public ResidenceInformation(String state_of_residence, String street_name, String house_number, String local_government) {
        this.state_of_residence = state_of_residence;
        this.street_name = street_name;
        this.house_number = house_number;
        this.local_government = local_government;
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
        return "ResidenceInformation{" +
                "state_of_residence='" + state_of_residence + '\'' +
                ", street_name='" + street_name + '\'' +
                ", house_number='" + house_number + '\'' +
                ", local_government='" + local_government + '\'' +
                '}';
    }
}
