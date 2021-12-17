public class GermanShepherd extends Dog {
    private String firstColor;
    private String secondColor;

    public GermanShepherd(int age, char gender, double heightAtWithers, double torsoLength, double mass, String firstColor, String secondColor) {
        this.age = age;
        this.gender = gender;
        this.heightAtWithers = heightAtWithers;
        this.torsoLength = torsoLength;
        this.mass = mass;
        this.firstColor = firstColor;
        this.secondColor = secondColor;
    }

    public String getFirstColor() {
        return firstColor;
    }

    public String getSecondColor() {
        return secondColor;
    }

    public void setFirstColor(String firstColor) {
        this.firstColor = firstColor;
    }

    public void setSecondColor(String secondColor) {
        this.secondColor = secondColor;
    }

    @Override
    public String toString() {
        return "GermanShepherd{" +
                "age=" + age +
                ", gender=" + gender +
                ", heightAtWithers=" + heightAtWithers +
                ", torsoLength=" + torsoLength +
                ", mass=" + mass +
                ", firstColor='" + firstColor + '\'' +
                ", secondColor='" + secondColor + '\'' +
                '}';
    }
}
