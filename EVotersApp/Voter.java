package EVotersApp;

public class Voter{

    private Pvc pvc;

    public Voter(Pvc pvc){
        this.pvc = pvc;
    }
    public Voter(){
        this(null);
    }

    public void setPvc(Pvc pvc) {
        this.pvc = pvc;
    }

    public Pvc getPvc() {
        return pvc;
    }
    //    public Voter(BasicPersonalInformation basicPersonalInformation, ResidenceInformation residenceInformation, String serial_number, String pvc_code, String batch_code){
//        super(basicPersonalInformation, residenceInformation, serial_number, pvc_code, batch_code);
//    }
}
