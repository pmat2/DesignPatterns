package behavioral.memento;

import java.util.Deque;
import java.util.LinkedList;

import behavioral.memento.TextArea.*;

public class Editor {
    private final Deque<Memento> stateHistory;
    private final TextArea textArea;

    public Editor() {
        stateHistory = new LinkedList<>();
        textArea = new TextArea();
    }

    public void write(String text) {
        textArea.setText(text);
        stateHistory.add(textArea.takeSnapshot());
    }

    public void undo() {
        if (stateHistory.isEmpty()) {
            return;
        }
        textArea.restore(stateHistory.pop());
    }
}
