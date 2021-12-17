public class Human {
    private Head head;
    private Hand leftHand;
    private Hand rightHand;
    private Body body;
    private Leg leftLeg;
    private Leg rightLeg;

    public Human(double mass, double height) {
        head = new Head(mass * 0.07, height * 1 / 8, height * 2.5 / 8);
        leftHand = new Hand(mass * 0.125 / 2, height * 3.5 / 8);
        rightHand = leftHand;
        body = new Body(mass * 0.46, height * 3 / 8, 90, 60, 90);
        leftLeg = new Leg(mass * 0.345 / 2, height * 4 / 8);
        rightLeg = leftLeg;
    }

    public Head getHead() {
        return head;
    }

    public Hand getLeftHand() {
        return leftHand;
    }

    public Hand getRightHand() {
        return rightHand;
    }

    public Body getBody() {
        return body;
    }

    public Leg getLeftLeg() {
        return leftLeg;
    }

    public Leg getRightLeg() {
        return rightLeg;
    }

    @Override
    public String toString() {
        return "Human{" +
                "\n head=" + head +
                "\n leftHand=" + leftHand +
                "\n rightHand=" + rightHand +
                "\n body=" + body +
                "\n leftLeg=" + leftLeg +
                "\n rightLeg=" + rightLeg +
                '}';
    }

    public static void main(String[] args) {
        Human h1 = new Human(70, 170);
        Human h2 = new Human(108, 180);
        Human h3 = new Human(77, 165);
        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);
    }
}
