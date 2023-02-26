package EVotersApp;

public class Candidate extends Pvc {


    private PoliticalParty politicalParty;

    public Candidate(BasicPersonalInformation basicPersonalInformation, ResidenceInformation residenceInformation, String serial_number, String pvc_code, String batch_code, PoliticalParty politicalParty) {
        super(basicPersonalInformation, residenceInformation, serial_number, pvc_code, batch_code);
        this.politicalParty = politicalParty;
    }

    public PoliticalParty getPoliticalParty(){
        return this.politicalParty;
    }

    public void setPoliticalParty(PoliticalParty politicalParty){
        this.politicalParty = politicalParty;
    }
}
