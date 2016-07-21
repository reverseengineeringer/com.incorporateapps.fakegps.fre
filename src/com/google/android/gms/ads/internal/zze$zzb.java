package com.google.android.gms.ads.internal;

import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.zzif.zza;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzir;
import com.google.android.gms.internal.zzjp;

public class zze$zzb
  implements zze.zza
{
  private final zzif.zza zzpC;
  private final zzjp zzpD;
  
  public zze$zzb(zzif.zza paramzza, zzjp paramzzjp)
  {
    zzpC = paramzza;
    zzpD = paramzzjp;
  }
  
  public void zzr(String paramString)
  {
    zzin.zzaI("An auto-clicking creative is blocked");
    Uri.Builder localBuilder = new Uri.Builder();
    localBuilder.scheme("https");
    localBuilder.path("//pagead2.googlesyndication.com/pagead/gen_204");
    localBuilder.appendQueryParameter("id", "gmob-apps-blocked-navigation");
    if (!TextUtils.isEmpty(paramString)) {
      localBuilder.appendQueryParameter("navigationURL", paramString);
    }
    if ((zzpC != null) && (zzpC.zzLe != null) && (!TextUtils.isEmpty(zzpC.zzLe.zzHY))) {
      localBuilder.appendQueryParameter("debugDialog", zzpC.zzLe.zzHY);
    }
    zzr.zzbC().zzc(zzpD.getContext(), zzpD.zzhX().afmaVersion, localBuilder.toString());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.zze.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */