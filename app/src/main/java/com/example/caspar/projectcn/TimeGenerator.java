package com.example.caspar.projectcn;

/**
 * Created by Caspar on 13.10.2017.
 */

public class TimeGenerator {
    public int TimeGenerator(int num){
        int rnd;
        int temp;
        temp = Math.min(num,10);
        rnd = (int)(Math.random()*(Math.pow(2,temp)-1));
        return rnd;
    }

}
