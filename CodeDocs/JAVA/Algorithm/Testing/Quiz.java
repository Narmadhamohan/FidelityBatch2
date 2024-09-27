public class Quiz {
    private String title;

    public void setTitle(String title) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Quiz title cannot be empty");
        }
        if (title.length() > 100) {
            throw new IllegalArgumentException("Quiz title cannot exceed 100 characters");
        }
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
