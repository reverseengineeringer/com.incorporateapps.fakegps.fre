package com.google.android.gms.ads.internal.request;

import android.content.Context;
import com.google.android.gms.internal.zzbm;
import com.google.android.gms.internal.zzbp;
import com.google.android.gms.internal.zzbt;
import com.google.android.gms.internal.zzhc;
import com.google.android.gms.internal.zzhd;
import com.google.android.gms.internal.zzji;

public final class zzd$zza
  extends zzd
{
  private final Context mContext;
  
  public zzd$zza(Context paramContext, zzji paramzzji, zzc.zza paramzza)
  {
    super(paramzzji, paramzza);
    mContext = paramContext;
  }
  
  public final void zzgr() {}
  
  public final zzj zzgs()
  {
    zzbm localzzbm = new zzbm((String)zzbt.zzvB.get());
    return zzhd.zza(mContext, localzzbm, zzhc.zzgA());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.request.zzd.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */