package sample;

import java.io.Serializable;

/**
 * Created by crci1 on 1/12/2017.
 */
public class ToDoItem {
    String text;
    boolean isDone;

    public ToDoItem() {

    }

    public ToDoItem(String text) {
        this.text = text;
        this.isDone = false;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    @Override
    public String toString() {
        if (isDone) {
            return text + " (done)";
        } else {
            return text;
        }
        // A one-line version of the logic above:
        // return text + (isDone ? " (done)" : "");
    }
}

