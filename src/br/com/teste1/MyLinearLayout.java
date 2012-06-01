package br.com.teste1;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MyLinearLayout extends LinearLayout {

	public MyLinearLayout(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		
		
		TextView tv = new TextView(context);
		tv.setText("texto 01");
		
		this.addView(tv);
		
		
		MyTableLayout tb = new MyTableLayout(context);
		this.addView(tb);
	}

}
