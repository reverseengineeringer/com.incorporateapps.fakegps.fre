package com.google.android.gms.internal;

import android.text.TextUtils;

public class zzbw
{
  public zzbv zza(zzbu paramzzbu)
  {
    if (paramzzbu == null) {
      throw new IllegalArgumentException("CSI configuration can't be null. ");
    }
    if (!paramzzbu.zzdu())
    {
      zzin.v("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
      return null;
    }
    if (paramzzbu.getContext() == null) {
      throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
    }
    if (TextUtils.isEmpty(paramzzbu.zzcs())) {
      throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
    }
    return new zzbv(paramzzbu.getContext(), paramzzbu.zzcs(), paramzzbu.zzdv(), paramzzbu.zzdw());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzbw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */