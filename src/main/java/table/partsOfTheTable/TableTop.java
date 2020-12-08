package table.partsOfTheTable;

/**
 * модель столешницы
 */
public class TableTop implements PartsOfTheTable {
    private int mass;

    @Override
    public int getMass() {
        return mass;
    }

    public TableTop(int mass) throws IllegalArgumentException {
        if (mass <= 0) {
            throw new IllegalArgumentException("Масса столешницы должна быть больше 0");
        }
        this.mass = mass;
    }
}