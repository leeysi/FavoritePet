package yeseul.kr.hs.emirim.favoritepet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener{
    CheckBox checkSelect;
    RadioGroup rg;
    RadioButton radioRapmon, radioJin, radioSuga, radioHope, radioJimin, radioV, radioKook;
    Button butOk;
    ImageView imgvMem;
    TextView textQuest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkSelect = (CheckBox) findViewById(R.id.check_select);
        textQuest = (TextView) findViewById(R.id.text_quest);
        rg = (RadioGroup) findViewById(R.id.rg);
        radioRapmon = (RadioButton) findViewById(R.id.radio_rapmon);
        radioJin = (RadioButton) findViewById(R.id.radio_jin);
        radioSuga = (RadioButton) findViewById(R.id.radio_suga);
        radioHope = (RadioButton) findViewById(R.id.radio_hope);
        radioJimin = (RadioButton) findViewById(R.id.radio_jimin);
        radioV = (RadioButton) findViewById(R.id.radio_V);
        radioKook = (RadioButton) findViewById(R.id.radio_kook);
        butOk = (Button) findViewById(R.id.but_ok);
        imgvMem = (ImageView) findViewById(R.id.imgv_mem);
        checkSelect.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if(checkSelect.isChecked()){
            textQuest.setVisibility(View.VISIBLE);
            rg.setVisibility(View.VISIBLE);
            butOk.setVisibility(View.VISIBLE);
            imgvMem.setVisibility(View.VISIBLE);
        } else{
            textQuest.setVisibility(View.INVISIBLE);
            rg.setVisibility(View.INVISIBLE);
            butOk.setVisibility(View.INVISIBLE);
            imgvMem.setVisibility(View.INVISIBLE);
        }
    }
}
