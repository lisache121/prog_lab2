import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class FireFang extends PhysicalMove {
    public FireFang(Type type, double v1, double v2){};

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect.burn(pokemon);
        System.out.println(pokemon +  " поджаривается");
    }
}
