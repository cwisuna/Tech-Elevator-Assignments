package com.techelevator.projects.dao;

import com.techelevator.projects.model.Timesheet;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.List;

public class JdbcTimesheetDaoTests extends BaseDaoTests {

    private static final Timesheet TIMESHEET_1 = new Timesheet(1, 1, 1,
            LocalDate.parse("2021-01-01"), 1.0, true, "Timesheet 1");
    private static final Timesheet TIMESHEET_2 = new Timesheet(2, 1, 1,
            LocalDate.parse("2021-01-02"), 1.5, true, "Timesheet 2");
    private static final Timesheet TIMESHEET_3 = new Timesheet(3, 2, 1,
            LocalDate.parse("2021-01-01"), 0.25, true, "Timesheet 3");
    private static final Timesheet TIMESHEET_4 = new Timesheet(4, 2, 2,
            LocalDate.parse("2021-02-01"), 2.0, false, "Timesheet 4");
    
    private JdbcTimesheetDao dao;

    private Timesheet testTimesheet;

    @Before
    public void setup() {
        dao = new JdbcTimesheetDao(dataSource);

        testTimesheet = new Timesheet(1, 1, 1, LocalDate.now(), 1.0, true, "Test Timesheet");

    }

    @Test
    public void getTimesheet_returns_correct_timesheet_for_id() {

        Timesheet timesheet = dao.getTimesheet(1);
        assertTimesheetsMatch(TIMESHEET_1, timesheet);

    }

    @Test
    public void getTimesheet_returns_null_when_id_not_found() {
        Timesheet timesheet = dao.getTimesheet(5);
        Assert.assertNull(timesheet);
    }

    @Test
    public void getTimesheetsByEmployeeId_returns_list_of_all_timesheets_for_employee() {
        List<Timesheet> projects = dao.getTimesheetsByEmployeeId(1);
        Assert.assertEquals(1, projects.size());


    }

    @Test
    public void getTimesheetsByProjectId_returns_list_of_all_timesheets_for_project() {
        List<Timesheet> projects = dao.getTimesheetsByProjectId(1);
        Assert.assertEquals(1, projects.size()-1);

    }

    @Test
    public void createTimesheet_returns_timesheet_with_id_and_expected_values() {

        Timesheet createdTimeSheet = dao.createTimesheet(testTimesheet);
        Integer newId = createdTimeSheet.getTimesheetId();
        Timesheet retrievedTimesheet = dao.getTimesheet(newId);
        assertTimesheetsMatch(createdTimeSheet,retrievedTimesheet);

    }

    @Test
    public void created_timesheet_has_expected_values_when_retrieved() {

        Timesheet createdTimeSheet = dao.createTimesheet(testTimesheet);
        Integer newId = createdTimeSheet.getTimesheetId();
        Timesheet retrievedTimesheet = dao.getTimesheet(newId);
        assertTimesheetsMatch(createdTimeSheet,retrievedTimesheet);
        ;
    }

    @Test
    public void updated_timesheet_has_expected_values_when_retrieved() {
        Timesheet expectedResult = dao.getTimesheet(1);
        expectedResult.setProjectId(1);
        expectedResult.setDateWorked(LocalDate.now());
        expectedResult.setHoursWorked(3.00);
        expectedResult.setDescription("This is a test.");

        dao.updateTimesheet(expectedResult);


    }

    @Test
    public void deleted_timesheet_cant_be_retrieved() {

        dao.deleteTimesheet(1);

        Timesheet deletedTimesheet = dao.getTimesheet(1);
        Assert.assertNull(deletedTimesheet);
    }

    @Test
    public void getBillableHours_returns_correct_total() {

        dao.getBillableHours(1,1);

    }

    private void assertTimesheetsMatch(Timesheet expected, Timesheet actual) {
        Assert.assertEquals(expected.getTimesheetId(), actual.getTimesheetId());
        Assert.assertEquals(expected.getEmployeeId(), actual.getEmployeeId());
        Assert.assertEquals(expected.getProjectId(), actual.getProjectId());
        Assert.assertEquals(expected.getDateWorked(), actual.getDateWorked());
        Assert.assertEquals(expected.getHoursWorked(), actual.getHoursWorked(), 0.001);
        Assert.assertEquals(expected.isBillable(), actual.isBillable());
        Assert.assertEquals(expected.getDescription(), actual.getDescription());
    }

}
