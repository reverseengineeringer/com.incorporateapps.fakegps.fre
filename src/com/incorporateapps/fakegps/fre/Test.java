package com.incorporateapps.fakegps.fre;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.os.Bundle;

public class Test
  extends Activity
{
  Context a;
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    a = this;
    new AlertDialog.Builder(this).setTitle(2131230877).setCancelable(false).setMessage(2131230878).setPositiveButton(2131230875, new aw(this)).setNegativeButton(2131230848, new ax(this)).create().show();
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
  }
}

/* Location:
 * Qualified Name:     com.incorporateapps.fakegps.fre.Test
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */