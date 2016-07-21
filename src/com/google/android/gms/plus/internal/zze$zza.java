package com.google.android.gms.plus.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.plus.Moments.LoadMomentsResult;
import com.google.android.gms.plus.model.moments.MomentBuffer;

final class zze$zza
  implements Moments.LoadMomentsResult
{
  private final Status zzUX;
  private final String zzbek;
  private final String zzbel;
  private final MomentBuffer zzbem;
  
  public zze$zza(Status paramStatus, DataHolder paramDataHolder, String paramString1, String paramString2)
  {
    zzUX = paramStatus;
    zzbek = paramString1;
    zzbel = paramString2;
    if (paramDataHolder != null) {}
    for (paramStatus = new MomentBuffer(paramDataHolder);; paramStatus = null)
    {
      zzbem = paramStatus;
      return;
    }
  }
  
  public final MomentBuffer getMomentBuffer()
  {
    return zzbem;
  }
  
  public final String getNextPageToken()
  {
    return zzbek;
  }
  
  public final Status getStatus()
  {
    return zzUX;
  }
  
  public final String getUpdated()
  {
    return zzbel;
  }
  
  public final void release()
  {
    if (zzbem != null) {
      zzbem.release();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.plus.internal.zze.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */