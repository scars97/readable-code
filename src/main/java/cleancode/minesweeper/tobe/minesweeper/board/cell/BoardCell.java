package cleancode.minesweeper.tobe.minesweeper.board.cell;

public interface BoardCell {

    boolean isLandMine();

    boolean hasLandMineCount();

    CellSnapshot getSnapshot();

    void flag();

    void open();

    boolean isChecked();

    boolean isOpened();
}
