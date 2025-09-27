public class Main{
    public static void main(String[] args) {
        Report report=new Report("Monthly Report","This is the content of monthly report");
        GenerateReport generator=new GenerateReport(report);
        generator.generate();
        SaveReport saver = new SaveReport(report);
        saver.save();
        SendReport sender=new SendReport(report);
        sender.send("mahima@example.com");
    }
}