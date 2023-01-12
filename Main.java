public class Main {
    public static void main(String[] args) {
       Comandor comandor = new Comandor("Eugene", 250,new LongBow(), new WoodenShield());
       Team<Archer> archers = new Team<>(comandor);
        System.out.println(comandor);
        archers.addWarrior(new Archer("Ahiles",180,new LongBow(), new IronShield()));
        archers.addWarrior(new Archer("Dorn",210, new LongBow(), new WoodenShield()));
        archers.forEach(item-> System.out.println(item));
        System.out.println("Суммарный урон команды равен: "+archers.getAllDamage()+
                "суммарное здоровье: "+archers.getAllHealthPoint()+
                "максимальная зона поражения: "+archers.getMaxRadius());


        System.out.println("---------новая команда---------");
        Comandor comandor1 = new Comandor("Lukas",530,new LongBow(), new IronShield());
        Team<Barbarian> axes = new Team<>(comandor1);
        axes.addWarrior(new Barbarian("Serg", 168, new Sekira(), new IronShield()));
        System.out.println(comandor1);
        for (Barbarian item:axes) {
            System.out.println(item);
        }
        System.out.println("Суммарный урон команды равен: "+axes.getAllDamage()+
                "суммарное здоровье: "+axes.getAllHealthPoint()+
                "максимальная зона поражения: "+axes.getMaxRadius());
        System.out.println("---------третья команда---------");
        Comandor comandor2 = new Comandor("Fairy", 290, new LongBow(), new WoodenShield());
        Team<Warrior> gang = new Team<>(comandor2);
        gang.addWarrior(new Barbarian("John", 325,new Sekira(), new WoodenShield()));
        gang.addWarrior(new Archer("Lisa",187,new LongBow(), new IronShield()));
        System.out.println(comandor2);
        gang.forEach(item-> System.out.println(item));

        System.out.println("Суммарный урон команды равен: "+gang.getAllDamage()+
                "суммарное здоровье: "+gang.getAllHealthPoint()+
                "максимальная зона поражения: "+gang.getMaxRadius());
        
    }
}