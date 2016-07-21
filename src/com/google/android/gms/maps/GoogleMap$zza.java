package com.google.android.gms.maps;

import com.google.android.gms.maps.internal.zzb.zza;

final class GoogleMap$zza
  extends zzb.zza
{
  private final GoogleMap.CancelableCallback zzaRO;
  
  GoogleMap$zza(GoogleMap.CancelableCallback paramCancelableCallback)
  {
    zzaRO = paramCancelableCallback;
  }
  
  public final void onCancel()
  {
    zzaRO.onCancel();
  }
  
  public final void onFinish()
  {
    zzaRO.onFinish();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.maps.GoogleMap.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */