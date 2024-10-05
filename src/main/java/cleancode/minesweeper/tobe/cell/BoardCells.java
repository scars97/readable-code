package cleancode.minesweeper.tobe.cell;

import java.util.Arrays;
import java.util.List;

public class BoardCells {

    private final List<BoardCell> cells;

    private BoardCells(List<BoardCell> cells) {
        this.cells = cells;
    }

    public static BoardCells of(List<BoardCell> cells) {
        return new BoardCells(cells);
    }

    public static BoardCells from(BoardCell[][] cells) {
        List<BoardCell> cellList = Arrays.stream(cells)
                .flatMap(Arrays::stream)
                .toList();
        return of(cellList);
    }

    public boolean isAllChecked() {
        return cells.stream()
                .allMatch(BoardCell::isChecked);
    }
}
