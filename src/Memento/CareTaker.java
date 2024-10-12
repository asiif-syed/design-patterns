package Memento;

import java.util.Stack;

public class CareTaker {
    private Stack<Memento> history;

    public CareTaker(){
        this.history = new Stack<Memento>();
    }

    public void saveState(TextEditor editor){
       Memento memento = editor.saveContent();
       history.add(memento);
    }

    public void undo(TextEditor editor){
        if(!history.isEmpty()){
            Memento memento = history.pop();
            editor.restoreContent(memento);
        }
    }
}
