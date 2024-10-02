package cleancode.minesweeper.tobe;

public class Cell {

    private static final String FLAG_SIGN = "⚑";
    private static final String LAND_MINE_SIGN = "☼";
    private static final String UNCHECKED_SIGN = "□";
    private static final String EMPTY_SIGN = "■";

    private int nearByLandMineCount;
    private boolean isLandMine;
    private boolean isFlagged;
    private boolean isOpened;

    public Cell(int nearByLandMineCount, boolean isLandMine, boolean isFlagged, boolean isOpened) {
        this.nearByLandMineCount = nearByLandMineCount;
        this.isLandMine = isLandMine;
        this.isFlagged = isFlagged;
        this.isOpened = isOpened;
    }

    public static Cell of( int nearByLandMineCount, boolean isLandMine, boolean isFlagged, boolean isOpened) {
        return new Cell(nearByLandMineCount, isLandMine, isFlagged, isOpened);
    }

    public static Cell create() {
        return of(0, false, false, false);
    }

    public boolean isChecked() {
        return isFlagged || isOpened;
    }

    public boolean isLandMine() {
        return isLandMine;
    }

    public boolean isOpened() {
        return isOpened;
    }

    public void turnOnLandMine() {
        this.isLandMine = true;
    }

    public void flag() {
        this.isFlagged = true;
    }

    public void open() {
        this.isOpened = true;
    }

    public void updateNearByLandMineCount(int count) {
        this.nearByLandMineCount = count;
    }

    public boolean hasLandMineCount() {
        return this.nearByLandMineCount != 0;
    }

    public String getSign() {
        if (isOpened) {
            if (isLandMine) {
                return LAND_MINE_SIGN;
            }
            if (hasLandMineCount()) {
                return String.valueOf(nearByLandMineCount);
            }
            return EMPTY_SIGN;
        }

        if (isFlagged) {
            return FLAG_SIGN;
        }

        return UNCHECKED_SIGN;
    }
}
