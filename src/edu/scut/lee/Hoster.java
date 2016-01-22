package edu.scut.lee;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/1/18 018.
 */
public class Hoster {
    public Door getOpenedDoor() {
        return openedDoor;
    }

    public void setOpenedDoor(Door openedDoor) {
        this.openedDoor = openedDoor;
    }

    Door openedDoor;

    public void open(List<Door> doors, Car car, Player player) {
        if (player.getChoosedDoor() == car.getPuttedDoor()){
            List<Door> temp = new ArrayList<Door>();
            for (Door door : doors) {
                if (door != player.getChoosedDoor()) {
                    temp.add(door);
                }
            }
            openedDoor = Randomer.getRandomDoor(temp);
        }else{
            for (Door door : doors) {
                if (door !=car.getPuttedDoor() && door != player.getChoosedDoor()){
                    openedDoor = door;
                    break;
                }
            }
        }
    }
}
