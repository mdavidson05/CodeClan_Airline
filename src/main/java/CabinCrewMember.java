public class CabinCrewMember {

    String name;
    String rank;
    String message;

    public CabinCrewMember(String name, String rank, String message) {
        this.name = name;
        this.rank = rank;
        this.message = message;
    }


    public String getCabinCrewMemberName() {
        return this.name;
    }


    public String getCabinCrewMemberRank() {
        return this.rank;
    }

    public String getMessageToPassenger() {
        return this.message;
    }
}
