package com.google.android.gms.maps;

import android.graphics.Bitmap;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.maps.internal.zzab.zza;

class GoogleMap$10
  extends zzab.zza
{
  GoogleMap$10(GoogleMap paramGoogleMap, GoogleMap.SnapshotReadyCallback paramSnapshotReadyCallback) {}
  
  public void onSnapshotReady(Bitmap paramBitmap)
  {
    zzaRD.onSnapshotReady(paramBitmap);
  }
  
  public void zzr(zzd paramzzd)
  {
    zzaRD.onSnapshotReady((Bitmap)zze.zzp(paramzzd));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.maps.GoogleMap.10
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */