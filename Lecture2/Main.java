package Lecture2;
public class Main {
    public static void main(String[] args) {//-> main is static so that it can be used without making an pobject of the class
        Human hadi= new Human("Hadi", 20, 10000, false);//dosent have to import because in same package
        Human ana= new Human("ana", 21, 0, false);
        System.out.println(Human.population);
        Human ann=new Human(null, 0, 0, false);
        System.out.println(Human.population);
        System.out.println(hadi+""+ann+""+ana);

    }  
}
