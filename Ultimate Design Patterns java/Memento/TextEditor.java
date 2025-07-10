package Memento;

import java.util.Stack;

public class TextEditor {
    private String content;
    private final Stack<String> prevStates;
    private final Stack<String> nextStates;

    public TextEditor() {
        this.content = "";
        this.prevStates = new Stack<>();
        this.nextStates = new Stack<>();

    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void save(){
        prevStates.push(content);
        nextStates.clear();
    }

    public String undo(){
        if(!prevStates.isEmpty()){
            nextStates.push(content);
            content = prevStates.pop();
            return content;
        }
        return null;
    }

    public String redo(){
        if(!nextStates.isEmpty()){
            prevStates.push(content);
            content = nextStates.pop();
            return content;
        }
        return null;
    }
}
