package com.google.android.gms.maps.model;

import com.google.android.gms.common.internal.zzx;

public final class LatLngBounds$Builder
{
  private double zzaTu = Double.POSITIVE_INFINITY;
  private double zzaTv = Double.NEGATIVE_INFINITY;
  private double zzaTw = NaN.0D;
  private double zzaTx = NaN.0D;
  
  private boolean zzj(double paramDouble)
  {
    if (zzaTw <= zzaTx) {
      if ((zzaTw > paramDouble) || (paramDouble > zzaTx)) {}
    }
    while ((zzaTw <= paramDouble) || (paramDouble <= zzaTx))
    {
      return true;
      return false;
    }
    return false;
  }
  
  public final LatLngBounds build()
  {
    if (!Double.isNaN(zzaTw)) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zza(bool, "no included points");
      return new LatLngBounds(new LatLng(zzaTu, zzaTw), new LatLng(zzaTv, zzaTx));
    }
  }
  
  public final Builder include(LatLng paramLatLng)
  {
    zzaTu = Math.min(zzaTu, latitude);
    zzaTv = Math.max(zzaTv, latitude);
    double d = longitude;
    if (Double.isNaN(zzaTw)) {
      zzaTw = d;
    }
    do
    {
      zzaTx = d;
      do
      {
        return this;
      } while (zzj(d));
    } while (LatLngBounds.zzd(zzaTw, d) >= LatLngBounds.zze(zzaTx, d));
    zzaTw = d;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.maps.model.LatLngBounds.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */