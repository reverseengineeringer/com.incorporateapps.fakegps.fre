package com.google.android.gms.ads.internal.request;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzit;
import com.google.android.gms.internal.zzji;

public final class zzc
{
  public static zzit zza(Context paramContext, VersionInfoParcel paramVersionInfoParcel, zzji paramzzji, zzc.zza paramzza)
  {
    return zza(paramContext, paramVersionInfoParcel, paramzzji, paramzza, new zzc.1(paramContext));
  }
  
  static zzit zza(Context paramContext, VersionInfoParcel paramVersionInfoParcel, zzji paramzzji, zzc.zza paramzza, zzc.zzb paramzzb)
  {
    if (paramzzb.zza(paramVersionInfoParcel)) {
      return zza(paramContext, paramzzji, paramzza);
    }
    return zzb(paramContext, paramVersionInfoParcel, paramzzji, paramzza);
  }
  
  private static zzit zza(Context paramContext, zzji paramzzji, zzc.zza paramzza)
  {
    zzin.zzaI("Fetching ad response from local ad request service.");
    paramContext = new zzd.zza(paramContext, paramzzji, paramzza);
    paramContext.zzga();
    return paramContext;
  }
  
  private static zzit zzb(Context paramContext, VersionInfoParcel paramVersionInfoParcel, zzji paramzzji, zzc.zza paramzza)
  {
    zzin.zzaI("Fetching ad response from remote ad request service.");
    if (!zzn.zzcS().zzU(paramContext))
    {
      zzin.zzaK("Failed to connect to remote ad request service.");
      return null;
    }
    return new zzd.zzb(paramContext, paramVersionInfoParcel, paramzzji, paramzza);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.request.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */