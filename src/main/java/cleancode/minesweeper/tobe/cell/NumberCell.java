package cleancode.minesweeper.tobe.cell;

public class NumberCell extends Cell2 {

    private int nearbyLandMinCount;

    @Override
    public void turnOnLandMine() {
        throw new UnsupportedOperationException("지원하지 않는 기능");
    }

    @Override
    public void updateNearByLandMineCount(int count) {
        this.nearbyLandMinCount = count;
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
    public String getSign() {
        if (isOpened) {
            return String.valueOf(nearbyLandMinCount);
        }
        if (isFlagged) {
            return FLAG_SIGN;
        }
        return UNCHECKED_SIGN;
    }
}
