package zadanko8;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        List<Cable> cables = new ArrayList<>();
        Cable cable1 = new Cable("USB", 10);
        Cable cable2 = new Cable("USB-C", 20);
        Cable cable3 = new Cable("HDMI", 30);
        Cable cable4 = new Cable("SVGA", 40);
        Cable cable5 = new Cable("JACK", 50);

        cables.add(cable1);
        cables.add(cable2);
        cables.add(cable3);
        cables.add(cable4);
        cables.add(cable5);

        for (Cable cable : cables) {
            cable.print();

        }

    }
}
