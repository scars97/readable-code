package cleancode.minesweeper.tobe.cell;

public class NumberCell implements BoardCell {

    private final CellState cellState = CellState.initialize();
    private final int nearbyLandMinCount;

    public NumberCell(int nearbyLandMinCount) {
        this.nearbyLandMinCount = nearbyLandMinCount;
    }

    @Override
    public boolean isLandMine() {
        return false;
    }

    @Override
    public boolean hasLandMineCount() {
        return true;
    }

    @Override
    public CellSnapshot getSnapshot() {
        if (cellState.isOpened()) {
            return CellSnapshot.ofNumber(nearbyLandMinCount);
        }
        if (cellState.isFlagged()) {
            return CellSnapshot.ofFlag();
        }
        return CellSnapshot.ofUnchecked();
    }

    @Override
    public void flag() {
        cellState.flag();
    }

    @Override
    public void open() {
        cellState.open();
    }

    @Override
    public boolean isChecked() {
        return cellState.isChecked();
    }

    @Override
    public boolean isOpened() {
        return cellState.isOpened();
    }
}
