package jfacerefactored.savers;

import java.util.ArrayList;

import jfacerefactored.model.Entity;


public interface Savable {
    boolean saveToFile(ArrayList<Entity> unsavedRecords, String fileName);

    ArrayList<Entity> readFromFile(String fileName);
}
