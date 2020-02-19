import repository.BotUser;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class BattleService {

    public static String startBattle(Archetype o1, Archetype o2){
        int o1Health = o1.getHealth();
        int o2Health = o2.getHealth();
        System.out.println(o1.getStrength() + o1.getHealth());
        System.out.println(o2.getStrength() + o2.getHealth());
        o2Health = o2Health - o1.getStrength();
        System.out.println("o2 Health = " + o2Health);
        o1Health = o1Health - o2.getStrength();
        System.out.println("o1 Health = " + o1Health);
        o2Health = o2Health - o1.getStrength();
        System.out.println("o2 Health = " + o2Health);
        o1Health = o1Health - o2.getStrength();
        System.out.println("o1 Health = " + o1Health);
        o2Health = o2Health - o1.getStrength();
        System.out.println("o2 Health = " + o2Health);
        o1Health = o1Health - o2.getStrength();
        System.out.println("o1 Health = " + o1Health);
        o2Health = o2Health - o1.getStrength();
        System.out.println("o2 Health = " + o2Health);
        o1Health = o1Health - o2.getStrength();
        System.out.println("o1 Health = " + o1Health);
        o2Health = o2Health - o1.getStrength();
        System.out.println("o2 Health = " + o2Health);
        o1Health = o1Health - o2.getStrength();
        System.out.println("o1 Health = " + o1Health);
        o2Health = o2Health - o1.getStrength();
        System.out.println("o2 Health = " + o2Health);
        o1Health = o1Health - o2.getStrength();
        System.out.println("o1 Health = " + o1Health);
        o2Health = o2Health - o1.getStrength();
        System.out.println("o2 Health = " + o2Health);
        o1Health = o1Health - o2.getStrength();
        System.out.println("o1 Health = " + o1Health);
        return "Победила дружба";
    }

    public  static String getRandomUser() {
        BotUser botUser = new BotUser();

        int random = (int) ( Math.random() * 3 );
        if (random == 0){
            random = 1;
        }

        String sql = "SELECT * FROM USERS WHERE ID = ?";

        Properties props = new Properties();
        try (InputStream in = Files.newInputStream(Paths.get("database.properties"))) {
            props.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Class.forName("org.postgresql.Driver");
            String url = props.getProperty("url");
            String login = props.getProperty("username");
            String password = props.getProperty("password");
            Connection conn = DriverManager.getConnection(url, login, password);

            try {
                PreparedStatement stmt = conn.prepareStatement(sql);
                try {
                    stmt.setInt(1, random);
                    ResultSet rs =  stmt.executeQuery();
                    try {
                        while (rs.next()) {
                            botUser.setId(rs.getInt("ID"));
                            botUser.setName(rs.getString("USER_NAME"));
                            botUser.setAlias(rs.getString("USER_ALIAS"));
                        }
                    } finally {
                        if (rs != null) rs.close();
                    }
                } finally {
                    if (stmt != null) stmt.close();
                }
            } finally {
                if (conn != null) conn.close();
            }
            return botUser.getAlias();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
