package edu.scut.lee;

import java.util.List;

/**
 * Created by Administrator on 2016/1/18 018.
 */
public class Car {
    public Door getPuttedDoor() {
        return puttedDoor;
    }

    public void setPuttedDoor(Door puttedDoor) {
        this.puttedDoor = puttedDoor;
    }

    private Door puttedDoor;

    public void putIn(List<Door> doors) {
        puttedDoor = Randomer.getRandomDoor(doors);
    }
}
