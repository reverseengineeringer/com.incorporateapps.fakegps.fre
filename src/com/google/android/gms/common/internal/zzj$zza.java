package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

abstract class zzj$zza
  extends zzj.zzc
{
  public final int statusCode;
  public final Bundle zzalK;
  
  protected zzj$zza(zzj paramzzj, int paramInt, Bundle paramBundle)
  {
    super(paramzzj, Boolean.valueOf(true));
    statusCode = paramInt;
    zzalK = paramBundle;
  }
  
  protected void zzc(Boolean paramBoolean)
  {
    Object localObject = null;
    if (paramBoolean == null) {
      zzj.zza(zzalL, 1, null);
    }
    do
    {
      return;
      switch (statusCode)
      {
      default: 
        zzj.zza(zzalL, 1, null);
        paramBoolean = (Boolean)localObject;
        if (zzalK != null) {
          paramBoolean = (PendingIntent)zzalK.getParcelable("pendingIntent");
        }
        zzj(new ConnectionResult(statusCode, paramBoolean));
        return;
      }
    } while (zzqL());
    zzj.zza(zzalL, 1, null);
    zzj(new ConnectionResult(8, null));
    return;
    zzj.zza(zzalL, 1, null);
    throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
  }
  
  protected abstract void zzj(ConnectionResult paramConnectionResult);
  
  protected abstract boolean zzqL();
  
  protected void zzqM() {}
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.internal.zzj.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */