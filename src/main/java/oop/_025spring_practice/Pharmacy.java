package oop._025spring_practice;

import java.io.Serializable;
import java.time.LocalDate;

public class Pharmacy extends Shop implements Serializable {
    private String owner;
    private LocalDate openingDate;
    private boolean chain;
    private String locationType;
    private String TradeLicenseNumber;

    public Pharmacy(String name, int zipCode, float areaInSqFt, String owner, LocalDate openingDate, boolean chain, String locationType, String tradeLicenseNumber) {
        super(name, zipCode, areaInSqFt);
        this.owner = owner;
        this.openingDate = openingDate;
        this.chain = chain;
        this.locationType = locationType;
        TradeLicenseNumber = tradeLicenseNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public LocalDate getOpeningDate() {
        return openingDate;
    }

    public void setOpeningDate(LocalDate openingDate) {
        this.openingDate = openingDate;
    }

    public boolean isChain() {
        return chain;
    }

    public void setChain(boolean chain) {
        this.chain = chain;
    }

    public String getLocationType() {
        return locationType;
    }

    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    public String getTradeLicenseNumber() {
        return TradeLicenseNumber;
    }

    public void setTradeLicenseNumber(String tradeLicenseNumber) {
        TradeLicenseNumber = tradeLicenseNumber;
    }

    @Override
    public String toString() {
        return "Pharmacy{" +
                "owner='" + owner + '\'' +
                ", openingDate=" + openingDate +
                ", chain=" + chain +
                ", locationType='" + locationType + '\'' +
                ", TradeLicenseNumber='" + TradeLicenseNumber + '\'' +
                '}';
    }

    public void showLincenseFee(){
        if (getAreaInSqFt()>= 500) {
            System.out.println(getAreaInSqFt()*1000);
        } else {
            System.out.println(getAreaInSqFt()*500);
        }
    }
}
