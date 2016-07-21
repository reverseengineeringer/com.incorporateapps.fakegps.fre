package com.google.android.gms.ads.internal.formats;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzch.zza;

public class zzc
  extends zzch.zza
{
  private final Uri mUri;
  private final Drawable zzxU;
  private final double zzxV;
  
  public zzc(Drawable paramDrawable, Uri paramUri, double paramDouble)
  {
    zzxU = paramDrawable;
    mUri = paramUri;
    zzxV = paramDouble;
  }
  
  public double getScale()
  {
    return zzxV;
  }
  
  public Uri getUri()
  {
    return mUri;
  }
  
  public zzd zzdJ()
  {
    return zze.zzC(zzxU);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.formats.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */