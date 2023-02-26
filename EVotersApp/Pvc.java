package EVotersApp;

import java.time.LocalDate;

public class Pvc {
    private BasicPersonalInformation basicPersonalInformation;
    private ResidenceInformation residenceInformation;
    private StringBuilder serial_number;
    private StringBuilder pvc_code;
    private StringBuilder batch_code;
    private LocalDate date_of_registration =  LocalDate.now();

    public Pvc(BasicPersonalInformation basicPersonalInformation, ResidenceInformation residenceInformation) {
        this.basicPersonalInformation = basicPersonalInformation;
        this.residenceInformation = residenceInformation;
    }

    public Pvc() {

    }

    public BasicPersonalInformation getBasicPersonalInformation() {
        return basicPersonalInformation;
    }

    public void setBasicPersonalInformation(BasicPersonalInformation basicPersonalInformation) {
        this.basicPersonalInformation = basicPersonalInformation;
    }

    public ResidenceInformation getResidenceInformation() {
        return residenceInformation;
    }

    public void setResidenceInformation(ResidenceInformation residenceInformation) {
        this.residenceInformation = residenceInformation;
    }

    public StringBuilder getVin() {
        return RandomNumbers.generateNumbersAndLetters(19);
    }

    public StringBuilder getSerial_number() {
        return serial_number;
    }

    public StringBuilder getPvc_code() {
        pvc_code = RandomNumbers.generateNumbers(9);
        return pvc_code;
    }

    public LocalDate getDate_of_registration() {
        return date_of_registration;
    }

    public StringBuilder getBatch_code() {
        return batch_code;
    }

    @Override
    public String toString() {
        return "Pvc{" +
                "basicPersonalInformation=" + basicPersonalInformation +
                ", residenceInformation=" + residenceInformation +
                ", vin= " + getVin() +
                ", serial_number='" + serial_number + '\'' +
                ", pvc_code='" + pvc_code + '\'' +
                ", date_of_registration='" + date_of_registration + '\'' +
                ", batch_code='" + batch_code + '\'' +
                '}';
    }
}