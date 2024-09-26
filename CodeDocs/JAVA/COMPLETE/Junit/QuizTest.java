import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuizTest {

    private Quiz quiz;

    @BeforeEach
    public void setUp() {
        quiz = new Quiz();
    }

    @Test
    public void testQuizTitleValidation_ValidTitle() {
        String validTitle = "Java Basics Quiz";
        quiz.setTitle(validTitle);
        assertEquals(validTitle, quiz.getTitle());
    }

    @Test
    public void testQuizTitleValidation_EmptyTitle() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            quiz.setTitle("");
        });
        assertEquals("Quiz title cannot be empty", exception.getMessage());
    }

    @Test
    public void testQuizTitleValidation_TooLongTitle() {
        String longTitle = "This title is way too long and should exceed the maximum length allowed for a quiz title which is set to be 100 characters.";
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            quiz.setTitle(longTitle);
        });
        assertEquals("Quiz title cannot exceed 100 characters", exception.getMessage());
    }
}
