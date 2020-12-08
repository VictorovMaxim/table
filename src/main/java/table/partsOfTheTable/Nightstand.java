package table.partsOfTheTable;

/**
 * модель тумбочки
 */
public class Nightstand implements PartsOfTheTable {
    private int mass;

    @Override
    public int getMass() {
        return mass;
    }

    public Nightstand(int mass) throws IllegalArgumentException {
        if (mass <= 0) {
            throw new IllegalArgumentException("Масса ножки стола должны быть больше 0");
        }
        this.mass = mass;
    }
}