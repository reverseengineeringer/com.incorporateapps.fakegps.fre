package com.google.android.gms.internal;

import android.content.Context;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.zzr;

final class zzhd$3
  implements Runnable
{
  zzhd$3(Context paramContext, AdRequestInfoParcel paramAdRequestInfoParcel, zzhf paramzzhf, zzcb paramzzcb, zzbz paramzzbz, String paramString, zzbm paramzzbm) {}
  
  public final void run()
  {
    zzjp localzzjp = zzr.zzbD().zza(zzxh, new AdSizeParcel(), false, false, null, zzIV.zzrl);
    if (zzr.zzbF().zzhi()) {
      localzzjp.clearCache(true);
    }
    localzzjp.getWebView().setWillNotDraw(true);
    zzIY.zzh(localzzjp);
    zzpt.zza(zzIZ, new String[] { "rwc" });
    Object localObject = zzpt.zzdB();
    localObject = zzhd.zzb(zzJa, zzpt, (zzbz)localObject);
    zzjq localzzjq = localzzjp.zzhU();
    localzzjq.zza("/invalidRequest", zzIY.zzJk);
    localzzjq.zza("/loadAdURL", zzIY.zzJl);
    localzzjq.zza("/log", zzde.zzzf);
    localzzjq.zza((zzjq.zza)localObject);
    zzin.zzaI("Loading the JS library.");
    localzzjp.loadUrl(zzJd.zzdp());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzhd.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */