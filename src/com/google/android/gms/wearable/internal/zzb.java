package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zzq;
import com.google.android.gms.common.internal.zzx;

final class zzb
  extends zzi
{
  private Object mListener;
  private zzq zzbbi;
  private zzb.zza zzbrA;
  
  private zzb(GoogleApiClient paramGoogleApiClient, Object paramObject, zzq paramzzq, zzb.zza paramzza)
  {
    super(paramGoogleApiClient);
    mListener = zzx.zzz(paramObject);
    zzbbi = ((zzq)zzx.zzz(paramzzq));
    zzbrA = ((zzb.zza)zzx.zzz(paramzza));
  }
  
  static PendingResult zza(GoogleApiClient paramGoogleApiClient, zzb.zza paramzza, Object paramObject)
  {
    return paramGoogleApiClient.zza(new zzb(paramGoogleApiClient, paramObject, paramGoogleApiClient.zzr(paramObject), paramzza));
  }
  
  protected final void zza(zzbp paramzzbp)
  {
    zzbrA.zza(paramzzbp, this, mListener, zzbbi);
    mListener = null;
    zzbbi = null;
  }
  
  protected final Status zzb(Status paramStatus)
  {
    mListener = null;
    zzbbi = null;
    return paramStatus;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */