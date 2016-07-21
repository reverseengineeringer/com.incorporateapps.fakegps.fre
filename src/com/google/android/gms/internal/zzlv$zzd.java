package com.google.android.gms.internal;

import android.util.Log;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

final class zzlv$zzd
  extends zzlv.zzc
{
  private final LogEventParcelable zzafx;
  
  zzlv$zzd(zzlv paramzzlv, LogEventParcelable paramLogEventParcelable, GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
    zzafx = paramLogEventParcelable;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof zzd)) {
      return false;
    }
    paramObject = (zzd)paramObject;
    return zzafx.equals(zzafx);
  }
  
  public final String toString()
  {
    return "MethodImpl(" + zzafx + ")";
  }
  
  protected final void zza(zzlw paramzzlw)
  {
    zzlv.zzd.1 local1 = new zzlv.zzd.1(this);
    try
    {
      zzlv.zzb(zzafx);
      paramzzlw.zza(local1, zzafx);
      return;
    }
    catch (Throwable paramzzlw)
    {
      Log.e("ClearcutLoggerApiImpl", "MessageNanoProducer " + zzafx.zzafl.toString() + " threw: " + paramzzlw.toString());
    }
  }
  
  protected final Status zzb(Status paramStatus)
  {
    return paramStatus;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzlv.zzd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */