package cleancode.minesweeper.tobe.io.sign;

import cleancode.minesweeper.tobe.cell.CellSnapshot;

import java.util.List;

public class CellSignFinder {

    public static final List<CellSignProvidable> CELL_SIGN_PROVIDERS = List.of(
        new EmptyCellSignProvider(),
        new FlagCellSignProvider(),
        new LandMineCellSignProvider(),
        new NumberCellSignProvider(),
        new UncheckedMineCellSignProvider()
    );

    public String findCellSignFrom(CellSnapshot snapshot) {
        return CELL_SIGN_PROVIDERS.stream()
                .filter(provider -> provider.supports(snapshot))
                .findFirst()
                .map(provider -> provider.provide(snapshot))
                .orElseThrow(() -> new IllegalArgumentException("확인 할 수 없는 셀입니다."));
    }
}
