package table.partsOfTheTable;

/**
 * модель ножек стола
 */
public class TableLeg implements PartsOfTheTable {
    private int mass;

    @Override
    public int getMass() {
        return mass;
    }

    public TableLeg(int mass) throws IllegalArgumentException {
        if (mass <= 0) {
            throw new IllegalArgumentException("Масса ножки стола должны быть больше 0");
        }
        this.mass = mass;
    }
}