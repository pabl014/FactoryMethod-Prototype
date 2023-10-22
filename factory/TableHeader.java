
abstract class TableHeader {
    private String type;

    protected TableHeader(String type) {
        this.type = type;
    }

    public String toString() {
        return type;
    }

    public abstract TableData createTableData();
}