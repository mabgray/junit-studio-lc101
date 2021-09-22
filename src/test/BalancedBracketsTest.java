package test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import main.BalancedBrackets;
public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void onlyBalanceBracketsReturnsTrue01() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }
    @Test
    public void onlyBalanceBracketsReturnsTrue02() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }
    @Test
    public void onlyBalanceBracketsReturnsTrue03() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }
    @Test
    public void onlyBalanceBracketsReturnsTrue04() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    public void onlyBalanceBracketsReturnsFalse01() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }
    @Test
    public void onlyBalanceBracketsReturnsFalse02() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }
    @Test
    public void onlyBalanceBracketsReturnsFalse03() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void onlyBalanceBracketsReturnsFalse04() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }


}
