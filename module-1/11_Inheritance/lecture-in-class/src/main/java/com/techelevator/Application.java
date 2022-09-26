package com.techelevator;

public class Application {

    public static void main(String[] args) {

        // Create a new general auction
        System.out.println("Starting a general auction");
        System.out.println("-----------------");

        Auction generalAuction = new Auction("Tech Elevator t-shirt");


        Bid newBid = new Bid("Josh", 1);
        generalAuction.placeBid(newBid);

        generalAuction.placeBid(new Bid("Fonz", 23));
        generalAuction.placeBid(new Bid("Rick Astley", 13));
        //....
        //....
        // This might go on until the auction runs out of time or hits a max # of bids

        BuyOutAuction buyOutAuction = new BuyOutAuction("Tech Elevator Travel Mug", 55);
         buyOutAuction.placeBid(new Bid("Rick Astley", 28));
         buyOutAuction.placeBid(new Bid("Micheal Scott", 30));
//        System.out.printf("BuyOut Auction: number of bids %d \n", buyOutAuction.getNumberOfBids());
//        buyOutAuction.placeBid(new Bid("Dwight Shrute", 31));
//        System.out.printf("BuyOut Auction: number of bids %d \n", buyOutAuction.getNumberOfBids());
//        buyOutAuction.placeBid(new Bid("Micheal Scott", 275));
//        System.out.printf("BuyOut Auction: number of bids %d \n", buyOutAuction.getNumberOfBids());
//        buyOutAuction.placeBid(new Bid("Micheal Scott", 225));
//        System.out.printf("BuyOut Auction: number of bids %d \n", buyOutAuction.getNumberOfBids());
//        buyOutAuction.placeBid(new Bid("Micheal Scott", 215));
//        System.out.printf("BuyOut Auction: number of bids %d \n", buyOutAuction.getNumberOfBids());
//        buyOutAuction.placeBid(new Bid("Micheal Scott", 150));


        System.out.printf("BuyOut Auction: number of bids %d \n", buyOutAuction.getNumberOfBids());
        System.out.println("BuyOut Auction: high bid " + buyOutAuction.getHighBid().getBidAmount());


        System.out.println(buyOutAuction.getPrivateMethod());
        System.out.println(generalAuction.privateMethod());



        ReserveAuction reserveAuction = new ReserveAuction("Tech Elevator Hat", 80);

        reserveAuction.placeBid(new Bid ("Ted Mosby", 35));
        reserveAuction.placeBid(new Bid ("Marshall Erikson", 40));
        reserveAuction.placeBid(new Bid ("Barney Stinson", 80));
        reserveAuction.placeBid(new Bid ("Lily Erikson", 85));

        System.out.printf("reserveAuction Auction: number of bids %d \n", reserveAuction.getNumberOfBids());
        System.out.println("reserveAuction Auction: high bid " + reserveAuction.getHighBid().getBidAmount());


        System.out.println();
        System.out.println("============  3 Auctions =============");
        System.out.println();

        Auction generalAuction2 = new Auction("Tech Elevator t-shirt");
        Auction buyOutAuction2 = new BuyOutAuction("Tech Elevator Travel Mug", 55);
        Auction reserveAuction2 = new ReserveAuction("Tech Elevator Hat", 80);

        generalAuction2.placeBid(new Bid ("Barney Stinson", 80));
        buyOutAuction2.placeBid(new Bid ("Barney Stinson", 81));
        reserveAuction2.placeBid(new Bid ("Barney Stinson", 82));


        System.out.printf("generalAuction2 Auction: number of bids %d \n", generalAuction2.getNumberOfBids());
        System.out.println("generalAuction2 Auction: high bid " + generalAuction2.getHighBid().getBidAmount());

        System.out.printf("buyOutAuction2 Auction: number of bids %d \n", buyOutAuction2.getNumberOfBids());
        System.out.println("buyOutAuction2 Auction: high bid " + buyOutAuction2.getHighBid().getBidAmount());

        System.out.printf("reserveAuction2 Auction: number of bids %d \n", reserveAuction2.getNumberOfBids());
        System.out.println("reserveAuction2 Auction: high bid " + reserveAuction2.getHighBid().getBidAmount());

    }
}
