class TableHeaderChar extends TableHeader {
    public TableHeaderChar() {
        super("CHAR");
    }

    public TableData createTableData() {
        return new TableDataChar(); // tworzenie obiektu konkretnej klasy z hierarchii TableData
    }
}
