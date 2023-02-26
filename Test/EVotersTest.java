import org.junit.jupiter.api.BeforeEach;
import EVotersApp.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EVotersTest {
    public Voter voter;
    String first_name = "Sherif";
    String last_name = "Awofiranye";
    String middle_name = "Ola";
    Gender gender = Gender.MALE;
    int day_of_birth = 9;
    int month_of_birth = 9;
    int year_of_birth = 1999;
    Occupation occupation = Occupation.STUDENT;
    RelationshipStatus relationshipStatus = RelationshipStatus.SINGLE;
    String state_of_residence = "Lagos";
    String street_name = "PWD";
    String house_number = "9";
    String local_government = "IKEJA";

    @BeforeEach
    public void setUp(){
        voter = new Voter();
    }

    @Test
    void testThatAVoterWithoutPVCReturnsNull(){
        assertNull(voter.getPvc());
    }

    @Test
    void testThatAVoterHasAPVC(){
//        Pvc pvc = new Pvc(new BasicPersonalInformation(first_name,last_name,middle_name,relationshipStatus,gender,occupation,day_of_birth,month_of_birth,year_of_birth),new ResidenceInformation(state_of_residence,street_name,house_number,local_government))
//        voter.setPvc(pvc);
    }
}
