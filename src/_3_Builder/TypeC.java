package _3_Builder;

public class TypeC {
    private TypeOfHole TypeHole;
    private int volume;
    private boolean effects;

    public TypeC(TypeOfHole typeHole, int volume, boolean effects) {
        TypeHole = typeHole;
        this.volume = volume;
        this.effects = effects;
    }

    public void effectsOn() {
        effects = true;
    }

    public void effectsOff() {
        effects = false;
    }

    public boolean isEffects() {
        return effects;
    }

    public TypeOfHole getTypeHole() {
        return TypeHole;
    }

    public int getVolume() {
        return volume;
    }
}
