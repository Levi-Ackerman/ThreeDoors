package com.ninegame.lee;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/1/18 018.
 */
public class Game {
    List<Door> doors;
    Car car;
    Player player;
    Hoster hoster;
    public Game(){
        car = new Car();
        doors =new ArrayList<Door>();
        hoster = new Hoster();
        player = new Player();
    }
    public void ready(boolean wantExchange){
        doors.clear();
        for (int i = 0; i < 3; i++) {
            doors.add(new Door());
        }
        player.setWantExchange(wantExchange);
    }
    public void play(){
        car.putIn(doors);
        player.choose(doors);
        hoster.open(doors,car,player);
        if(player.wantExchange()){
            player.exchange(hoster.getOpenedDoor(),doors);
        }
    }
    public boolean checkResult(){
        return car.getPuttedDoor() == player.getChoosedDoor();
    }
    public static void main(String[] args){
        Game game = new Game();
        final int count = 1000;
        int exchangeSucc = 0,unexchangeSucc = 0;
        for (int i = 0; i < count; i++) {
            game.ready(true);
            game.play();
            if(game.checkResult())
                exchangeSucc++;

            game.ready(false);
            game.play();
            if(game.checkResult())
                unexchangeSucc++;
        }
        System.out.println("交换成功率："+1.0*exchangeSucc/count);
        System.out.println("不交换成功率："+1.0*unexchangeSucc/count);
    }
}
