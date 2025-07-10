package Memento.After_Use;

public class TextEditor {
    private String content;

    public TextEditor() {
        this.content = "";
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public TextEditorState save(){
        return new TextEditorState(content);
    }

    public void restore(TextEditorState state){
        this.content = state.getContent();
    }
}
