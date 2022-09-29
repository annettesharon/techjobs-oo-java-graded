package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {

    private int id;
    private static int nextId = 1;
    private String value;

    // sets JobField id
    public JobField() {
        id = nextId;
        nextId++;
    }

    // initializes JobField data
    public JobField(String value) {
        this();
        this.value = value;
    }


    @Override
    public String toString() {
        return value;
    }


    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // Getters and Setters:

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
