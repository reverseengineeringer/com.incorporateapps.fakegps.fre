package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zzq;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.wearable.MessageApi.MessageListener;

final class zzaz$zza
  extends zzi
{
  private zzq zzbbi;
  private MessageApi.MessageListener zzbsS;
  private IntentFilter[] zzbsT;
  
  private zzaz$zza(GoogleApiClient paramGoogleApiClient, MessageApi.MessageListener paramMessageListener, zzq paramzzq, IntentFilter[] paramArrayOfIntentFilter)
  {
    super(paramGoogleApiClient);
    zzbsS = ((MessageApi.MessageListener)zzx.zzz(paramMessageListener));
    zzbbi = ((zzq)zzx.zzz(paramzzq));
    zzbsT = ((IntentFilter[])zzx.zzz(paramArrayOfIntentFilter));
  }
  
  protected final void zza(zzbp paramzzbp)
  {
    paramzzbp.zza(this, zzbsS, zzbbi, zzbsT);
    zzbsS = null;
    zzbbi = null;
    zzbsT = null;
  }
  
  public final Status zzb(Status paramStatus)
  {
    zzbsS = null;
    zzbbi = null;
    zzbsT = null;
    return paramStatus;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.zzaz.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */