

public class TestFurniture {
    public static void main (String[] args) {
        Cupboard cupboard = new Cupboard();
        Sofa sofa = new Sofa();
        FurnitureShop furnitureShop = new FurnitureShop();
        sofa.setHavePillows(true);
        sofa.setCompany("CompanySofa");
        cupboard.setHaveMirror(true);
        cupboard.setCompany("CompanyCup");
        sofa.Construct();
        furnitureShop.AddToListFurniture(sofa);
        furnitureShop.AddToListFurniture(cupboard);
        furnitureShop.PresentFurniture();
        sofa.Transfer();
    }
}