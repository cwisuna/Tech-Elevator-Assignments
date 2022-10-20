package com.techelevator.dao;

import com.techelevator.model.Park;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.List;

public class JdbcParkDaoTests extends BaseDaoTests {

    private static final Park PARK_1 =
            new Park(1, "Park 1", LocalDate.parse("1800-01-02"), 100, true);
    private static final Park PARK_2 =
            new Park(2, "Park 2", LocalDate.parse("1900-12-31"), 200, false);
    private static final Park PARK_3 =
            new Park(3, "Park 3", LocalDate.parse("2000-06-15"), 300, false);

    private JdbcParkDao sut;
    private Park testPark;

    @Before
    public void setup() {
        sut = new JdbcParkDao(dataSource);
        testPark = new Park(0,"Test Park", LocalDate.now(),900, true );
    }

    @Test
    public void getPark_returns_correct_park_for_id() {
        Park park = sut.getPark(1);
        assertParksMatch(PARK_1, park);

        park = sut.getPark(2);
        assertParksMatch(PARK_2, park);
    }

    @Test
    public void getPark_returns_null_when_id_not_found() {
        Park park = sut.getPark(99);
        Assert.assertNull(park);
    }

    @Test
    public void getParksByState_returns_all_parks_for_state() {
        List<Park> parks = sut.getParksByState("AA");

        Assert.assertEquals(2, parks.size());
        assertParksMatch(PARK_1, parks.get(0));
        assertParksMatch(PARK_3, parks.get(1));
    }


    @Test
    public void getParksByState_returns_empty_list_for_abbreviation_not_in_db() {
        List<Park> parks = sut.getParksByState("XX");
        Assert.assertEquals(0, parks.size());
    }

    @Test
    public void createPark_returns_park_with_id_and_expected_values() {
       Park createdPark = sut.createPark(testPark);

        Integer newId = createdPark.getParkId();
        Assert.assertTrue(newId > 0);

        testPark.setParkId(newId);
        assertParksMatch(testPark, createdPark);
    }

    @Test
    public void created_park_has_expected_values_when_retrieved() {
        Park createdPark = sut.createPark(testPark);

        Integer newId = createdPark.getParkId();
        Park retrievedPark = sut.getPark(newId);

        assertParksMatch(createdPark, retrievedPark);
    }

    @Test
    public void updated_park_has_expected_values_when_retrieved() {
        Park expectedValue = sut.getPark(1);

        expectedValue.setParkName("Update Expected Value");
        expectedValue.setHasCamping(true);
        expectedValue.setArea(3.14);
        expectedValue.setDateEstablished(LocalDate.now());

        sut.updatePark(expectedValue);

        Park actualValue = sut.getPark(expectedValue.getParkId());
        assertParksMatch(expectedValue, actualValue);
    }

    @Test
    public void deleted_park_cant_be_retrieved() {
        List<Park> originalParks = sut.getParksByState("AA");
        sut.deletePark(1);

        Park deletedPark = sut.getPark(1);
        Assert.assertNull(deletedPark);

        List<Park> parks = sut.getParksByState("AA");
        Assert.assertEquals(originalParks.size() - 1, parks.size());

        for(Park item: parks){
            if (item.getParkId() == 1){
                Assert.fail();
            }
        }
    }

    @Test
    public void park_added_to_state_is_in_list_of_parks_by_state() {
        sut.addParkToState(1, "CC");

        List<Park> parks = sut.getParksByState("CC");


        boolean found = isParkFound(parks,1);

        Assert.assertEquals(true, found);

    }

    @Test
    public void park_removed_from_state_is_not_in_list_of_parks_by_state() {

        sut.removeParkFromState(1, "AA");
        List<Park> parks = sut.getParksByState("AA");

        boolean found = isParkFound(parks, 1);

        Assert.assertEquals(false, found);
    }

    private boolean isParkFound(List<Park> parks, int id) {
        boolean found = false;
        for (Park item : parks) {
            if (item.getParkId() == id) {
                return true;
            }
        }
        return found;
    }

    private void assertParksMatch(Park expected, Park actual) {
        Assert.assertEquals(expected.getParkId(), actual.getParkId());
        Assert.assertEquals(expected.getParkName(), actual.getParkName());
        Assert.assertEquals(expected.getDateEstablished(), actual.getDateEstablished());
        Assert.assertEquals(expected.getArea(), actual.getArea(), 0.1);
        Assert.assertEquals(expected.getHasCamping(), actual.getHasCamping());
    }

}
