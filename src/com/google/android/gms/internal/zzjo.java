package com.google.android.gms.internal;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.google.android.gms.ads.internal.overlay.zzk;
import com.google.android.gms.common.internal.zzx;

public class zzjo
{
  private final Context mContext;
  private zzk zzFo;
  private final ViewGroup zzNx;
  private final zzjp zzpD;
  
  public zzjo(Context paramContext, ViewGroup paramViewGroup, zzjp paramzzjp)
  {
    this(paramContext, paramViewGroup, paramzzjp, null);
  }
  
  zzjo(Context paramContext, ViewGroup paramViewGroup, zzjp paramzzjp, zzk paramzzk)
  {
    mContext = paramContext;
    zzNx = paramViewGroup;
    zzpD = paramzzjp;
    zzFo = paramzzk;
  }
  
  public void onDestroy()
  {
    zzx.zzcD("onDestroy must be called from the UI thread.");
    if (zzFo != null) {
      zzFo.destroy();
    }
  }
  
  public void onPause()
  {
    zzx.zzcD("onPause must be called from the UI thread.");
    if (zzFo != null) {
      zzFo.pause();
    }
  }
  
  public void zza(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    if (zzFo != null) {
      return;
    }
    zzbx.zza(zzpD.zzic().zzdA(), zzpD.zzib(), new String[] { "vpr" });
    zzbz localzzbz = zzbx.zzb(zzpD.zzic().zzdA());
    zzFo = new zzk(mContext, zzpD, paramInt5, zzpD.zzic().zzdA(), localzzbz);
    zzNx.addView(zzFo, 0, new ViewGroup.LayoutParams(-1, -1));
    zzFo.zzd(paramInt1, paramInt2, paramInt3, paramInt4);
    zzpD.zzhU().zzG(false);
  }
  
  public void zze(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    zzx.zzcD("The underlay may only be modified from the UI thread.");
    if (zzFo != null) {
      zzFo.zzd(paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  
  public zzk zzhM()
  {
    zzx.zzcD("getAdVideoUnderlay must be called from the UI thread.");
    return zzFo;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzjo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */