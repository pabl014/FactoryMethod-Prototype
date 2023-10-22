class TableHeaderInt extends TableHeader {
    public TableHeaderInt() {
        super("INT");
    }

    public TableData createTableData() {
        return new TableDataInt(); // tworzenie obiektu konkretnej klasy z hierarchii TableData
    }
}
