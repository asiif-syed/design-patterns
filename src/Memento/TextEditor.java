package Memento;

public class TextEditor {
    private String content;

    public void setContent(String content){
        this.content = content;
    }

    public String getContent(){
        System.out.println(this.content);
        return this.content;
    }

    public Memento saveContent(){
       return new Memento(this.content);
    }

    public void restoreContent(Memento memento){
        this.content = memento.getState();
    }
}

