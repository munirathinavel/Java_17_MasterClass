package inheritance;

class Rat {
    private int legs = 4;

    public Rat(int legs) {
        this.legs = legs;
    }

    public void eat(){
        System.out.printf("Rat is eating with %d legs \n", legs);
    }

}

class Spider {
    private int legs = 6;

    public Spider(int legs) {
        this.legs = legs;
    }

    public void eat() {
        System.out.printf("Spider is eating with %d legs \n", legs);
    }
}

class Hybdrid /* extends Rat, Spider */ {
    public Hybdrid(Rat rat, Spider spider) {
        this.rat = rat;
        this.spider = spider;
    }

    private Rat rat;
    private Spider spider;

    public void askToEat() {
        rat.eat();
        spider.eat();
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        Hybdrid hybdrid = new Hybdrid(new Rat(4), new Spider(6));
        hybdrid.askToEat();
    }
}
