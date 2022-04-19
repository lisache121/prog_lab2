import ru.ifmo.se.pokemon.*;

public class XScissor extends PhysicalMove {
    public XScissor(Type var1, double var2, double var4) {
    };

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect.freeze(pokemon);
    }
}