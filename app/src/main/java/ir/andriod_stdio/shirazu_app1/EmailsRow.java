package ir.andriod_stdio.shirazu_app1;


import android.graphics.Bitmap;

public class EmailsRow {
    // private ImageView imageView;
    private String userName;
    private String date;
    private String summeryOfEmail;
    private String title;
    private Bitmap profilePhoto;

    public EmailsRow(String userName, String date, String summeryOfEmail, String title, Bitmap profilePhoto) {
        this.userName = userName;
        this.date = date;
        this.summeryOfEmail = summeryOfEmail;
        this.title = title;
        this.profilePhoto = profilePhoto;
    }

    //constructor//_____ye chizi k moshkel darm masln vaghti taraf title nadashte bayad bara oona hm constructor bezarm ?
    //hich methodi ya kari nis k beshe chenin chizio dors kard !!!!!!
    public EmailsRow(String userName, String date, String summeryOfEmail, String title) {
        this.userName = userName;
        this.date = date;
        this.summeryOfEmail = summeryOfEmail;
        this.title = title;
    }



    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSummeryOfEmail() {
        return summeryOfEmail;
    }

    public void setSummeryOfEmail(String summeryOfEmail) {
        this.summeryOfEmail = summeryOfEmail;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
