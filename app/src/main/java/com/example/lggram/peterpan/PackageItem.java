package com.example.lggram.peterpan;

public class PackageItem {
    String name;
    String info;
    int price;
    int resId;

    public PackageItem(String name, String info){
        this.name = name;
        this.info = info;
    }

    public PackageItem(String name, String info, int price, int resId){
        this.name = name;
        this.info = info;
        this.price = price;
        this.resId = resId;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public int getResId(){
        return price;
    }

    public void setResId(int resId){
        this.resId = resId;
    }

    public String getInfo(){
        return info;
    }

    public void setInfo(String info){
        this.info = info;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

}
