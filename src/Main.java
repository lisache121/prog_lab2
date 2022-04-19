import ru.ifmo.se.pokemon.Battle;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Litten p1 = new Litten("L", 1);
        Manectric p2 = new Manectric("M", 2);
        Torracat p3 = new Torracat("T", 2);
        Regice p4 = new Regice("R", 4);
        Incineroar p5 = new Incineroar("I", 4);
        Electrike p6 = new Electrike("E", 3);
        b.addAlly(p5);
        b.addAlly(p6);
        b.addAlly(p3);
        b.addFoe(p1);
        b.addFoe(p2);
        b.addFoe(p4);
        b.go();
    }
}
