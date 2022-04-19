import ru.ifmo.se.pokemon.*;

public class Confide extends StatusMove {
    public Confide(Type var1, double var2, double var4) {
    };
    @Override
    protected void applyOppEffects(Pokemon var1) {
        var1.setMod(Stat.SPECIAL_ATTACK, -3);
    }
    protected void applySelfEffects(Pokemon pokemon) {
        Effect.freeze(pokemon);
    }
}
