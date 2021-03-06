package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzd;
import com.google.android.gms.ads.internal.zzr;

public class zzjr
{
  public zzjp zza(Context paramContext, AdSizeParcel paramAdSizeParcel, boolean paramBoolean1, boolean paramBoolean2, zzan paramzzan, VersionInfoParcel paramVersionInfoParcel)
  {
    return zza(paramContext, paramAdSizeParcel, paramBoolean1, paramBoolean2, paramzzan, paramVersionInfoParcel, null, null);
  }
  
  public zzjp zza(Context paramContext, AdSizeParcel paramAdSizeParcel, boolean paramBoolean1, boolean paramBoolean2, zzan paramzzan, VersionInfoParcel paramVersionInfoParcel, zzcb paramzzcb, zzd paramzzd)
  {
    paramContext = new zzjs(zzjt.zzb(paramContext, paramAdSizeParcel, paramBoolean1, paramBoolean2, paramzzan, paramVersionInfoParcel, paramzzcb, paramzzd));
    paramContext.setWebViewClient(zzr.zzbE().zzb(paramContext, paramBoolean2));
    paramContext.setWebChromeClient(zzr.zzbE().zzk(paramContext));
    return paramContext;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzjr
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */