public class Sofa extends Furniture {
    private String materialCloth;
    private boolean havePillows;

    public Sofa() {
        super("NONE", "White", 0, "NONE");
        this.materialCloth = "NONE";
        this.havePillows = false;
    }

    public Sofa(String company, String color, int cost, String materialFrame, String materialCloth, boolean havePillows) {
        super(company, color, cost, materialFrame);
        this.materialCloth = materialCloth;
        this.havePillows = havePillows;
    }

    public String getMaterialCloth() {
        return materialCloth;
    }

    public void setMaterialCloth(String materialCloth) {
        this.materialCloth = materialCloth;
    }

    public boolean isHavePillows() {
        return havePillows;
    }

    public void setHavePillows(boolean havePillows) {
        this.havePillows = havePillows;
    }

    @Override
    public void Construct() {
        System.out.println("Сборка дивана");
    }

    @Override
    public void Transfer() {
        System.out.println("Доставка дивана");
    }

    @Override
    public void DeConstruct() {
        System.out.println("Разборка Дивана");
    }

    @Override
    public String toString() {
        return "Sofa " + super.toString();
    }
}
