class MainBad {
    public static void main(String[] args) {
      ReportBad report= new ReportBad("Monthly Report","This is content of the monthly report");
        report.generateReport();
        report.saveReport();
        report.sendReport("mahima@example.com");
    }
}