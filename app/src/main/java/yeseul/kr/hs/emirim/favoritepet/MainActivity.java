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
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener, View.OnClickListener{
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
        butOk.setOnClickListener(this);
    }//end onCreate

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

    @Override
    public void onClick(View v) {
        switch(rg.getCheckedRadioButtonId()){
            case R.id.radio_rapmon:
                imgvMem.setImageResource(R.drawable.rapmonster);
                break;
            case R.id.radio_jin:
                imgvMem.setImageResource(R.drawable.jin);
                break;
            case R.id.radio_suga:
                imgvMem.setImageResource(R.drawable.suga);
                break;
            case R.id.radio_hope:
                imgvMem.setImageResource(R.drawable.jhope);
                break;
            case R.id.radio_jimin:
                imgvMem.setImageResource(R.drawable.jimin);
                break;
            case R.id.radio_V:
                imgvMem.setImageResource(R.drawable.taehyung);
                break;
            case R.id.radio_kook:
                imgvMem.setImageResource(R.drawable.jungkook);
                break;
            default:
                Toast.makeText(this, "라디오버튼이 선택되지 않았습니다.", Toast.LENGTH_SHORT).show();
        }
    }
}
