package parseURL;

public class Work {
    private String title;
    private String type;
    private String url;

    public Work(String newTitle, String newURL) {
        title = newTitle;
        url = newURL;
        type = "unknown";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String newTitle) {
        title = newTitle;
    }

    public String getURL() {
        return url;
    }

    public void setURL(String newURL) {
        url = newURL;
    }

    public String getType() {
        return type;
    } 

    public void setType(String newType) {
        type = newType;
    }
}