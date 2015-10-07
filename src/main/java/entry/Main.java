package entry;

import com.pring.lucy.server.Server;

public class Main extends Server {
  public static void main(String[] args) throws Exception {
    new Main()
    // .database("jdbc:mysql://HOST:3306/DB", "U", "P")
    // .sessionAge(60)
    // .gzip()
    // .production()
    // .withoutCookies()
    // .staticLocation("/var/www")
    .port(8080)
    .serve();
  }
}