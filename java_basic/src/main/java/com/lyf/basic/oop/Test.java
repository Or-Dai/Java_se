package com.lyf.basic.oop;

import javax.sound.midi.Instrument;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: LiangYiFeng
 * @Description: 多态
 * @Date: Create in 2022/9/30 9:20
 * @Modified By:
 */

class Music {
    public static void main(String[] args) {
        List<Instrument_> instruments = new ArrayList<>();
        instruments.add(new Wind());
        instruments.add(new Percussion());
        for (Instrument_ instrument : instruments) {
            System.out.println(instrument);
        }
    }
}

class Instrument_ {
    public void play() {
        System.out.println("Instrument is playing...");
    }
}

class Wind extends Instrument_ {

    @Override
    public void play() {
        System.out.println("Wind is playing...");
    }
}

class Percussion extends Instrument_ {
    @Override
    public void play() {
        System.out.println("Percussion is playing...");
    }
}
