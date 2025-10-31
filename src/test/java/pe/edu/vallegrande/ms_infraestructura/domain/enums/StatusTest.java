package pe.edu.vallegrande.ms_infraestructura.domain.enums;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatusTest {

    @Test
    void testEnumValues() {
        assertEquals("ACTIVE", Status.ACTIVE.getValue());
        assertEquals("INACTIVE", Status.INACTIVE.getValue());
    }
}