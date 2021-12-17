public class Plates extends Dish {
    protected String form;

    public Plates(String color, int price, String form) {
        this.color = color;
        this.price = price;
        this.form = form;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    @Override
    public String usedFor() {
        return "Plates used for " + form;
    }

    @Override
    public String toString() {
        return "Cup " + form + " " + super.toString();
    }
}
