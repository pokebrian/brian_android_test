package br.com.teste1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Teste1Activity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.main);
        
        //MyFrameLayout myFrameLayout = new MyFrameLayout(this);
        //MyTableLayout myTableLayout = new MyTableLayout(this);
        
        MyLinearLayout myLinearLayout = new MyLinearLayout(this);

        setContentView(myLinearLayout);
    }
    
}