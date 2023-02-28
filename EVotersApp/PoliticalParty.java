package EVotersApp;

public class PoliticalParty implements PartyInterface{
    private static int LP;
    private static int ADC;
    private int NNPP;
    private int ZLP;
    private int  BP;
    private int APC;
    private int PDP;
    private int  SDP;
    private int PPN;
    private int LOL;
    private int LMAO;
    private int LMFAO;
    private int BALA;
    private int BLU;

    public static int getLP() {
        return LP;
    }

    public static void voteLP() {
        ++LP;
    }

    public int getADC() {
        return ADC;
    }

    public void voteADC() {
        ++this.ADC;
    }

    public int getNNPP() {
        return NNPP;
    }

    public void voteNNPP() {
        ++this.NNPP;
    }

    public int getZLP() {
        return ZLP;
    }

    public void voteZLP() {
        ++this.ZLP;
    }

    public int getBP() {
        return BP;
    }

    public void voteBP() {
        ++this.BP;
    }

    public int getAPC() {
        return APC;
    }

    public void voteAPC() {
        ++this.APC;
    }

    public int getPDP() {
        return PDP;
    }

    public void votePDP() {
        ++this.PDP;
    }

    public int getSDP() {
        return SDP;
    }

    public void voteSDP() {
        ++this.SDP;
    }

    public int getPPN() {
        return PPN;
    }

    public void votePPN() {
        ++this.PPN;
    }

    public int getLOL() {
        return LOL;
    }

    public void voteLOL() {
        ++this.LOL;
    }

    public int getLMAO() {
        return LMAO;
    }

    public void voteLMAO() {
        ++this.LMAO;
    }

    public int getLMFAO() {
        return LMFAO;
    }

    public void voteLMFAO() {
        ++this.LMFAO;
    }

    public int getBALA() {
        return BALA;
    }

    public void voteBALA() {
        ++this.BALA;
    }

    public int getBLU() {
        return BLU;
    }

    public void voteBLU() {
        ++this.BLU;
    }

    @Override
    public void voteFor(int politicalParty) {
        ++politicalParty;
    }

    @Override
    public int get() {
        return 0;
    }
}
