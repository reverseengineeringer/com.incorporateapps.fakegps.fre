package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzp;

public class zzgr
{
  public zzit zza(Context paramContext, zza paramzza, zzif.zza paramzza1, zzan paramzzan, zzjp paramzzjp, zzex paramzzex, zzgr.zza paramzza2, zzcb paramzzcb)
  {
    AdResponseParcel localAdResponseParcel = zzLe;
    if (zzHT) {
      paramContext = new zzgu(paramContext, paramzza1, paramzzex, paramzza2, paramzzcb, paramzzjp);
    }
    for (;;)
    {
      zzin.zzaI("AdRenderer: " + paramContext.getClass().getName());
      paramContext.zzgd();
      return paramContext;
      if (zzuk)
      {
        if ((paramzza instanceof zzp))
        {
          paramContext = new zzgv(paramContext, (zzp)paramzza, new zzee(), paramzza1, paramzzan, paramzza2);
        }
        else
        {
          paramzza1 = new StringBuilder("Invalid NativeAdManager type. Found: ");
          if (paramzza != null) {}
          for (paramContext = paramzza.getClass().getName();; paramContext = "null") {
            throw new IllegalArgumentException(paramContext + "; Required: NativeAdManager.");
          }
        }
      }
      else if (zzHZ) {
        paramContext = new zzgp(paramContext, paramzza1, paramzzjp, paramzza2);
      } else if ((((Boolean)zzbt.zzwu.get()).booleanValue()) && (zzne.zzsk()) && (!zzne.isAtLeastL()) && (zzaNzzui)) {
        paramContext = new zzgt(paramContext, paramzza1, paramzzjp, paramzza2);
      } else {
        paramContext = new zzgs(paramContext, paramzza1, paramzzjp, paramzza2);
      }
    }
  }
  
  public zzit zza(Context paramContext, String paramString, zzif.zza paramzza, zzht paramzzht)
  {
    paramContext = new zzhz(paramContext, paramString, paramzza, paramzzht);
    zzin.zzaI("AdRenderer: " + paramContext.getClass().getName());
    paramContext.zzgd();
    return paramContext;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzgr
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */