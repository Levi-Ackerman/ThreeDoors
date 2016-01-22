package edu.scut.lee;

import java.util.List;
import java.util.Random;

/**
 * Created by Administrator on 2016/1/18 018.
 */
public class Randomer {
    public static Random random = new Random(System.currentTimeMillis());
    public static Door getRandomDoor(final List<Door> doors){
        int index = random.nextInt(doors.size());
        return doors.get(index);
    }
}
