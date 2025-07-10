package Memento.After_Use;

import java.util.Stack;

public class History {
    private Stack<TextEditorState> prevStates;
//    private Stack<TextEditor> nextStates;

    public History() {
        this.prevStates = new Stack<>();
    }

    public void saveHistoryState(TextEditorState textEditorState) {
        prevStates.push(textEditorState);
    }

    public TextEditorState undo() {
        if (!prevStates.empty()) {
            return prevStates.pop();
        }
        return null;
    }

}
