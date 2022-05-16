import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person p;

    @BeforeEach
    void setUp() {
        p = new Person();
    }

    @Test
    void setEmail() {
        p.setEmail("holadiego");
        assertEquals("", p.getEmail());

        p.setEmail("afhshyfd@hotmail.com");
        assertEquals("afhshyfd@hotmail.com", p.getEmail());

        p.setEmail("");
        assertEquals("", p.getEmail());

        p.setEmail(null);
        assertEquals("", p.getEmail());

        p.setEmail("..@.com");
        assertEquals("", p.getEmail());
    }

    @Test
    void setIdCard() {

    }
}