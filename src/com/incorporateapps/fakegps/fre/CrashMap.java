package com.incorporateapps.fakegps.fre;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.Editable;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class CrashMap
  extends Activity
{
  SharedPreferences.Editor a;
  SharedPreferences b;
  String c = "217953415";
  String d = "228596641";
  String e = "386497341";
  String f = "669202757";
  Context g;
  Intent h;
  EditText i;
  EditText j;
  
  protected final void a()
  {
    if ((!i.getText().toString().equals("")) && (!j.getText().toString().equals("")))
    {
      String str1 = i.getText().toString();
      String str2 = j.getText().toString();
      double d1 = Double.valueOf(str1).doubleValue();
      double d2 = Double.valueOf(str2).doubleValue();
      a.putFloat("CurrentLat", (float)d1);
      a.putFloat("CurrentLon", (float)d2);
      a.commit();
    }
    try
    {
      stopService(h);
      startService(h);
      finish();
      return;
      Toast.makeText(g, 2131230785, 1).show();
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  protected final void b()
  {
    String str = getPackageName().replace(".free", "");
    startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str)));
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    g = this;
    b = PreferenceManager.getDefaultSharedPreferences(g);
    a = b.edit();
    setContentView(2130903065);
    h = new Intent(g, MockGPSService.class);
    new LinearLayout(g);
    paramBundle = new DisplayMetrics();
    getWindowManager().getDefaultDisplay().getMetrics(paramBundle);
    int k = widthPixels;
    paramBundle = (LinearLayout)findViewById(2131361893);
    new LinearLayout(g);
    if ((k >= 468) && (k < 640))
    {
      c = "107612707";
      d = "517128541";
    }
    if ((k >= 640) && (k < 728)) {
      d = "566661413";
    }
    if (k >= 728)
    {
      d = "679802592";
      getLayoutParamsheight = 90;
      paramBundle.requestLayout();
    }
    i = ((EditText)findViewById(2131361903));
    j = ((EditText)findViewById(2131361901));
    float f1 = b.getFloat("CurrentLat", 0.0F);
    float f2 = b.getFloat("CurrentLon", 0.0F);
    if (f1 != 0.0F) {
      i.setText(Float.toString(f1));
    }
    if (f2 != 0.0F) {
      j.setText(Float.toString(f2));
    }
    ((Button)findViewById(2131361905)).setOnClickListener(new d(this));
    ((Button)findViewById(2131361906)).setOnClickListener(new e(this));
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
  }
}

/* Location:
 * Qualified Name:     com.incorporateapps.fakegps.fre.CrashMap
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */