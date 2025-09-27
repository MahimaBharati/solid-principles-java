class ReportBad {
    String title;
    String content;

    public ReportBad(String title, String content) {
        this.title=title;
        this.content=content;
    }

    public String getContent() {
        return content;
    }

    public String getTitle() {
        return title;
    }

    //Violation of SRP:
    //Below functions are clubbed in this file. Any change in any of them may affect other functions.
    
    public String generateReport(){
        return "Generating report: \n"+title+"\n"+content;
    }
    public void saveReport() {
        System.out.println("Saving report: "+generateReport());
    }
    public void sendReport(String email) {
        System.out.println("Sending report :" +title+" to: "+email);
    }
    
}