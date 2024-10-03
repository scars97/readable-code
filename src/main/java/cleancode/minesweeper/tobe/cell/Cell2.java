package cleancode.minesweeper.tobe.cell;

public abstract class Cell2 {

    protected static final String FLAG_SIGN = "⚑";
    protected static final String UNCHECKED_SIGN = "□";

    private int nearByLandMineCount;
    protected boolean isFlagged;
    protected boolean isOpened;

    public abstract void turnOnLandMine();

    public abstract void updateNearByLandMineCount(int count);

    public abstract boolean isLandMine();

    public abstract boolean hasLandMineCount();

    public abstract String getSign();

    public void flag() {
        this.isFlagged = true;
    }

    public void open() {
        this.isOpened = true;
    }

    public boolean isChecked() {
        return isFlagged || isOpened;
    }

    public boolean isOpened() {
        return isOpened;
    }
}
