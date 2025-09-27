class GenerateReport{
    Report report;
    public GenerateReport(Report report) {
        this.report=report;
    }
    public void generate() {
        System.out.println("Generating report: \n"+ report.getTitle()+"\n"+report.getContent());
    }
}