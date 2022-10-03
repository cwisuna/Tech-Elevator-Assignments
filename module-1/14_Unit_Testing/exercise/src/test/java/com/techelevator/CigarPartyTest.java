package com.techelevator;


import org.junit.Assert;
import org.junit.Test;

public class CigarPartyTest {


    @Test
    public void providedMinimumCigarsWeekday_ExpectSuccess(){
        //at least 40 cigars on weekday

        boolean isSuccessful = false;
        CigarParty party = new CigarParty();

        isSuccessful = party.haveParty(40, false);

        Assert.assertEquals(true, isSuccessful);


    }

    @Test
    public void providedBelowCigarsWeekend_ExpectFailure(){
        //below 40 cigars on weekend

        boolean isSuccessful = false;

        CigarParty party = new CigarParty();

        isSuccessful = party.haveParty(30, true);

        Assert.assertEquals(false, isSuccessful);


    }



}
