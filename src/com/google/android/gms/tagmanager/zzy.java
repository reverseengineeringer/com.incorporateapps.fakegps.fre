package com.google.android.gms.tagmanager;

import android.util.Log;

public class zzy
  implements zzbh
{
  private int zzRB = 5;
  
  public void e(String paramString)
  {
    if (zzRB <= 6) {
      Log.e("GoogleTagManager", paramString);
    }
  }
  
  public void setLogLevel(int paramInt)
  {
    zzRB = paramInt;
  }
  
  public void v(String paramString)
  {
    if (zzRB <= 2) {
      Log.v("GoogleTagManager", paramString);
    }
  }
  
  public void zzaI(String paramString)
  {
    if (zzRB <= 3) {
      Log.d("GoogleTagManager", paramString);
    }
  }
  
  public void zzaJ(String paramString)
  {
    if (zzRB <= 4) {
      Log.i("GoogleTagManager", paramString);
    }
  }
  
  public void zzaK(String paramString)
  {
    if (zzRB <= 5) {
      Log.w("GoogleTagManager", paramString);
    }
  }
  
  public void zzb(String paramString, Throwable paramThrowable)
  {
    if (zzRB <= 6) {
      Log.e("GoogleTagManager", paramString, paramThrowable);
    }
  }
  
  public void zzd(String paramString, Throwable paramThrowable)
  {
    if (zzRB <= 5) {
      Log.w("GoogleTagManager", paramString, paramThrowable);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tagmanager.zzy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */