import java.util.Random;

public class ServerNameGenerator {

    public static void main(String[] args) {
        String adj[] = new String[9];
        adj[0] = "amazing!";
        adj[1] = "aggressive";
        adj[2] =  "agreeable";
        adj[3] = "ambitious";
        adj[4] = "brave";
        adj[5] = "calm";
        adj[6] = "delightful";
        adj[7] = "eager";
        adj[8] = "faithful";

        String noun[] = new String[9];

        noun[0] = "history";
       noun[1] = "people";
       noun[2] = "way";
       noun[3] = "art";
       noun[4] = "world";
       noun[5] = "wade";
       noun[6] = "map";
       noun[7] = "two";
       noun[8] = "family";

//        int rnd = new Random().nextInt(adj.length);
//        int rad = new Random().nextInt(adj.length);
//
//        System.out.println(adj[rnd] + " " + noun[rad]);


        String serverName = getRandomString(adj) + " " + getRandomString(noun);


        System.out.println(serverName);


    }

    private static String getRandomString(String[] strings) {
        int randomIndex = (int) (Math.random() * strings.length);
        return strings[randomIndex];

    }

}
