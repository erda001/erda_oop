import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Table create_table = new Table();
        Add_podcast add = new Add_podcast();
        Show_all_podcast show = new Show_all_podcast();
        Get_podcast get = new Get_podcast();
        Update_podcast update = new Update_podcast();
        Remove_podcast remove = new Remove_podcast();

        create_table.table();

        while(1 == 1){
            System.out.println("Liked podcasts");
            System.out.println( "1.Add new podcast to liked \n" +
            "2.Show liked podcasts \n" +
            "3.Get podcast info \n" + 
            "4.Update podcast \n" +
            "5.Remove podcast \n" + 
            "6.EXIT");

            System.out.print("Choose one option: ");
            int option = Integer.parseInt(scanner.nextLine());

            if(option == 1){
                System.out.print("Enter podcast name: ");
                String name = scanner.nextLine();

                System.out.print("Enter podcast author: ");
                String author = scanner.nextLine();

                System.out.print("Enter playlist: ");
                String playlist = scanner.nextLine();

                System.out.print("Enter playlist duration in (hh:mm:ss) format: ");
                String duration = scanner.nextLine();

                System.out.print("Enter podcast format (video, audio): ");
                String format = scanner.nextLine();

                System.out.print("Likes: ");
                int likes = Integer.parseInt(scanner.nextLine());
                add.add_podcast(name, author, playlist, duration, format, likes);

                break;
            }

            else if (option == 2){
                System.out.println("Here is your liked podcasts:");
                show.get_all_podcasts();

                break;
            }

            else if (option == 3){
                System.out.print("Enter podcast ID: ");
                int ID = Integer.parseInt(scanner.nextLine());
                get.get_podcast(ID);

                break;
            }

            else if (option == 4){
                System.out.print("Enter podcast ID:");
                int ID = Integer.parseInt(scanner.nextLine());

                System.out.print("Enter new podcast name: ");
                String name = scanner.nextLine();

                System.out.print("Enter new podcast author: ");
                String author = scanner.nextLine();

                System.out.print("Enter new playlist: ");
                String playlist = scanner.nextLine();

                System.out.print("Enter podcast format (video, audio): ");
                String format = scanner.nextLine();

                System.out.print("Likes: ");
                int likes = Integer.parseInt(scanner.nextLine());

                update.update_podcast(ID, name, author, playlist, format, likes);

                break;
            }

            else if (option == 5){
                System.out.print("Enter podcast title to remove: ");
                String name = scanner.nextLine(); 
                remove.remove_podcast(name);

                break;
            }

            else if (option == 6){
                break;
            }

            else{
                System.out.println("No option " + option + " found");
            }
            

        }


    }
}
