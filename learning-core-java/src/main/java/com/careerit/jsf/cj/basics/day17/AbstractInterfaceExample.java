package com.careerit.jsf.cj.basics.day17;

interface Instrument{
    void start();
    void play();
    void stop();
}
abstract class AbstractInstrument implements Instrument{

    @Override
    public void start() {
        System.out.println("You are playing "+this.getClass().getSimpleName());
    }

    @Override
    public void stop() {
        System.out.println(this.getClass().getSimpleName()+" is going to stop");
    }
}
class Piano extends AbstractInstrument implements Instrument{

    @Override
    public void play() {
        System.out.println("Piano makes pee peee pee sound");
    }


}
class Guitar extends AbstractInstrument implements Instrument{

    @Override
    public void play() {
        System.out.println("Guitar makes tinnn tinnn tinnn sound");
    }

}
class Flute extends AbstractInstrument implements Instrument{



    @Override
    public void play() {
        System.out.println("Flute makes feee fee fee sound");
    }

}

public class AbstractInterfaceExample {
}
