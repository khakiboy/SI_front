package ir.andriod_stdio.shirazu_app1;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by PARS NOVIN on 4/16/2019.
 */

public class EmailMenueActivity extends Fragment {

    private ConstraintLayout inbox;
    private ConstraintLayout drafts;
    private ConstraintLayout sent;
    private ConstraintLayout trash;
    private ConstraintLayout spam;
    private ConstraintLayout contacts;
    private ConstraintLayout calendar;
    private ConstraintLayout tasks;
    private ConstraintLayout journal;
    private ConstraintLayout notes;

    private Button button_inbox;
    private Button button_drafts;
    private Button button_sent;
    private Button button_trash;
    private Button button_spam;
    private Button button_contacts;
    private Button button_calendar;
    private Button button_tasks;
    private Button button_journal;
    private Button button_notes;

    private Button compose;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_email_menue,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        findviews(view);
        onclick();
    }

    private void findviews(View view){
        inbox = (ConstraintLayout) view.findViewById(R.id.button1);
        drafts = (ConstraintLayout) view.findViewById(R.id.button2);
        sent = (ConstraintLayout) view.findViewById(R.id.button3);
        trash = (ConstraintLayout) view.findViewById(R.id.button4);
        spam = (ConstraintLayout) view.findViewById(R.id.button5);
        contacts = (ConstraintLayout) view.findViewById(R.id.button6);
        calendar = (ConstraintLayout) view.findViewById(R.id.button7);
        tasks = (ConstraintLayout) view.findViewById(R.id.button8);
        journal = (ConstraintLayout) view.findViewById(R.id.button9);
        notes = (ConstraintLayout) view.findViewById(R.id.button10);

        button_inbox = (Button) view.findViewById(R.id.inbox);
        button_drafts = (Button) view.findViewById(R.id.drafts);
        button_sent = (Button) view.findViewById(R.id.sent);
        button_trash = (Button) view.findViewById(R.id.trash);
        button_spam = (Button) view.findViewById(R.id.spam);
        button_contacts = (Button) view.findViewById(R.id.contacts);
        button_calendar = (Button) view.findViewById(R.id.calendar);
        button_tasks = (Button) view.findViewById(R.id.tasks);
        button_journal = (Button) view.findViewById(R.id.journal);
        button_notes = (Button) view.findViewById(R.id.notes);

        compose = (Button) view.findViewById(R.id.compose);
    }

    private void onclick(){
        inbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View inbox) {
                openInbox();
            }
        });
        drafts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View drafts) {
                openDrafts();
            }
        });
        sent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View sent) {
                openSent();
            }
        });
        trash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View trash) {
                openTrash();
            }
        });
        spam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View spam) {
                openSpam();
            }
        });
        contacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View contacts) {
                openContacts();
            }
        });
        calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View calendar) {
                openCalendar();
            }
        });
        tasks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View tasks) {
                openTasks();
            }
        });
        journal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View journal) {
                openJournal();
            }
        });
        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View notes) {
                openNotes();
            }
        });

        button_inbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View button_inbox) {
                openInbox();
            }
        });
        button_drafts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View button_drafts) {
                openDrafts();
            }
        });
        button_sent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View button_sent) {
                openSent();
            }
        });
        button_trash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View button_trash) {
                openTrash();
            }
        });
        button_spam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View button_spam) {
                openSpam();
            }
        });
        button_contacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View button_contacts) {
                openContacts();
            }
        });
        button_calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View button_calendar) {
                openCalendar();
            }
        });
        button_tasks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View button_tasks) {
                openTasks();
            }
        });
        button_journal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View button_journal) {
                openJournal();
            }
        });
        button_notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View button_notes) {
                openNotes();
            }
        });

        compose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View compose) {
                openNewMail();
            }
        });
    }

    public void openInbox(){
        Toast check = Toast.makeText(getActivity(), "inbox", Toast.LENGTH_SHORT);
    }
    public void openDrafts(){
        Toast check = Toast.makeText(getActivity(), "drafts", Toast.LENGTH_SHORT);
    }
    public void openSent(){
        Toast check = Toast.makeText(getActivity(), "sent", Toast.LENGTH_SHORT);
    }
    public void openTrash(){
        Toast check = Toast.makeText(getActivity(), "trash", Toast.LENGTH_SHORT);
    }
    public void openSpam(){
        Toast check = Toast.makeText(getActivity(), "spam", Toast.LENGTH_SHORT);
    }
    public void openContacts(){
        Toast check = Toast.makeText(getActivity(), "contacts", Toast.LENGTH_SHORT);
    }
    public void openCalendar(){
        Toast check = Toast.makeText(getActivity(), "calendar", Toast.LENGTH_SHORT);
    }
    public void openTasks(){
        Toast check = Toast.makeText(getActivity(), "tasks", Toast.LENGTH_SHORT);
    }
    public void openJournal(){
        Toast check = Toast.makeText(getActivity(), "journal", Toast.LENGTH_SHORT);
    }
    public void openNotes(){
        Toast check = Toast.makeText(getActivity(), "notes", Toast.LENGTH_SHORT);
    }
    public void openNewMail(){
        Toast check = Toast.makeText(getActivity(), "compose", Toast.LENGTH_SHORT);
    }

}
