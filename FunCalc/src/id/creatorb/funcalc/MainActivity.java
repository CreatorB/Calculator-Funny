/*
 * Developer : CreatorB
 * FreeSite : www.creatorbportfolio.wordpress.com
 * Tutorial : www.creatorbnotes.blogspot.com
 * Ordered Application : www.jasaprogrammer.com
 */

package id.creatorb.funcalc;

import android.R.integer;
import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.preference.EditTextPreference;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {
/** Called when the activity is first created. */

EditText I1, I2, I3;
Button RTambah, RKurang, RKali, RBagi;
TextView jumlah;

public void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
Typeface creatorb = Typeface.createFromAsset(this.getAssets(),
		"fonts/Molle-Regular.ttf");
Typeface creatorB = Typeface.createFromAsset(this.getAssets(),
		"fonts/RacingSansOne-Regular.ttf");

I1 = (EditText)findViewById(R.id.I1);
((EditText) I1).setTypeface(creatorb);
I2 = (EditText)findViewById(R.id.I2);
((EditText) I2).setTypeface(creatorb);
jumlah = (TextView) findViewById(R.id.hasil);
((TextView) jumlah).setTypeface(creatorB);
RTambah = (Button)findViewById(R.id.RTambah);
RKurang = (Button)findViewById(R.id.RKurang);
RKali = (Button)findViewById(R.id.RKali);
RBagi = (Button)findViewById(R.id.RBagi);
RTambah.setOnClickListener(this);
RKurang.setOnClickListener(this);
RKali.setOnClickListener(this);
RBagi.setOnClickListener(this);
}
public void onClick(View v) {
// TODO Auto-generated method stub

int nilai1 = Integer.parseInt(I1.getText().toString());
int nilai2 = Integer.parseInt(I2.getText().toString());
switch (v.getId()) {
case R.id.RTambah:
jumlah.setText(Integer.toString(nilai1+nilai2));
break;
case R.id.RKurang:
jumlah.setText(Integer.toString(nilai1-nilai2));
break;
case R.id.RKali:
jumlah.setText(Integer.toString(nilai1*nilai2));
break;
case R.id.RBagi:
jumlah.setText(Integer.toString(nilai1/nilai2));
break;
default:
break;
}

}
}