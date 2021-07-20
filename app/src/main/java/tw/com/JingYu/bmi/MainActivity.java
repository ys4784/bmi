package tw.com.JingYu.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView result;        //用來顯示結果的元件
    private EditText weight,height; //讓使用者輸入資料



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //將佈局檔載入

        //定義佈局檔中的元件
        result = findViewById(R.id.result);
        weight = findViewById(R.id.userweight);
        height = findViewById(R.id.userheight);

    }

    //讓佈局檔呼叫的方法（權限必為public）
    public void bmiClick(View view){

        float userweight = Float.parseFloat(weight.getText().toString());
        float userheight = Float.parseFloat(height.getText().toString());
        float bmi = userweight / ((userheight / 100) * (userheight / 100));


        result.setText("結果：" + bmi);
    }
}