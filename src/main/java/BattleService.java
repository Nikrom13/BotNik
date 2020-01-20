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
}
