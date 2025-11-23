import java.util.Scanner;

class Menu 
{
    int total = 0;

    void showMenu() 
    {
        System.out.println("1. Ghee Dosa - Rs.40");
        System.out.println("2. Idly - Rs.20");
        System.out.println("3. Paneer Gravy - Rs.120");
        System.out.println("4. Biryani - Rs.150");
        System.out.println("0. Finish Order");
    }

    void addItem(int price) 
    {
        total = total + price;
    }

    int getTotal() 
    {
        return total;
    }
}

public class KaransRestaurantE 
{
    public static void main(String[] args) 
    {

        Scanner value = new Scanner(System.in);
        Menu m = new Menu();
        int item = -1;

        System.out.println("WELCOME TO KARAN'S RESTAURANT");

        while (item != 0) 
        {
            try {
                System.out.println("\nMENU:");
                m.showMenu();
                System.out.print("Choose an item: ");

                item = value.nextInt();   // might cause exception

                if (item == 1) 
                {
                    m.addItem(40);
                    System.out.println("Ghee Dosa added.");
                }
                else if (item == 2) 
                {
                    m.addItem(20);
                    System.out.println("Idly added.");
                }
                else if (item == 3) 
                {
                    m.addItem(120);
                    System.out.println("Paneer Gravy added.");
                }
                else if (item == 4) 
                {
                    m.addItem(150);
                    System.out.println("Biryani added.");
                }
                else if (item == 0) 
                {
                    System.out.println("Order Finished.");
                }
                else 
                {
                    System.out.println("Invalid Option.");
                }
            }
            catch (Exception e) {
                System.out.println("Please enter numbers only!");
                value.nextLine();  // clear wrong input
            }
        }

        System.out.println("\nYour Total Bill = Rs." + m.getTotal());

        value.close();  
    }
}
