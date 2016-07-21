package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.AdSizeParcel;

public class zzgp
  extends zzgn
{
  private zzgo zzGs;
  
  zzgp(Context paramContext, zzif.zza paramzza, zzjp paramzzjp, zzgr.zza paramzza1)
  {
    super(paramContext, paramzza, paramzzjp, paramzza1);
  }
  
  protected void zzgb()
  {
    Object localObject = zzpD.zzaN();
    int j;
    if (zzui)
    {
      localObject = mContext.getResources().getDisplayMetrics();
      j = widthPixels;
    }
    for (int i = heightPixels;; i = heightPixels)
    {
      zzGs = new zzgo(this, zzpD, j, i);
      zzpD.zzhU().zza(this);
      zzGs.zza(zzGe);
      return;
      j = widthPixels;
    }
  }
  
  protected int zzgc()
  {
    if (zzGs.zzgg())
    {
      zzin.zzaI("Ad-Network indicated no fill with passback URL.");
      return 3;
    }
    if (!zzGs.zzgh()) {
      return 2;
    }
    return -2;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzgp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */