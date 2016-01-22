package com.ninegame.lee;

import java.util.List;

/**
 * Created by Administrator on 2016/1/18 018.
 */
public class Player {
    public void setWantExchange(boolean isWantExchange){
        this.isWantExchange = isWantExchange;
    }
    public Door getChoosedDoor() {
        return choosedDoor;
    }

    public void setChoosedDoor(Door choosedDoor) {
        this.choosedDoor = choosedDoor;
    }

    private Door choosedDoor;
    boolean isWantExchange;
    public void choose(List<Door> doors) {
        choosedDoor = Randomer.getRandomDoor(doors);
    }

    public boolean wantExchange() {
        return isWantExchange;
    }

    public void exchange(Door opendDoor,List<Door> doors){
        for (Door door : doors) {
            if (opendDoor != door && choosedDoor != door){
                choosedDoor = door;
                break;
            }
        }
    }
}
