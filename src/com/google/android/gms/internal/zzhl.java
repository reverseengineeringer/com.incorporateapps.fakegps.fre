package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

public abstract class zzhl
{
  public abstract void zza(Context paramContext, zzhf paramzzhf, VersionInfoParcel paramVersionInfoParcel);
  
  protected void zze(zzhf paramzzhf)
  {
    paramzzhf.zzgD();
    if (paramzzhf.zzgB() != null) {
      paramzzhf.zzgB().release();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzhl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */