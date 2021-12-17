import java.util.ArrayList;
import java.util.List;

public class FurnitureShop {
    private List listOfFurniture = new ArrayList<Furniture>();

    public void AddToListFurniture(Furniture furniture) {
        listOfFurniture.add(furniture);
    }

    public void ResaleFurniture(Furniture furniture) {
        listOfFurniture.remove(furniture);
    }

    public void PresentFurniture() {
        for (Object furniture : listOfFurniture) {
            System.out.println(furniture);
        }
    }

    public void InfoFurniture(Furniture furniture) {
        System.out.println(furniture);
    }
}
