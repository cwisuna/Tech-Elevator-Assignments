package com.techelevator.auctions.controller;

import com.techelevator.auctions.dao.AuctionDao;
import com.techelevator.auctions.dao.MemoryAuctionDao;
import com.techelevator.auctions.model.Auction;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController

@RequestMapping("/auctions")

public class AuctionController {

    private AuctionDao dao;

    public AuctionController() {
        this.dao = new MemoryAuctionDao();
    }

   /* @RequestMapping (method = RequestMethod.GET)
    public List<Auction> list(){
        return dao.list();
    }
*/
    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Auction get(@PathVariable int id){
        return dao.get(id);
    }

    @RequestMapping (method = RequestMethod.POST)
    public Auction create(@RequestBody Auction auction){
        return dao.create(auction);
    }

    /*@RequestMapping (method = RequestMethod.GET)
    public List<Auction> list(@RequestParam (name = "title_like", defaultValue = "") String title ){

        if(!title.equals("")){
            return dao.searchByTitle(title);
        }
        return dao.list();
    }

     */

    @RequestMapping (method = RequestMethod.GET)
    public List<Auction> list(@RequestParam (name = "title_like", defaultValue = "") String title
            ,@RequestParam (name = "currentBid_lte", defaultValue = "0") double currentBid ){

        if(!title.equals("") && currentBid != 0){
            return dao.searchByTitleAndPrice(title, currentBid);
        }
        if(!title.equals("")){
            return dao.searchByTitle(title);
        }if(currentBid != 0){
            return dao.searchByPrice(currentBid);
        }
        return dao.list();
    }


}
