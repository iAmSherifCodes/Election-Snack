package EVotersApp;

public class Voter extends PersonInformation{

    private Pvc pvc;
    private PoliticalParty politicalParty;

    public Voter(String first_name, String last_name, String middle_name, RelationshipStatus relationshipStatus, Gender gender, Occupation occupation, int day_of_birth, int month_of_birth, int year_of_birth, String state_of_residence, String street_name, String house_number, String local_government) {
        super(first_name, last_name, middle_name, relationshipStatus, gender, occupation, day_of_birth, month_of_birth, year_of_birth, state_of_residence, street_name, house_number, local_government);
    }


    public void pvcName(String pvcName) {
        pvcName = getFirst_name();
    }

    public boolean getPvc() {
        if (this.pvc != null) return true;
        return false;
    }

    public void vote() {
        PoliticalParty.voteLP();
    }


    //    public Voter(BasicPersonalInformation basicPersonalInformation, ResidenceInformation residenceInformation, String serial_number, String pvc_code, String batch_code){
//        super(basicPersonalInformation, residenceInformation, serial_number, pvc_code, batch_code);
//    }
}
