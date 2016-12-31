package hci.commuteassistance;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import java.util.Date;
import java.util.Calendar;
import android.text.format.Time;
//import org.joda.time.*;
//import org.joda.time.format.DateTimeFormatter;
/*import java.time.format.*;
import java.time.*;
import java.text.*;
import java.util.Date;
import java.time.temporal.ChronoUnit;*/

public class TampilJadwal extends AppCompatActivity {

    private TextView showSch;
    public static String FROM ,TO;
    public int dari,ke;
    //LocalTime currentTime = LocalTime.now();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jadwal);
        showSch = (TextView)findViewById(R.id.textView);

        dari = getIntent().getIntExtra(FROM,0);
        ke = getIntent().getIntExtra(TO,0);

        showSch.setText( dari+ " minute(s)");

    }

    /*public void prosesJdwl()
    {
        int [][] jadwal = {{04,28},{04,38},{04,48},{04,58},{05, 8},{05,18},{05,33},{05,53},{06,03},{06,13}
                ,{06,28},{06,43},{06,58},{07, 8},{07,13},{07,28},{07,39},{07,54},{ 8,10},{ 8,24}
                ,{ 8,40},{ 8,49},{ 9, 0},{ 9,16},{ 9,28},{ 9,48},{ 9,59},{10,10},{10,21},{10,31}
                ,{10,36},{10,46},{10,55},{11,13},{11,26},{11,43},{11,55},{12,07},{12,17},{12,26}
                ,{12,37},{12,43},{12,58},{13, 8},{13,17},{13,30},{13,41},{13,51},{14,07},{14,13}
                ,{14,28},{14,40},{14,52},{15,03},{15,13},{15,23},{15,29},{15,45},{16,05},{16, 9}
                ,{16,22},{16,36},{16,41},{16,52},{17,02},{17,12},{17,22},{17,36},{17,46},{18,10}
                ,{18,15},{18,25},{18,35},{18,40},{18,57},{19,11},{19,26},{19,42},{20,01},{20,15}
                ,{20,33},{20,46},{21,12},{21,31},{21,53},{22,14},{22,43}};

        int [][] jadwalDPB = {{04,28},{04,38},{04,48},{04,58},{05, 8},{05,18},{05,33},{05,53},{06,03},{06,13}
                ,{06,28},{06,43},{06,58},{07, 8},{07,13},{07,28},{07,39},{07,54},{ 8,10},{ 8,24}
                ,{ 8,40},{ 8,49},{ 9, 0},{ 9,16},{ 9,28},{ 9,48},{ 9,59},{10,10},{10,21},{10,31}
                ,{10,36},{10,46},{10,55},{11,13},{11,26},{11,43},{11,55},{12,07},{12,17},{12,26}
                ,{12,37},{12,43},{12,58},{13, 8},{13,17},{13,30},{13,41},{13,51},{14,07},{14,13}
                ,{14,28},{14,40},{14,52},{15,03},{15,13},{15,23},{15,29},{15,45},{16,05},{16, 9}
                ,{16,22},{16,36},{16,41},{16,52},{17,02},{17,12},{17,22},{17,36},{17,46},{18,10}
                ,{18,15},{18,25},{18,35},{18,40},{18,57},{19,11},{19,26},{19,42},{20,01},{20,15}
                ,{20,33},{20,46},{21,12},{21,31},{21,53},{22,14},{22,43}};


        int [][] jdwl = new int[jadwal.length][jadwal[1].length];
        int a = 0, b = 0, i = 0;
        LocalTime currentTime = LocalTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        String text = currentTime.format(formatter);
        LocalTime parsedTime = LocalTime.parse(text, formatter);

        showSch.setText("");

        jdwl = jadwal;

        for ( i = 0; i < 87 ; i ++){
            LocalTime time = LocalTime.of(jdwl[a][0],jdwl[b][1]);
            if (currentTime.isBefore(time)){

                showSch.setText(time + " Datang ke Stasiun");
                showSch.setText("");
                long  minutes   = ChronoUnit.MINUTES.between(parsedTime,time);

                showSch.setText("Akan sampai dalam waktu " + minutes + " menit");

                break;
            }
            else {
                a++;
                b++;
            }

        }

        if (i>=jdwl.length)
            showSch.setText("not available");
    }*/

}
