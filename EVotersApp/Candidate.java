package EVotersApp;

public class Candidate {
    private PersonInformation basicPersonalInformation;
    private ResidenceInformation residenceInformation;
    private Pvc pvc;
    private PoliticalParty politicalParty;

    public Candidate(PersonInformation basicPersonalInformation, ResidenceInformation residenceInformation, PoliticalParty politicalParty) {
        this.politicalParty = politicalParty;
    }

    public PoliticalParty getPoliticalParty(){
        return this.politicalParty;
    }

    public void setPoliticalParty(PoliticalParty politicalParty){
        this.politicalParty = politicalParty;
    }
}
