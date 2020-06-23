import java.util.Scanner;

public class HoleInTen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userProductCode;

        System.out.println("Enter product code:");
        userProductCode = input.nextLine();
        userProductCode = userProductCode.toUpperCase();    //ignore case

        switch (userProductCode) {

            case "BALL":
                System.out.println("Golf Balls (1 dozen) \nPrice: $38.00");
                break;

            case "DRV01":
                System.out.println("Big Bertha Driver \nPrice: $449.95");
                break;

            case "DRV02":
                System.out.println("Vaporizer Drive \nPrice: $375.00");
                break;

            case "DRV03":
                System.out.println("Fly Z Driver \nPrice: $179.00");
                break;

            case "SET01":
                System.out.println("Project Manager Gold Club Set \nPrice: $179.00");
                break;

            case "SET02":
                System.out.println("Junior VP Golf Club Set \nPrice: $225.00");
                break;

            case "SET03":
                System.out.println("Executive Golf Club Set \nPrice: $299.95");
                break;

            case "SET04":
                System.out.println("CEO Golf Club Set \nPrice: $374.95");
                break;

            case "SET05":
                System.out.println("Chairman of the Board Club Set \nPrice: $495.99");
                break;
        }








    }
}
