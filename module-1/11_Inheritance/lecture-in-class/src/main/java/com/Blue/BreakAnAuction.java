package com.Blue;

import com.techelevator.Auction;
import com.techelevator.BuyOutAuction;

public class BreakAnAuction {
    public static void main(String[] args) {
        System.out.println("Starting a general auction");
        System.out.println("-----------------");

        Auction generalAuction = new Auction("Tech Elevator t-shirt");
        BuyOutAuction buyOutAuction = new BuyOutAuction("Tech Elevator Travel Mug", 55);

        System.out.println(buyOutAuction.getPrivateMethod());
      //  System.out.println(generalAuction.privateMethod());

    }

}
