package com.google.android.gms.internal;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomClickListener;

public class zzcy
  extends zzct.zza
{
  private final NativeCustomTemplateAd.OnCustomClickListener zzyU;
  
  public zzcy(NativeCustomTemplateAd.OnCustomClickListener paramOnCustomClickListener)
  {
    zzyU = paramOnCustomClickListener;
  }
  
  public void zza(zzcp paramzzcp, String paramString)
  {
    zzyU.onCustomClick(new zzcq(paramzzcp), paramString);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzcy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */