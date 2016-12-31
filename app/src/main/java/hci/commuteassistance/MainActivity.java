package hci.commuteassistance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private Button btnJadwal;
    private Spinner spinnerTo, spinnerFrom;
    private int positionFrom, positionTo, stDari,stKe;
    private String[] stasiun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        btnJadwal = (Button)findViewById(R.id.button);
        spinnerTo = (Spinner)findViewById(R.id.spinner2);
        spinnerFrom = (Spinner)findViewById(R.id.spinner);

        stasiun = new String[]{"St. BOGOR", "St. Cilebut", "St. Bojong Gede", "St. Citayam", "St. Depok", "St. Depok Baru", "St. Pondok Cina", "St. Univ. Indonesia", "St. Univ. Pancasila", "St. Lenteng Agung", "St. Tanjung Barat", "St. Ps Minggu", "St. Ps Minggu Baru", "St. Duren Kalibata", "St. Cawang", "St. Tebet", "St. MANGGARAI", "St. Cikini", "St. Gondangdia", "St. Juanda", "St. Sawah Besar", "St. Mangga Besar ", "St. Jayakarta", "St. JAKARTA KOTA", "St. Kamp. Bandan", "St. Rajawali", "St. Kemayorann", "St. PASAR SENEN", "St. Gg. Sentiong", "St. Kramat", "St. Pondok Jati", "St. JATINEGARA", "St. Klender", "St. Buaran", "St. Klender Baru", "St. Cakung", "St. Kranji", "St. BEKASI", "St. Sudirman", "St. Karet", "St. TANAH ABANG", "St. Duri", "St. Pesing", "St. Bojong Indah", "St. Rawa Buaya", "St. Kali Deres", "St. Poris", "St. Batu Ceper", "St. TANGERANG", "St. Palmerah", "St. Kebayoran", "St. Pondok Ranji", "St. Jurangmangu", "St. Sudimara", "St. Rawa Buntu", "St. SERPONG", "St. Cisauk", "St. Cicayur", "St. PARUNG PANJANG", "St. Cilejit", "St. Daru", "St. Tenjo", "St. Tigaraksa", "St. Maja"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, stasiun);
        spinnerFrom.setAdapter(adapter);
        spinnerTo.setAdapter(adapter);

        spinnerFrom.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //To change body of implemented methods use File | Settings | File Templates.
                positionFrom = spinnerFrom.getSelectedItemPosition();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                //To change body of implemented methods use File | Settings | File Templates.
            }
        });
        spinnerTo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //To change body of implemented methods use File | Settings | File Templates.
                positionTo = spinnerTo.getSelectedItemPosition();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                //To change body of implemented methods use File | Settings | File Templates.
            }
        });

        btnJadwal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                stDari = getPosFrom();
                stKe = getPosTo();
                Intent i;
                i = new Intent(MainActivity.this, TampilJadwal.class);
                i.putExtra(TampilJadwal.TO, stKe);
                //startActivityForResult(i, 0);
                i.putExtra(TampilJadwal.FROM, stDari);
                startActivityForResult(i, 0);
                //i = new Intent(getApplicationContext(),TampilJadwal.class);
                //startActivity(i);
            }
        });



    }

    public int getPosFrom()
    {
        return positionFrom;
    }

    public int getPosTo()
    {

        return positionTo;
    }




}
