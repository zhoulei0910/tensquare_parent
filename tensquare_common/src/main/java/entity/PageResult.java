package entity;

import java.util.List;

public class PageResult<T> {

    private Long totals;
    private List<T> rows;

    public PageResult() {
    }

    public PageResult(Long totals, List<T> rows) {
        this.totals = totals;
        this.rows = rows;
    }

    public Long getTotals() {
        return totals;
    }

    public void setTotals(Long totals) {
        this.totals = totals;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
