public abstract class Dog {
    protected int age;
    protected char gender;
    protected double heightAtWithers;
    protected double torsoLength;
    protected double mass;

    public Dog() {
    }

    public Dog(int age, char gender, double heightAtWithers, double torsoLength, double mass) {
        this.age = age;
        this.gender = gender;
        this.heightAtWithers = heightAtWithers;
        this.torsoLength = torsoLength;
        this.mass = mass;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public double getHeightAtWithers() {
        return heightAtWithers;
    }

    public double getTorsoLength() {
        return torsoLength;
    }

    public double getMass() {
        return mass;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setHeightAtWithers(double heightAtWithers) {
        this.heightAtWithers = heightAtWithers;
    }

    public void setTorsoLength(double torsoLength) {
        this.torsoLength = torsoLength;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", gender=" + gender +
                ", heightAtWithers=" + heightAtWithers +
                ", torsoLength=" + torsoLength +
                ", mass=" + mass +
                '}';
    }
}
