class TableHeaderDouble extends TableHeader {
    public TableHeaderDouble() {
        super("DOUBLE");
    }

    public TableData createTableData() {
        return new TableDataDouble(); // tworzenie obiektu konkretnej klasy z hierarchii TableData
    }
}
