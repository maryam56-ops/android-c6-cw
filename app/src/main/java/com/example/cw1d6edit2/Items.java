package com.example.cw1d6edit2;

public class Items {

    private String itemname;
    private int itemimage;
    private double itemprice;

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) { this.itemname = itemname; }

    public int getItemimage() { return itemimage; }

    public void setItemimage(int itemimage) { this.itemimage = itemimage; }

    public double getItemprice() { return itemprice; }

    public void setItemprice(double itemprice) { this.itemprice = itemprice; }

    public Items(String itemname, int itemimage, double itemprice) {
        this.itemname = itemname;
        this.itemimage = itemimage;
        this.itemprice = itemprice;


    }
}
