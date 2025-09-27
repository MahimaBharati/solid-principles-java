class Report{
    private String title;
    private String content;
    public Report(String title, String content) {
        this.title=title;
        this.content=content;
    }
    public String getContent(){
        return content;
    }
    public String getTitle() {
        return title;
    }
}