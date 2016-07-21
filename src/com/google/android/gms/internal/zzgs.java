package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.zzr;

public class zzgs
  extends zzgn
  implements zzjq.zza
{
  zzgs(Context paramContext, zzif.zza paramzza, zzjp paramzzjp, zzgr.zza paramzza1)
  {
    super(paramContext, paramzza, paramzzjp, paramzza1);
  }
  
  protected void zzgb()
  {
    if (zzGe.errorCode != -2) {
      return;
    }
    zzpD.zzhU().zza(this);
    zzgi();
    zzin.zzaI("Loading HTML in WebView.");
    zzpD.loadDataWithBaseURL(zzr.zzbC().zzaC(zzGe.zzEF), zzGe.body, "text/html", "UTF-8", null);
  }
  
  protected void zzgi() {}
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzgs
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */