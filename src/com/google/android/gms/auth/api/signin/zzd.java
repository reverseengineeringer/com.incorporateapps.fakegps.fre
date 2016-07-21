package com.google.android.gms.auth.api.signin;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import com.google.android.gms.R.string;

public enum zzd
{
  private final String zzVY;
  private final String zzXj;
  private final int zzXk;
  
  private zzd(String paramString2, int paramInt1, String paramString3)
  {
    zzXj = paramString2;
    zzXk = paramInt1;
    zzVY = paramString3;
  }
  
  public static zzd zzbL(String paramString)
  {
    if (paramString != null)
    {
      zzd[] arrayOfzzd = values();
      int j = arrayOfzzd.length;
      int i = 0;
      while (i < j)
      {
        zzd localzzd = arrayOfzzd[i];
        if (localzzd.zzmT().equals(paramString)) {
          return localzzd;
        }
        i += 1;
      }
      Log.w("IdProvider", "Unrecognized providerId: " + paramString);
    }
    return null;
  }
  
  public final String toString()
  {
    return zzXj;
  }
  
  public final CharSequence zzae(Context paramContext)
  {
    return paramContext.getResources().getString(zzXk);
  }
  
  public final String zzmT()
  {
    return zzXj;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.api.signin.zzd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */