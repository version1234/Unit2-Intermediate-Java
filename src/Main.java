import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Cupcake> cupcakeMenu = new ArrayList<Cupcake>();
        ArrayList<Drink> drinkMenu = new ArrayList<Drink>();

        Cupcake cupcake = new Cupcake();
        RedVelvet redVelvet = new RedVelvet();
        Chocolate chocolate = new Chocolate();
        Drink water = new Drink();
        Soda soda = new Soda();
        Milk milk = new Milk();

        System.out.println("We are in the middle of creating the cupcake menu. We currently have three cupcakes on the menu but we need to decide on pricing.");
        Scanner input = new Scanner(System.in);

        System.out.println("We are deciding on the price for our standard cupcake. Here is the description:");
        cupcake.type();

        System.out.println("How much would you like to charge for the cupcake? (Input a numerical number taken to 2 decimal places)");
        String priceText = input.nextLine();
        double price = Double.parseDouble(priceText);

        cupcake.setPrice(price);

        System.out.println("We are deciding on the price for our Redvelvet cupcake. Here is the description:");
        redVelvet.type();

        System.out.println("How much would you like to charge for the Redvelvet cupcake? (Input a numerical number taken to 2 decimal places)");
        priceText = input.nextLine();
        price = Double.parseDouble(priceText);

        redVelvet.setPrice(price);

        System.out.println("We are deciding on the price for our chocolate cupcake. Here is the description:");
        chocolate.type();

        System.out.println("How much would you like to charge for the chocolate cupcake? (Input a numerical number taken to 2 decimal places)");
        priceText = input.nextLine();
        price = Double.parseDouble(priceText);

        chocolate.setPrice(price);

        System.out.println("We are in the middle of creating the drink menu. We currently have three types of drinks on\" +\n" +
                "                \"\\nthe menu but we need to decide on pricing");
        System.out.println("We are deciding on the price for our bottled water. Here is the description: ");

        water.type();

        System.out.println("How much would you like to charge for the water bottle?" +
                "\n(Input a numerical number taken to 2 decimal places)");

        priceText = input.nextLine();
        price = Double.parseDouble(priceText);

        water.setPrice(price);

        System.out.println("We are deciding on the price for our bottle of soda. Here is the description: ");
        System.out.println("How much would you like to charge for the bottled soda?" +
                "\n(Input a numerical number taken to 2 decimal places)");
        soda.type();

        priceText = input.nextLine();
        price = Double.parseDouble(priceText);

        soda.setPrice(price);

        System.out.println("We are deciding on the price for our bottle of milk. Here is the description: ");
        System.out.println("How much would you like to charge for the bottled milk?" +
                "\n(Input a numerical number taken to 2 decimal places)");

        milk.type();

        priceText = input.nextLine();
        price = Double.parseDouble(priceText);

        milk.setPrice(price);

        cupcakeMenu.add(cupcake);
        cupcakeMenu.add(redVelvet);
        cupcakeMenu.add(chocolate);
        drinkMenu.add(water);
        drinkMenu.add(soda);
        drinkMenu.add(milk);
        new Order(cupcakeMenu, drinkMenu);
        System.out.println("cupcake price is: $" + cupcake.getPrice());
        System.out.println("redVelvet price is: $" + redVelvet.getPrice());
        System.out.println("chocolate price is: $" +  chocolate.getPrice());
        System.out.println("Water price is: $" +  water.getPrice());
        System.out.println("Soda price is: $" +  soda.getPrice());
        System.out.println("Milk price is: $" +  milk.getPrice());

    }


}
