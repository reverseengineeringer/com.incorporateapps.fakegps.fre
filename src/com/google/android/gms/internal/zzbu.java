package com.google.android.gms.internal;

import android.content.Context;
import android.os.Build.VERSION;
import com.google.android.gms.ads.internal.zzr;
import java.util.LinkedHashMap;
import java.util.Map;

public class zzbu
{
  private Context mContext = null;
  private String zzsy = null;
  private boolean zzxi;
  private String zzxj;
  private Map zzxk;
  
  public zzbu(Context paramContext, String paramString)
  {
    mContext = paramContext;
    zzsy = paramString;
    zzxi = ((Boolean)zzbt.zzwg.get()).booleanValue();
    zzxj = ((String)zzbt.zzwh.get());
    zzxk = new LinkedHashMap();
    zzxk.put("s", "gmob_sdk");
    zzxk.put("v", "3");
    zzxk.put("os", Build.VERSION.RELEASE);
    zzxk.put("sdk", Build.VERSION.SDK);
    zzxk.put("device", zzr.zzbC().zzht());
    paramString = zzxk;
    if (paramContext.getApplicationContext() != null) {}
    for (paramContext = paramContext.getApplicationContext().getPackageName();; paramContext = paramContext.getPackageName())
    {
      paramString.put("app", paramContext);
      paramContext = zzr.zzbI().zzE(mContext);
      zzxk.put("network_coarse", Integer.toString(zzKc));
      zzxk.put("network_fine", Integer.toString(zzKd));
      return;
    }
  }
  
  Context getContext()
  {
    return mContext;
  }
  
  String zzcs()
  {
    return zzsy;
  }
  
  boolean zzdu()
  {
    return zzxi;
  }
  
  String zzdv()
  {
    return zzxj;
  }
  
  Map zzdw()
  {
    return zzxk;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzbu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */