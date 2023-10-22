class TableHeaderBoolean extends TableHeader {
    public TableHeaderBoolean() {
        super("BOOLEAN");
    }

    public TableData createTableData() {
        return new TableDataBoolean(); // tworzenie obiektu konkretnej klasy z hierarchii TableData
    }
}