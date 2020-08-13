package exercise.sink_a_ship;

import java.util.ArrayList;

public class Ship {
    private ArrayList<String> locationCells;
    private String name;

    public void setLocationCells(ArrayList<String> locationCells) {
        this.locationCells = locationCells;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String check(String shootCoordinates) {
        String result = "miss";
        int index = locationCells.indexOf(shootCoordinates);
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty())
                result = "kill";
            else result = "hit";
        }
        return result;
    }
}
