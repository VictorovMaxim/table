package table.tables;

import table.partsOfTheTable.PartsOfTheTable;
import table.partsOfTheTable.TableLeg;
import table.partsOfTheTable.TableTop;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * модель стола (ножки и стол)
 */
public class TheTable {

    private List<PartsOfTheTable> partsOfTheTableList = new ArrayList<>();

    protected List<PartsOfTheTable> getPartsOfTheTableList() {
        return partsOfTheTableList;
    }

    public TheTable(TableTop tableTop, List<TableLeg> tableLegList) throws IllegalArgumentException {
        if (tableTop == null) {
            throw new IllegalArgumentException("Объект столешницы (tableTop) не должен быть null");
        }
        if (tableLegList == null) {
            throw new IllegalArgumentException("Список ножек стола (List<TableLeg>) не должен быть null");
        }
        if (tableLegList.size() == 0) {
            throw new IllegalArgumentException("Количество ножек стола (TableLeg) должно быть больше 0");
        }
        partsOfTheTableList.add(tableTop);
        partsOfTheTableList.addAll(tableLegList);
    }
    
    /**
     * получить столешницу
     */
    public Optional<TableTop> getTableTop() {
        return partsOfTheTableList.stream()
                .filter(partsOfTheTable -> partsOfTheTable.getClass().equals(TableTop.class))
                .map(partsOfTheTable -> (TableTop) partsOfTheTable)
                .findFirst();
    }

    /**
     * получить ножку стола
     */
    public Optional<TableLeg> getTableLeg() {
         return partsOfTheTableList.stream()
                .filter(partsOfTheTable -> partsOfTheTable.getClass().equals(TableLeg.class))
                .map(partsOfTheTable -> (TableLeg) partsOfTheTable)
                .findFirst();
    }

    /**
     * получить все ножки стола
     */
    public List<TableLeg> getTableLegs() {
        return partsOfTheTableList.stream()
                .filter(partsOfTheTable -> partsOfTheTable.getClass().equals(TableLeg.class))
                .map(partsOfTheTable -> (TableLeg) partsOfTheTable)
                .collect(Collectors.toList());
    }

    /**
     * получить массу стола
     */
    public int getMass() {
        return partsOfTheTableList.stream()
                .mapToInt(partsOfTheTableList -> partsOfTheTableList.getMass())
                .sum();
    }
}