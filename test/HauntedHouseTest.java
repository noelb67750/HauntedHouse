import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
class HauntedHouseTest {

 static HauntedHouse house;

 @BeforeEach
 void setUp() {
   house = new HauntedHouse();
   }

    @Test
    void isGhostPresentTest() {
    boolean presence = house.isGhostPresent();
     assertTrue(presence);
    }

    @Test
    void scareAwayGhostTest() {
     boolean presence = house.isGhostPresent();
     assertTrue(presence);
     house.scareAwayGhost();
     presence = house.isGhostPresent();
     assertFalse(presence);
    }

 @Test
 void scareAwayNoGhostTest() {
  //scareAwayGhostTest();
  house.scareAwayGhost();
  boolean presence = house.isGhostPresent();
  assertFalse(presence);
 }

    @Test
    void refillCandyBowlTestpos() {
    assertEquals(10,house.getCandyCount());
    house.refillCandyBowl(10);
    assertEquals(20, house.getCandyCount());
    }

 @Test
 void refillCandyBowlTestNeg() {
  assertEquals(10,house.getCandyCount());
  house.refillCandyBowl(-10);
  assertEquals(10, house.getCandyCount());
 }

    @Test
    void trickOrTreatTest() {
        assertEquals(10,house.getCandyCount());

        house.trickOrTreat(3);

        assertEquals(7, house.getCandyCount());

    }
    void trickOrTreatTestNeg() {
        assertEquals(10,house.getCandyCount());

        house.trickOrTreat(3);

        assertEquals(7, house.getCandyCount());

    }
    @Test
    void tooManyPeopleTest()
    {
        house.trickOrTreat(15);

        assertEquals(10,house.getCandyCount());
    }

    @Test
    void getCandyCountTest() {
    }

    @Test
    void spookySoundTest() {
        assertEquals("Boo!", house.spookySound());
    }

    @Test
    void runningLowRefillsAtZeroTest() {
        house.trickOrTreat(10);
        house.runningLow();
        assertEquals(10, house.getCandyCount());
    }

    @Test
    void runningLowDoesNothingWhenNotEmptyTest() {
        house.runningLow();
        assertEquals(10, house.getCandyCount());
    }
    @Test
    void hauntTest()
    {
        house.scareAwayGhost();;
        assertFalse(house.isGhostPresent());

        house.haunt();
        assertTrue(house.isGhostPresent());
    }
}