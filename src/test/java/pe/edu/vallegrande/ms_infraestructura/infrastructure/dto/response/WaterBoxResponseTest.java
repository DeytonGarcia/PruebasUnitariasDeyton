package pe.edu.vallegrande.ms_infraestructura.infrastructure.dto.response;

import org.junit.jupiter.api.Test;
import pe.edu.vallegrande.ms_infraestructura.domain.enums.BoxType;
import pe.edu.vallegrande.ms_infraestructura.domain.enums.Status;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class WaterBoxResponseTest {

    @Test
    void testWaterBoxResponseBuilderAndGetters() {
        Long id = 1L;
        String organizationId = "ORG001";
        String boxCode = "WB001";
        BoxType boxType = BoxType.CAÑO;
        LocalDate installationDate = LocalDate.now();
        Long currentAssignmentId = 101L;
        Status status = Status.ACTIVE;
        LocalDateTime createdAt = LocalDateTime.now();

        WaterBoxResponse waterBoxResponse = WaterBoxResponse.builder()
                .id(id)
                .organizationId(organizationId)
                .boxCode(boxCode)
                .boxType(boxType)
                .installationDate(installationDate)
                .currentAssignmentId(currentAssignmentId)
                .status(status)
                .createdAt(createdAt)
                .build();

        assertNotNull(waterBoxResponse);
        assertEquals(id, waterBoxResponse.getId());
        assertEquals(organizationId, waterBoxResponse.getOrganizationId());
        assertEquals(boxCode, waterBoxResponse.getBoxCode());
        assertEquals(boxType, waterBoxResponse.getBoxType());
        assertEquals(installationDate, waterBoxResponse.getInstallationDate());
        assertEquals(currentAssignmentId, waterBoxResponse.getCurrentAssignmentId());
        assertEquals(status, waterBoxResponse.getStatus());
        assertEquals(createdAt, waterBoxResponse.getCreatedAt());
    }
}