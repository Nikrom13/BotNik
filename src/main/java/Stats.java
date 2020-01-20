import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Stats {

//    public static String getWeather(String message, Model model) throws IOException {
//        URL url = new URL("http://api.openweathermap.org/data/2.5/weather?q=" + message + "&units=metric&appid=6fff53a641b9b9a799cfd6b079f5cd4e");
//
//        Scanner in = new Scanner((InputStream) url.getContent());
//        String result = "";
//        while (in.hasNext()) {
//            result += in.nextLine();
//        }
//
//        JSONObject object = new JSONObject(result);
//        model.setName(object.getString("name"));
//
//        JSONObject main = object.getJSONObject("main");
//        model.setTemp(main.getDouble("temp"));
//        model.setHumidity(main.getDouble("humidity"));
//
//        JSONArray getArray = object.getJSONArray("weather");
//        for (int i = 0; i < getArray.length(); i++) {
//            JSONObject obj = getArray.getJSONObject(i);
//            model.setIcon((String) obj.get("icon"));
//            model.setMain((String) obj.get("main"));
//        }
//
//        return "City: " + model.getName() + "\n" +
//                "Temperature: " + model.getTemp() + "C" + "\n" +
//                "Humidity:" + model.getHumidity() + "%" + "\n" +
//                "Main: " + model.getMain() + "\n" +
//                "http://openweathermap.org/img/w/" + model.getIcon() + ".png";
//    }

    public static String getArchetypeStats(String name) {
        Archetype archetype = new Archetype();
        if (name.equals("Слива")) {
            archetype.setName("Слива");
            archetype.setStrength(2);
            archetype.setHealth(20);
            archetype.setEnergy(3);
        } else if (name.equals("Душила")) {
            archetype.setName("Душила");
            archetype.setStrength(3);
            archetype.setHealth(15);
            archetype.setEnergy(2);
        } else {
            archetype.setName("CуперАдмин");
            archetype.setStrength(999);
            archetype.setHealth(999);
            archetype.setEnergy(999);
        }

        return archetype.toString();
    }

    public static Archetype getArchetype(String name) {
        Archetype archetype = new Archetype();
        if (name.equals("Слива")) {
            archetype.setName("Слива");
            archetype.setStrength(2);
            archetype.setHealth(20);
            archetype.setEnergy(3);
        } else if (name.equals("Душила")) {
            archetype.setName("Душила");
            archetype.setStrength(3);
            archetype.setHealth(15);
            archetype.setEnergy(2);
        } else {
            archetype.setName("CуперАдмин");
            archetype.setStrength(999);
            archetype.setHealth(999);
            archetype.setEnergy(999);
        }

        return archetype;
    }
}
