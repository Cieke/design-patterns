package com.realdolmen.builder;

public class Wheel {
    private int size;
    private boolean aluminium;

    public Wheel(int size, boolean aluminium) {
        this.size = size;
        this.aluminium = aluminium;
    }

    public int getSize() {
        return size;
    }

    public boolean isAluminium() {
        return aluminium;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "size=" + size +
                ", aluminium=" + aluminium +
                '}';
    }
}
