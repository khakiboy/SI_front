package ir.andriod_stdio.shirazu_app1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class EmailShow extends AppCompatActivity {

    private ListView listView;
    private ArrayList<EmailsRow> UserArrayList;
    private String inboxOrSentOrDraft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email_show);

        inboxOrSentOrDraft= getIntent().getStringExtra("which_Inbox_or_sent_or_Draft");//bara inke befahmim che page ii baz she

        listView = (ListView) findViewById(R.id.list_item);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        FloatingActionButton myFab = (FloatingActionButton) findViewById(R.id.floatingAction);
        myFab.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //
            }
        });
        //set kardane matn tool bare bala
        if(inboxOrSentOrDraft.equals("i")){
            toolbar.setTitle("Inbox");
        }else if (inboxOrSentOrDraft.equals("s") ){
            toolbar.setTitle("Sent");
        }else if (inboxOrSentOrDraft.equals("d")){
            toolbar.setTitle("Draft");
        }
        setSupportActionBar(toolbar);

        setData();// inja too ye in tabe bayad tasimim begrim k sent ha namayesh dade bashan ya inbox ha

        ;
        if (inboxOrSentOrDraft.equals("d") ){
            DraftEmailListAdaptor adapter = new DraftEmailListAdaptor(this, R.layout.activity_draft_email_list_adaptor,UserArrayList );
            listView.setAdapter(adapter);
        }else{
            EmailListAdaptor adapter = new EmailListAdaptor(this, R.layout.email_list_adaptor_layout,UserArrayList );
            listView.setAdapter(adapter);
        }



        }

        private void setData() {
            UserArrayList = new ArrayList<>();

            if(inboxOrSentOrDraft.equals("i")){


                UserArrayList.add(new EmailsRow("username","date","summery","title"));
                UserArrayList.add(new EmailsRow("fateme","23 may","summery","inbox"));
                UserArrayList.add(new EmailsRow("sadaf","23 may","summery",null));
                UserArrayList.add(new EmailsRow("ali","23 may","summery","title"));
                UserArrayList.add(new EmailsRow("karim","23 may","summery","title"));
                UserArrayList.add(new EmailsRow("sana","23 may","summery","title"));
                UserArrayList.add(new EmailsRow("zahra","23 may","summery","title"));
                UserArrayList.add(new EmailsRow("sana","23 may","summery","title"));
                UserArrayList.add(new EmailsRow("sana","23 may","summery","title"));
                UserArrayList.add(new EmailsRow("sss","23 may","summery","title"));
                UserArrayList.add(new EmailsRow("qq","23 may","summery","title"));
                UserArrayList.add(new EmailsRow("ww","23 may","summery","title"));
                UserArrayList.add(new EmailsRow("rr","23 may","summery","title"));
                UserArrayList.add(new EmailsRow("nn","23 may","summery","title"));
                UserArrayList.add(new EmailsRow("ee","23 may","summery","title"));


            }else if (inboxOrSentOrDraft.equals("s") ){
                UserArrayList.add(new EmailsRow("username","date","summery","title"));
                UserArrayList.add(new EmailsRow("fateme","23 may","summery","sent"));
                UserArrayList.add(new EmailsRow("sadaf","23 may","summery","title"));
                UserArrayList.add(new EmailsRow("ali","23 may","summery","title"));
                UserArrayList.add(new EmailsRow("karim","23 may","summery","title"));
                UserArrayList.add(new EmailsRow("sana","23 may","summery","title"));
                UserArrayList.add(new EmailsRow("zahra","23 may","summery","title"));
                UserArrayList.add(new EmailsRow("sana","23 may","summery","title"));
                UserArrayList.add(new EmailsRow("sana","23 may","summery","title"));
                UserArrayList.add(new EmailsRow("sss","23 may","summery","title"));
                UserArrayList.add(new EmailsRow("qq","23 may","summery","title"));
                UserArrayList.add(new EmailsRow("ww","23 may","summery","title"));
                UserArrayList.add(new EmailsRow("rr","23 may","summery","title"));
                UserArrayList.add(new EmailsRow("nn","23 may","summery","title"));
                UserArrayList.add(new EmailsRow("ee","23 may","summery","title"));
            }


            else if (inboxOrSentOrDraft.equals("d") ){
                // be jaye user name ii k dare emailesho chek mikone bezarim
                UserArrayList.add(new EmailsRow("username","23 may","summery","title"));
                UserArrayList.add(new EmailsRow(null,"23 may","summery","title"));
                UserArrayList.add(new EmailsRow("rr","23 may","summery","title"));
                UserArrayList.add(new EmailsRow("nn","23 may","summery","title"));
                UserArrayList.add(new EmailsRow("ee","23 may","summery","title"));
            }


        }

}

