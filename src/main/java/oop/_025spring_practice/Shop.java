package oop._025spring_practice;

import java.io.Serializable;

public class Shop implements Serializable {
    final private String name;
    final private int zipCode;
    private float areaInSqFt;

    public Shop(String name, int zipCode, float areaInSqFt) {
        this.name = name;
        this.zipCode = zipCode;
        this.areaInSqFt = areaInSqFt;
    }

    public String getName() {
        return name;
    }


    public int getZipCode() {
        return zipCode;
    }


    public float getAreaInSqFt() {
        return areaInSqFt;
    }

    public void setAreaInSqFt(float areaInSqFt) {
        this.areaInSqFt = areaInSqFt;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", zipCode=" + zipCode +
                ", areaInSqFt=" + areaInSqFt +
                '}';
    }
}
