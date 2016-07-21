package com.google.android.gms.maps.internal;

import android.os.IInterface;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;

public abstract interface IProjectionDelegate
  extends IInterface
{
  public abstract LatLng fromScreenLocation(zzd paramzzd);
  
  public abstract VisibleRegion getVisibleRegion();
  
  public abstract zzd toScreenLocation(LatLng paramLatLng);
}

/* Location:
 * Qualified Name:     com.google.android.gms.maps.internal.IProjectionDelegate
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */