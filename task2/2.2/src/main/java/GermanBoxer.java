public class GermanBoxer extends Dog {
    private boolean dockedTail;

    public GermanBoxer(int age, char gender, double heightAtWithers, double torsoLength, double mass, boolean dockedTail) {
        this.age = age;
        this.gender = gender;
        this.heightAtWithers = heightAtWithers;
        this.torsoLength = torsoLength;
        this.mass = mass;
        this.dockedTail = dockedTail;
    }

    public boolean isDockedTail() {
        return dockedTail;
    }

    public void setDockedTail(boolean dockedTail) {
        this.dockedTail = dockedTail;
    }

    @Override
    public String toString() {
        return "GermanBoxer{" +
                "age=" + age +
                ", gender=" + gender +
                ", heightAtWithers=" + heightAtWithers +
                ", torsoLength=" + torsoLength +
                ", mass=" + mass +
                ", dockedTail=" + dockedTail +
                '}';
    }
}
