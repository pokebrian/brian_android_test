package br.com.teste1;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.TableLayout;
import android.widget.TextView;

public class MyFrameLayout extends FrameLayout {

	public MyFrameLayout(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		
		TextView mTestText = new TextView(context);
        mTestText.setText("This is a test");
        
//        Button button = new Button(context);
//        button.setText("button");
        
//        CheckBox checkbox = new CheckBox(context);

        FrameLayout.LayoutParams lp = new FrameLayout.LayoutParams(
        		FrameLayout.LayoutParams.FILL_PARENT,
        		FrameLayout.LayoutParams.WRAP_CONTENT);
        lp.setMargins(10, 10, 10, 10);

        addView(mTestText, lp);
//        addView(button, lp);
//        addView(checkbox, lp);
        
		//addView(child, params)
	}
	
//	public void addViewTest(View view){
//		addView(view);
//	}

}
