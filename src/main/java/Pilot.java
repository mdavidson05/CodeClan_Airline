public class Pilot {

    private String name;
    private String rank;
    private String licence;
    private String canFly;

    public Pilot(String name, String rank, String licence, String canFly) {
        this.name = name;
        this.rank = rank;
        this.licence = licence;
        this.canFly = canFly;
    }

    public String getPilotName() {
        return name;
    }

    public String getPilotRank() {
        return rank;
    }

    public String getPilotLicence() {
        return licence;
    }

    public String getPilotCanFly() {
        return canFly;
    }
}
