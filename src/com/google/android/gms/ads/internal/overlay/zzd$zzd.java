package com.google.android.gms.ads.internal.overlay;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import com.google.android.gms.ads.internal.InterstitialAdParameterParcel;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.internal.zzim;
import com.google.android.gms.internal.zzir;
import com.google.android.gms.internal.zzis;

class zzd$zzd
  extends zzim
{
  private zzd$zzd(zzd paramzzd) {}
  
  public void onStop() {}
  
  public void zzbr()
  {
    Object localObject = zzr.zzbC().zzf(zzd.zza(zzEv), zzEv.zzEh.zzEM.zzqn);
    if (localObject != null)
    {
      localObject = zzr.zzbE().zza(zzd.zza(zzEv), (Bitmap)localObject, zzEv.zzEh.zzEM.zzqo, zzEv.zzEh.zzEM.zzqp);
      zzir.zzMc.post(new zzd.zzd.1(this, (Drawable)localObject));
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.overlay.zzd.zzd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */