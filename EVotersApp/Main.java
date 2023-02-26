package EVotersApp;

public class Main {
    public static void main(String[] args) {
        BasicPersonalInformation basicPersonalInformation = new BasicPersonalInformation("Sherif", "Awo", "Ola",
                RelationshipStatus.ENGAGED, Gender.MALE, Occupation.STUDENT,9,9, 1999);
        System.out.println(basicPersonalInformation.getAge());

        ResidenceInformation residenceInformation = new ResidenceInformation("Ogun","Lyson","32","ADO-ODO-OTA");

        Pvc pvc =new Pvc(basicPersonalInformation,residenceInformation);
        System.out.println(pvc.getDate_of_registration());
        System.out.println(pvc.getVin());

    }
}
