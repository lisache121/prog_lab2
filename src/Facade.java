import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    public Facade(Type var1, double var2, double var4) {
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        System.out.println(pokemon + ": Кажется, я не чувствую ничего...");
        Effect.paralyze(pokemon);
    }
}