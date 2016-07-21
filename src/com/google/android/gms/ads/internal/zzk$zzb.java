package com.google.android.gms.ads.internal;

import android.graphics.Bitmap;
import android.os.Handler;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.zzif;
import com.google.android.gms.internal.zzim;
import com.google.android.gms.internal.zzir;
import com.google.android.gms.internal.zzjp;

class zzk$zzb
  extends zzim
{
  private final String zzqg;
  private final Bitmap zzqi;
  
  public zzk$zzb(zzk paramzzk, Bitmap paramBitmap, String paramString)
  {
    zzqi = paramBitmap;
    zzqg = paramString;
  }
  
  public void onStop() {}
  
  public void zzbr()
  {
    boolean bool1;
    boolean bool2;
    boolean bool3;
    if (zzqh.zzpj.zzql)
    {
      bool1 = zzr.zzbC().zza(zzqh.zzpj.context, zzqi, zzqg);
      bool2 = zzqh.zzpj.zzql;
      bool3 = zzqh.zzbo();
      if (!bool1) {
        break label221;
      }
    }
    label221:
    for (Object localObject = zzqg;; localObject = null)
    {
      localObject = new InterstitialAdParameterParcel(bool2, bool3, (String)localObject, zzk.zza(zzqh), zzk.zzb(zzqh));
      int j = zzqh.zzpj.zzrq.zzED.getRequestedOrientation();
      int i = j;
      if (j == -1) {
        i = zzqh.zzpj.zzrq.orientation;
      }
      localObject = new AdOverlayInfoParcel(zzqh, zzqh, zzqh, zzqh.zzpj.zzrq.zzED, i, zzqh.zzpj.zzrl, zzqh.zzpj.zzrq.zzHY, (InterstitialAdParameterParcel)localObject);
      zzir.zzMc.post(new zzk.zzb.1(this, (AdOverlayInfoParcel)localObject));
      return;
      bool1 = false;
      break;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.zzk.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */