package com.techelevator;

public class ReserveAuction extends Auction{

    private int reservedPrice;

     public ReserveAuction(String itemForSale, int reservedPrice ){
         super(itemForSale);
         this.reservedPrice = reservedPrice;
     }

    @Override
    public boolean placeBid(Bid offeredBid) {
       boolean isCurrentWinningBid = false;
       if (offeredBid.getBidAmount() >= this.reservedPrice){
           isCurrentWinningBid = super.placeBid(offeredBid);
       }
       return isCurrentWinningBid;
    }
}
