package com.careerit.jsf.cj.basics.interviewquestions;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

sealed  class Instrument permits Piano,Flute,Guitar{
    public  void play(){}
}
final class Piano extends Instrument{

    @Override
    public void play() {
        System.out.println("Piano is playing");
    }
}
final class Flute extends Instrument{

    @Override
    public void play() {
        System.out.println("Flute is playing");
    }
}
final class Guitar extends Instrument{

    @Override
    public void play() {
        System.out.println("Guitar is playing");
    }
    public void play(String song){
        System.out.println("Guitar is playing "+song);
    }
}

sealed interface Game permits Car, Bikes, Ships, Cricket {
    void play();
}
record  Car() implements  Game{

        @Override
        public void play() {

        }
}
record Bikes() implements  Game{

        @Override
        public void play() {

        }
}

record Ships() implements  Game{

        @Override
        public void play() {

        }
}

final class Cricket implements Game{

    @Override
    public void play() {

    }
}
public class SealedClassExample {

    public static void main(String[] args) {
        Instrument instrument = getInstrument();
        instrument.play();
        if(instrument instanceof Guitar guitar) {
           guitar.play("Shape of you");
        }
    }

    private static Instrument getInstrument() {
        List<Instrument> list = List.of(new Piano(),new Flute(),new Guitar());
        return list.get(ThreadLocalRandom.current().nextInt(0, list.size()));
    }
}
