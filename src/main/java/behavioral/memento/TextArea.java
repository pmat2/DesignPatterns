package behavioral.memento;

public class TextArea {
    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public Memento takeSnapshot() {
        return new Memento(this.text);
    }

    public void restore(Memento memento) {
        this.text = memento != null ? memento.getSavedText() : null;
    }

    public static class Memento {
        private final String text;

        private Memento(String textToSave) {
            this.text = textToSave;
        }

        private String getSavedText() {
            return text;
        }
    }
}