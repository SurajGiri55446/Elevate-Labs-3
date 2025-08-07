public class Books{
    private int id;
    private String title;
    private boolean isIssued;
    
    public Books(int id, String title, boolean isIssued) {
        this.id = id;
        this.title = title;
        this.isIssued = isIssued;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void setIssued(boolean isIssued) {
        this.isIssued = isIssued;
    }
    public void issueBook(){
        this.isIssued=true;
    }

    public void returnBook(){
        this.isIssued=false;
    }

    @Override
    public String toString() {
        return "Book [id=" + id + ", title=" + title + ", isIssued=" + isIssued + "]";
    }

    


}