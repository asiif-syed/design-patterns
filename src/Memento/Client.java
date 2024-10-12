package Memento;

public class Client {
    public static void main(String[] args){
        TextEditor editor = new TextEditor();
        CareTaker careTaker = new CareTaker();
//        Version 1
        editor.setContent("Hello There!");
        careTaker.saveState(editor);
        editor.getContent();

//        Version 2
        editor.setContent("How are you doing today!");
        careTaker.saveState(editor);
        editor.getContent();

//        Version 3
        editor.setContent("Are you available for a coffee this weekend?");
        editor.getContent();
//       Undo 1 -> Should go back to version 2
        careTaker.undo(editor);
        editor.getContent();

//      Undo 2 -> Should go back to version 1
        careTaker.undo(editor);
        editor.getContent();
    }
}
