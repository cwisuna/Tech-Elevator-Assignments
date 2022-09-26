package com.techelevator;

public class BuyOutAuction extends Auction {

    private int buyoutPrice;

    public int getBuyoutPrice(){
        return this.buyoutPrice;
    }

    public BuyOutAuction(String itemForSale, int buyoutPrice){
        super(itemForSale);
        this.buyoutPrice = buyoutPrice;
    }

    @Override
    public boolean placeBid(Bid offeredBid) {

        boolean isCurrentWinningBid = false;
        if (super.getHighBid().getBidAmount() < this.buyoutPrice){

//            if (offeredBid.getBidAmount() >= this.buyoutPrice){
//                offeredBid= new Bid(offeredBid.getBidder(), buyoutPrice);
//            }
            isCurrentWinningBid = super.placeBid(offeredBid);
        }
        return isCurrentWinningBid;
    }

    public boolean getPrivateMethod(){
       return super.privateMethod();
    }

    public int getWinningBid(){
        return this.buyoutPrice;
    }

}
