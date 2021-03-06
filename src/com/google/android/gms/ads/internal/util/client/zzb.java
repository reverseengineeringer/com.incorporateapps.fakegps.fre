package com.google.android.gms.ads.internal.util.client;

import android.util.Log;

public class zzb
{
  public static void e(String paramString)
  {
    if (zzQ(6)) {
      Log.e("Ads", paramString);
    }
  }
  
  public static boolean zzQ(int paramInt)
  {
    return (paramInt >= 5) || (Log.isLoggable("Ads", paramInt));
  }
  
  public static void zza(String paramString, Throwable paramThrowable)
  {
    if (zzQ(3)) {
      Log.d("Ads", paramString, paramThrowable);
    }
  }
  
  public static void zzaI(String paramString)
  {
    if (zzQ(3)) {
      Log.d("Ads", paramString);
    }
  }
  
  public static void zzaJ(String paramString)
  {
    if (zzQ(4)) {
      Log.i("Ads", paramString);
    }
  }
  
  public static void zzaK(String paramString)
  {
    if (zzQ(5)) {
      Log.w("Ads", paramString);
    }
  }
  
  public static void zzb(String paramString, Throwable paramThrowable)
  {
    if (zzQ(6)) {
      Log.e("Ads", paramString, paramThrowable);
    }
  }
  
  public static void zzc(String paramString, Throwable paramThrowable)
  {
    if (zzQ(4)) {
      Log.i("Ads", paramString, paramThrowable);
    }
  }
  
  public static void zzd(String paramString, Throwable paramThrowable)
  {
    if (zzQ(5)) {
      Log.w("Ads", paramString, paramThrowable);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.util.client.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */