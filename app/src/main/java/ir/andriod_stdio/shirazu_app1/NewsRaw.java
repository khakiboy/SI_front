package ir.andriod_stdio.shirazu_app1;



import android.graphics.Bitmap;


public class NewsRaw {
    private  String title ;
    private  String date ;
    private  String summeryNews ;
    private Bitmap imgNews;

    public NewsRaw(String title, String date, String summeryNews, Bitmap imgNews) {
        this.title = title;
        this.date = date;
        this.summeryNews = summeryNews;
        // this.imgNews = imgNews;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSummeryNews() {
        return summeryNews;
    }

    public void setSummeryNews(String summeryNews) {
        this.summeryNews = summeryNews;
    }

    public Bitmap getImgNews() {
        return imgNews;
    }

    public void setImgNews(Bitmap imgNews) {
        this.imgNews = imgNews;
    }
}