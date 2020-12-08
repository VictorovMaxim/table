package table;

import table.partsOfTheTable.Nightstand;
import table.partsOfTheTable.TableLeg;
import table.partsOfTheTable.TableTop;
import table.tables.TheTable;
import table.tables.TheTableUpgrade;

import java.util.Arrays;
import java.util.List;

public class TableApplication {
	public static void main(String[] args) {
		TableTop tableTop = new TableTop(5);
		List<TableLeg> tableLegList =
				Arrays.asList(new TableLeg(1), new TableLeg(1), new TableLeg(1));

		TheTable table = new TheTable(tableTop, tableLegList);
		System.out.println(table.getMass());

		TheTableUpgrade tableUpgrade = new TheTableUpgrade(tableTop, tableLegList, new Nightstand(3));
		System.out.println(tableUpgrade.getMass());
	}
}