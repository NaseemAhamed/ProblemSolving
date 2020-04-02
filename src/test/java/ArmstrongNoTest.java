import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Unit test cases for ArmstrongNo.class")
public class ArmstrongNoTest {

    @Test
    @DisplayName("The given number is Armstrong")
    @Description("The given number is Armstrong")
    @Severity(SeverityLevel.CRITICAL)
    public void testFindArmstrongNo_ShouldReturnTrue() {
        assertTrue(ArmstrongNo.findArmstrong(153));
        assertTrue(ArmstrongNo.findArmstrong(0));
    }


    @Test
    @DisplayName("The given number is not Armstrong")
    @Description("he given number is not Armstrong")
    @Severity(SeverityLevel.CRITICAL)
    public void testFindArmstrongNo_ShouldReturnFalse() {
        assertFalse(ArmstrongNo.findArmstrong(1001));
    }



}
