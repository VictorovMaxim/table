package table.tables;

import table.partsOfTheTable.Nightstand;
import table.partsOfTheTable.TableLeg;
import table.partsOfTheTable.TableTop;

import java.util.List;
import java.util.Optional;

/**
 * модель стола с тумбочкой
 */
public class TheTableUpgrade extends TheTable {

    public TheTableUpgrade(TableTop tableTop, List<TableLeg> tableLegList, Nightstand nightstand)
            throws IllegalArgumentException {
        super(tableTop, tableLegList);
        if (nightstand == null) {
            throw new IllegalArgumentException("Объект тумбочки (nightstand) не должен быть null");
        }
        getPartsOfTheTableList().add(nightstand);
    }

    /**
     * получить тумбочку
     */
    public Optional<Nightstand> getNightstand() {
         return getPartsOfTheTableList().stream()
                .filter(partsOfTheTable -> partsOfTheTable.getClass().equals(Nightstand.class))
                .map(partsOfTheTable -> (Nightstand) partsOfTheTable)
                .findFirst();
    }
}