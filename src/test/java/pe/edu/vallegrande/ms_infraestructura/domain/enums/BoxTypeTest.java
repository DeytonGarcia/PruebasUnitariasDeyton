package pe.edu.vallegrande.ms_infraestructura.domain.enums;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoxTypeTest {

    @Test
    void testEnumValues() {
        assertEquals("CAÑO", BoxType.CAÑO.getValue());
        assertEquals("BOMBA", BoxType.BOMBA.getValue());
        assertEquals("OTRO", BoxType.OTRO.getValue());
    }
}