class SendReport{
    Report report;
    public SendReport(Report report) {
        this.report=report;
    }
    public void send(String emailId) {
        System.out.println("\nSending report named "+report.getTitle()+ " to "+emailId);
    }
}