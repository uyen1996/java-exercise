package com.javafortesters.example;

public class HocSinh implements People{
    private String ID;

    private int classLevel;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getClassLevel() {
        return classLevel;
    }

    public void setClassLevel(int classLevel) {
        this.classLevel = classLevel;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setNameName() {

    }

}
