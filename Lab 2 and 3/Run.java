import java.util.Scanner;

public class Run {
    public static void main(String[] args) {

        Product p1 = new Product("LCD",200000,11,new Date(9,10,2002));
        Product p2 = new Product("Car",2000,13,new Date(10,10,2002));

//      System.out.println(Product.getRecentdate(p1,p2));
//        Artist a1 = new Artist("Moosa","Pakistani","5");
        Music song1 = new Music("Dooriyan",new Artist("Moosa","Pakistani","5"),"4:02","Romantic","yoyo",new Date(2,2,2002) );
//        System.out.println(a1);
        Music song2 = new Music("Dooriyan",new Artist("Moosa","Pakistani","5"),"4:07","Romantic","yo",new Date(4,10,2002) );
        Music song3 = new Music("Tum mily",new Artist("Abdullah","Pakistani","3"),"4:33","Romantic","yaa",new Date(19,2,2002) );
        Music song4 = new Music("Tum ho to",new Artist("Rana","Pakistani","2"),"4:23","Chill","ya",new Date(12,2,2002));
//        System.out.println(song1.equals(song2));
//        System.out.println("\n");
//        System.out.println(song2);
//        System.out.println("\n");
//        System.out.println(song3);
//        System.out.println("\n");
//        System.out.println(song4);
//        System.out.println("\n");
        Music arr[] = {song1,song2,song3,song4};

        for(int i = 0;i <= 3;i ++) {
            System.out.print(arr[i] + "\n");
        }

        Scanner obj= new Scanner(System.in);
        System.out.println("Enter title:");
        String title = obj.nextLine();

        System.out.println("Enter artist:");
        String name = obj.nextLine();

        System.out.println("Enter nationality:");
        String nationality = obj.nextLine();

        System.out.println("Enter duration:");
        String duration = obj.nextLine();

        System.out.println("Enter rating:");
        String rating = obj.nextLine();

        System.out.println("Enter genre:");
        String genre = obj.nextLine();

        System.out.println("Enter albumName:");
        String albumName = obj.nextLine();

        System.out.println("Enter date:");
        int date = obj.nextInt();

        System.out.println("Enter month:");
        int month = obj.nextInt();

        System.out.println("Enter year:");
        int year = obj.nextInt();

        Music song5 = new Music(title,new Artist(name,nationality,rating),duration,genre,albumName,new Date(date,month,year));
        System.out.println(song5);
    }
}
