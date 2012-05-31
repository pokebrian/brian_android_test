package br.com.teste1;

import android.content.Context;
import android.location.Address;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TableRow.LayoutParams;
import android.widget.TextView;

public class MyTableLayout extends TableLayout {

	public MyTableLayout(Context context) {
		super(context);
		
		for(int i = 0; i < 15; i++){
			TableRow tr = new TableRow(context);
			tr.setLayoutParams(new android.widget.TableRow.LayoutParams(android.widget.TableRow.LayoutParams.FILL_PARENT,
					android.widget.TableRow.LayoutParams.WRAP_CONTENT));
			/* Create a Button to be the row-content. */
			Button b1 = new Button(context);
			b1.setText("Dynamic Button");
			b1.setLayoutParams(new android.widget.TableRow.LayoutParams(android.widget.TableRow.LayoutParams.FILL_PARENT,
					android.widget.TableRow.LayoutParams.WRAP_CONTENT));
			
			/* Create a Button to be the row-content. */
			Button b2 = new Button(context);
			b2.setText("Dynamic Button");
			b2.setLayoutParams(new android.widget.TableRow.LayoutParams(android.widget.TableRow.LayoutParams.FILL_PARENT,
					android.widget.TableRow.LayoutParams.WRAP_CONTENT));
			
			/* Add Button to row. */
			tr.addView(b1);
			tr.addView(b2);
			/* Add row to TableLayout. */
			this.addView(tr, new android.widget.TableRow.LayoutParams(android.widget.TableRow.LayoutParams.FILL_PARENT,
					android.widget.TableRow.LayoutParams.WRAP_CONTENT));
		}
			
		
//		TableRow tr = new TableRow(context);
//		tr.setLayoutParams(new android.widget.TableRow.LayoutParams(android.widget.TableRow.LayoutParams.FILL_PARENT,
//				android.widget.TableRow.LayoutParams.WRAP_CONTENT));
//		/* Create a Button to be the row-content. */
//		Button b = new Button(context);
//		b.setText("Dynamic Button");
//		b.setLayoutParams(new android.widget.TableRow.LayoutParams(android.widget.TableRow.LayoutParams.FILL_PARENT,
//				android.widget.TableRow.LayoutParams.WRAP_CONTENT));
//		/* Add Button to row. */
//		tr.addView(b);
//		/* Add row to TableLayout. */
//		this.addView(tr, new android.widget.TableRow.LayoutParams(android.widget.TableRow.LayoutParams.FILL_PARENT,
//				android.widget.TableRow.LayoutParams.WRAP_CONTENT));
//		
		
		

	}

}
