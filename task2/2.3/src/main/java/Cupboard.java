public class Cupboard extends Furniture {
    private boolean haveMirror;

    public Cupboard() {
        super("NONE", "White", 0, "NONE");
        this.haveMirror = false;
    }

    public Cupboard(String company, String color, int cost, String materialFrame, boolean haveMirror) {
        super(company, color, cost, materialFrame);
        this.haveMirror = haveMirror;
    }

    public void setHaveMirror(boolean haveMirror) {
        this.haveMirror = haveMirror;
    }

    public boolean isHaveMirror() {
        return haveMirror;
    }

    @Override
    public void Construct() {
        System.out.println("Сборка шкафа");
    }

    @Override
    public void Transfer() {
        System.out.println("Доставка шкафа");
    }

    @Override
    public void DeConstruct() {
        System.out.println("Разборка шкафа");
    }

    @Override
    public String toString() {
        return "Cupboard " + super.toString();
    }
}
