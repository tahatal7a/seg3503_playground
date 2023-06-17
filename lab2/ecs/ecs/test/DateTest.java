import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;

import org.junit.jupiter.api.Test;

class DateTest {

  @Test
  void nextDate_sample() {
    Date d = new Date(2020,5,3);
    assertEquals(new Date(2020,5,4), d.nextDate());
  }


  @Test
  void test1(){
    Date d= new Date(1700,6,20);
    assertEquals(new Date(1700,6,20), d.nextDate());
  }

  @Test
  void test16(){
    Date d= new Date(1500,2,31);
    assertThrows(IllegalArgumentException.class,()->(
      new Date(1500,2,31),
       d.nextDate()
    ),"days must less than 28 for Feb on a non leap year");
  }
  @Test
void test17() {
    Date d = new Date(1500, 2, 31);
    assertThrows(IllegalArgumentException.class, () -> (
        d.nextDate();
    ), "Days must be less than 28 for February on a non leap year");
}
@Test
void test18() {
    Date d = new Date(-1, 10, 20);
    assertThrows(IllegalArgumentException.class, () -> (
        d.nextDate();
    ), "year must be greater or equal to 0.");
}
@Test
void test19() {
    Date d = new Date(1458, 15, 12);
    assertThrows(IllegalArgumentException.class, () -> (
        d.nextDate();
    ), "month must be between 1 and 12.");
}
@Test
void test20() {
    Date d = new Date(1975, 6, -50);
    assertThrows(IllegalArgumentException.class, () -> (
        d.nextDate();
    ), "day must be greater or equal to 1.");
}
}