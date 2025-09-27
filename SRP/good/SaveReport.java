class SaveReport{
    Report report;
    public SaveReport(Report report) {
        this.report=report;
    }
    public void save() {
        System.out.println("\nSaving report named "+report.getTitle());
    }
}