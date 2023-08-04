package com.careerit.iq;

public enum DayName {
    MON(1),
    TUE(2),
    WED(3),
    THU(4),
    FRI(5),
    SAT(6),
    SUN(7);
    private final int value;
    private DayName(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}