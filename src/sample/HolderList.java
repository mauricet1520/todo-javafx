package sample;

import sample.Controller;
import sample.ToDoItem;

import java.util.ArrayList;

/**
 * Created by crci1 on 1/12/2017.
 */
public class HolderList {

    public ArrayList<ToDoItem> toDoItems;

    public ArrayList<ToDoItem> getToDoItems() {
        return toDoItems;
    }

    public void setToDoItems(ArrayList<ToDoItem> toDoItems) {
        this.toDoItems = toDoItems;
    }

   public HolderList(){

    }
}
