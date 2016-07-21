package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.util.Log;

public class zzqt
  implements zzqu.zza
{
  private final zzqu zzbdw;
  private boolean zzbdx;
  
  public zzqt(Context paramContext, int paramInt)
  {
    this(paramContext, paramInt, null);
  }
  
  public zzqt(Context paramContext, int paramInt, String paramString)
  {
    this(paramContext, paramInt, paramString, null, true);
  }
  
  public zzqt(Context paramContext, int paramInt, String paramString1, String paramString2, boolean paramBoolean)
  {
    if (paramContext != paramContext.getApplicationContext()) {}
    for (String str = paramContext.getClass().getName();; str = "OneTimePlayLogger")
    {
      zzbdw = new zzqu(paramContext, paramInt, paramString1, paramString2, this, paramBoolean, str);
      zzbdx = true;
      return;
    }
  }
  
  private void zzER()
  {
    if (!zzbdx) {
      throw new IllegalStateException("Cannot reuse one-time logger after sending.");
    }
  }
  
  public void send()
  {
    zzER();
    zzbdw.start();
    zzbdx = false;
  }
  
  public void zzES()
  {
    zzbdw.stop();
  }
  
  public void zzET()
  {
    Log.w("OneTimePlayLogger", "logger connection failed");
  }
  
  public void zza(String paramString, byte[] paramArrayOfByte, String... paramVarArgs)
  {
    zzER();
    zzbdw.zzb(paramString, paramArrayOfByte, paramVarArgs);
  }
  
  public void zzc(PendingIntent paramPendingIntent)
  {
    Log.w("OneTimePlayLogger", "logger connection failed: " + paramPendingIntent);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzqt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */