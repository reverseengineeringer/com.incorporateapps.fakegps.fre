package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

public class zzjt$zza
  extends MutableContextWrapper
{
  private Activity zzMM;
  private Context zzOg;
  private Context zzsa;
  
  public zzjt$zza(Context paramContext)
  {
    super(paramContext);
    setBaseContext(paramContext);
  }
  
  public Object getSystemService(String paramString)
  {
    return zzOg.getSystemService(paramString);
  }
  
  public void setBaseContext(Context paramContext)
  {
    zzsa = paramContext.getApplicationContext();
    if ((paramContext instanceof Activity)) {}
    for (Activity localActivity = (Activity)paramContext;; localActivity = null)
    {
      zzMM = localActivity;
      zzOg = paramContext;
      super.setBaseContext(zzsa);
      return;
    }
  }
  
  public void startActivity(Intent paramIntent)
  {
    if ((zzMM != null) && (!zzne.isAtLeastL()))
    {
      zzMM.startActivity(paramIntent);
      return;
    }
    paramIntent.setFlags(268435456);
    zzsa.startActivity(paramIntent);
  }
  
  public Activity zzhP()
  {
    return zzMM;
  }
  
  public Context zzhQ()
  {
    return zzOg;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzjt.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */