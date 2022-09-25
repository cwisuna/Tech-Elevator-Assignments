package com.techelevator;

import jdk.swing.interop.SwingInterOpUtils;
import org.w3c.dom.ls.LSOutput;

public class Exercises {

	public static void main(String[] args) {

        /* Exercise 1
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */
		// ### EXAMPLE:
		int birdsOnABranch = 4;
		int birdsThatFlyAway = 1;
		int birdsRemaining = birdsOnABranch - birdsThatFlyAway;
		System.out.println(birdsRemaining);
        /* Exercise 2
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */
		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;
		System.out.println(numberOfExtraBirds);
        /* Exercise 3
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */


		int racoonsInWoods = 3;
		int racoonsGoHome = 2;
		int racoonsLeft = racoonsInWoods - racoonsGoHome;
		System.out.println(racoonsLeft);




        /* Exercise 4
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
		int flowers = 5;
		int bees = 3;
		int lessBeesThanFlowers = flowers-bees;

		System.out.println(lessBeesThanFlowers);

        /* Exercise 5
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */

		int lonley = 1;
		int another = 1;
		int totalPigeons = lonley + another;
		System.out.println(totalPigeons);


        /* Exercise 6
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */

		int owlsOnFence = 3;
		int moreOwls = 2;
		int totalOwls = owlsOnFence + moreOwls;
		System.out.println(totalOwls);
        /* Exercise 7
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
		int beaversAtHome = 2;
		int beaversSwim = 1;
		int beaversLeft = beaversAtHome - beaversSwim;
		System.out.println(beaversLeft);
        /* Exercise 8
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
		int toucansSitting = 2;
		int addedToucans = 1;
		int totalToucans = toucansSitting + addedToucans;
		System.out.println(totalToucans);
        /* Exercise 9
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
		int squirrelsInTree = 4;
		int amountofNuts = 2;
		int moreSquirrelsThanNuts = squirrelsInTree - amountofNuts;
		System.out.println(moreSquirrelsThanNuts);
        /* Exercise 10
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */

		double quarter = .25;
		double dime = .10;
		double nickel = .05;
		double total = quarter + dime + (nickel * 2);

		System.out.println(total);


        /* Exercise 11
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
		int brier = 18;
		int macadams = 20;
		int flannery = 17;
		int totalMuffins = brier + macadams + flannery;
		System.out.println(totalMuffins);
        /* Exercise 12
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
		double yoyoCost = 0.24d;
		double whistleCost = 0.14d;
		double totalToyCost = yoyoCost + whistleCost;
		System.out.println(totalToyCost);
        /* Exercise 13
        13. Mrs. Hilt made 5 Rice Krispies Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
		int largeMellows = 8;
		int miniMellows = 10;
		int totalMellows = largeMellows + miniMellows;
		System.out.println(totalMellows);
        /* Exercise 14
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
		int hiltInches = 29;
		int brecknockInches = 17;
		int hiltMoreInches = hiltInches - brecknockInches;
		System.out.println(hiltMoreInches);
        /* Exercise 15
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
		double startingMoney = 10.00;
		double toyTruck = 3.00;
		double pencilCase = 2.00;
		double remaindingMoney = startingMoney - toyTruck - pencilCase;
		System.out.println(remaindingMoney);
        /* Exercise 16
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
		int startingMarbles = 16;
		int lostMarbles = 7;
		int remaindingMarbles = startingMarbles-lostMarbles;
		System.out.println(remaindingMarbles);
        /* Exercise 17
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
		int startingSeashells = 19;
		int desiredAmountOfSeashells = 25;
		int requiredSeashells = desiredAmountOfSeashells - startingSeashells;
		System.out.println(requiredSeashells);
        /* Exercise 18
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
		int totalBalloons = 17;
		int redBalloons = 8;
		int greenBalloons = totalBalloons-redBalloons;
		System.out.println(greenBalloons);
        /* Exercise 19
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
		int booksOnShelf = 38;
		int addBooksonShelf = 10;
		int totalBooks = booksOnShelf + addBooksonShelf;
		System.out.println(totalBooks);
        /* Exercise 20
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
		int totalBeeLegs = 6 * 8;
		System.out.println(totalBeeLegs);
        /* Exercise 21
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
		double totalConesCost = 0.99 * 2;
		System.out.println(totalConesCost);
        /* Exercise 22
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
		int rocksNeeded = 125 - 64;
		System.out.println(rocksNeeded);
        /* Exercise 23
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
		int currentMarbles = 38;
		int lost = 15;
		int remainderMarbles = currentMarbles-lost;
		System.out.println(remainderMarbles);
        /* Exercise 24
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
		int totalMiles = 78;
		int milesLeft = totalMiles-32;
		System.out.println(milesLeft);
        /* Exercise 25
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time (in minutes) did she spend shoveling snow?
        */
		int morningSnow = 90;
		int afternoonSnow = 45;
		int totalSnow = morningSnow + afternoonSnow;
		System.out.println(totalSnow);
		/* Exercise 26
       26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
		int hotdogAmount = 6;
		double costofHotDogs = 0.50;
		double totalcost = hotdogAmount * costofHotDogs;
		System.out.println(totalcost);
        /* Exercise 27
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
		int moneyOnHand = 50;
		int pencilCost = 7;
		int amountOfPencilsUCanBuy = moneyOnHand / pencilCost;
		System.out.println(amountOfPencilsUCanBuy);
        /* Exercise 28
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
		int totalButterflies = 33;
		int orangeButterflies = 20;
		int redButterflies = totalButterflies-orangeButterflies;
		System.out.println(redButterflies);
        /* Exercise 29
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
		double moneyGiven = 1.00d;
		double candyCost = .54d;
		double change = moneyGiven - candyCost;
		System.out.println(change);
        /* Exercise 30
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
		int treesCurrently = 13;
		int additionalTrees = 12;
		int totalTrees = treesCurrently + additionalTrees;
		System.out.println(totalTrees);
        /* Exercise 31
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
		int oneDay = 24;
		int daysTillGma = 2;
		int totalHours = oneDay * daysTillGma;
		System.out.println(totalHours);
        /* Exercise 32
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
		int cousins = 4;
		int piecesPerKid = 5;
		int gumNeeded = cousins * piecesPerKid;
		System.out.println(gumNeeded);
        /* Exercise 33
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
		double starterMoney = 3.00d;
		double candyBar = 1.00d;
		double moneyLeft = starterMoney - candyBar;
		System.out.println(moneyLeft);
        /* Exercise 34
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
		int boatsOnLake = 5;
		int peoplePerBoat = 3;
		int totalPeople = boatsOnLake * peoplePerBoat;
		System.out.println(totalPeople);
        /* Exercise 35
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
		int oldLegos = 380;
		int lostLegos = 57;
		int remainderLegos = oldLegos - lostLegos;
		System.out.println(remainderLegos);
        /* Exercise 36
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
		int bakedMuffins = 35;
		int desiredMuffins = 83;
		int neededMuffins = desiredMuffins - bakedMuffins;
		System.out.println(neededMuffins);
        /* Exercise 37
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
		int willy = 1400;
		int lucy = 290;
		int moreCrayons = willy - lucy;
		System.out.println(moreCrayons);
        /* Exercise 38
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
		int stickersOnPage = 10;
		int pagesofStickers = 22;
		int totalStickers = stickersOnPage * pagesofStickers;
		System.out.println(totalStickers);
        /* Exercise 39
        39. There are 100 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
		double children = 8;
		double cupcakes = 100;
		double cupcakesShared = cupcakes / children;
		System.out.println(cupcakesShared);
        /* Exercise 40
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies, how many
        cookies will not be placed in a jar?
        */
		int cookies = 47;
		int jars = 6;
		int cookiesLeft = cookies % jars;
		System.out.println(cookiesLeft);
        /* Exercise 41
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received an equal number of croissants,
        how many will be left with Marian?
        */
		int croissants = 59;
		int neighbors = 8;
		int croissantsLeft = croissants % neighbors;
		System.out.println(croissantsLeft);
        /* Exercise 42
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
		int cookiesPerTray = 12;
		int requiredCookies = 276;
		int requiredTrays = requiredCookies / cookiesPerTray;
		System.out.println(requiredTrays);
        /* Exercise 43
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
		int servingsNeeded = 480;
		int oneServing = 12;
		int totalAmountServing = servingsNeeded / oneServing;
		System.out.println(totalAmountServing);
        /* Exercise 44
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
		int cakesBaked = 53;
		int cakesLeft = 2;
		int cakesPerBox = 3;
		int totalBoxes = (cakesBaked - cakesLeft) / cakesPerBox;
		System.out.println(totalBoxes);
        /* Exercise 45
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
		int prepCarrots = 74;
		int amountofPeople = 12;
		int carrotsLeft = prepCarrots % amountofPeople;
		System.out.println(carrotsLeft);

        /* Exercise 46
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
		int teddyBears = 98;
		int shelfCap = 7;
		int howManyShelves = teddyBears / shelfCap;
		System.out.println(howManyShelves);
        /* Exercise 47
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
		int totalpics = 480;
		int albumCap = 20;
		int totalAlbums = totalpics / albumCap;
		System.out.println(totalAlbums);

        /* Exercise 48
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
		int totalCards = 94;
		int boxCapp = 8;
		int boxesNeeded = totalCards % boxCapp;
		System.out.println(boxesNeeded);


        /* Exercise 49
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
		int totalNumofBooks = 210;
		int numOfShelves = 10;
		int booksPerShelf = totalNumofBooks / numOfShelves;
		System.out.println(booksPerShelf);
        /* Exercise 50
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
		double bakedCros = 17.0;
		double guestAmount = 7.0;
		double croisPerGuest = bakedCros / guestAmount;
		System.out.println(croisPerGuest);

	    /* Exercise 51
	    51. Bill and Jill are house painters. Bill can paint a standard room in 2.15 hours, while Jill averages
	    1.90 hours. How long will it take the two painters working together to paint 5 standard rooms?
	    Hint: Calculate the rate at which each painter can complete a room (rooms / hour), combine those rates, 
	    and then divide the total number of rooms to be painted by the combined rate.
	    */

		 double billHrs = 2.15;
		 double billRoomsPerHour = 1 / billHrs;
		 double jillHrs = 1.90;
		 double jillRoomsPerHour = 1 / jillHrs;
		 double totalRoomsPerHour = billRoomsPerHour + jillRoomsPerHour;
		 int roomsToPaint = 5;
		 double paint5Rooms = roomsToPaint / totalRoomsPerHour;
		System.out.println(paint5Rooms);



	    /* Exercise 52
	    52. Create and assign variables to hold a first name, last name, and middle initial. Using concatenation,
		build an additional variable to hold the full name in the order of last name, first name, middle initial. The
		last and first names should be separated by a comma followed by a space, and the middle initial must end
		with a period. Use "Grace", "Hopper, and "B" for the first name, last name, and middle initial.
		Example: "John", "Smith, "D" —> "Smith, John D."
	    */
		String firstName = "Grace ";
		String middleName = "B.";
		String lastName = "Hopper, ";
		String fullName = lastName + firstName + middleName;
		System.out.println(fullName);


	    /* Exercise 53
	    53. The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
	    What percentage of the trip as a whole number has been completed?
	    */
		double totalTripMiles = 800;
		double milesTraveled = 537;
		int percentofTripTaken = (int)(( milesTraveled / totalTripMiles ) * 100);
		System.out.println(percentofTripTaken);
	}

}
