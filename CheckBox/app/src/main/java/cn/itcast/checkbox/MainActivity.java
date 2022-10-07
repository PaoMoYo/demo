package cn.itcast.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import java.util.concurrent.Callable;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    private TextView hobby;
    private  String hobbys;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CheckBox shuttlecock = findViewById(R.id.like_shuttlecock);
        CheckBox basketball = findViewById(R.id.like_basketball);
        CheckBox pingpong = findViewById(R.id.like_pingpong);

        shuttlecock.setOnCheckedChangeListener(this);
        basketball.setOnCheckedChangeListener(this);
        pingpong.setOnCheckedChangeListener(this);

        hobby = findViewById(R.id.hobby);
        hobbys = new String();
        }


    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean b) {
        String motion = buttonView.getText().toString();
        if(b){
            if(!hobbys.contains(motion)){
                hobbys = hobbys +"   "+ motion;
                hobby.setText(hobbys);
            }
        }else{
            if (hobbys.contains(motion)){
                hobbys = hobbys.replace(motion,"");
                hobby.setText(hobbys);
            }
        }
    }
}