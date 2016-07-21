package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class CircleOptions
  implements SafeParcelable
{
  public static final zzb CREATOR = new zzb();
  private final int mVersionCode;
  private LatLng zzaTc = null;
  private double zzaTd = 0.0D;
  private float zzaTe = 10.0F;
  private int zzaTf = -16777216;
  private int zzaTg = 0;
  private float zzaTh = 0.0F;
  private boolean zzaTi = true;
  
  public CircleOptions()
  {
    mVersionCode = 1;
  }
  
  CircleOptions(int paramInt1, LatLng paramLatLng, double paramDouble, float paramFloat1, int paramInt2, int paramInt3, float paramFloat2, boolean paramBoolean)
  {
    mVersionCode = paramInt1;
    zzaTc = paramLatLng;
    zzaTd = paramDouble;
    zzaTe = paramFloat1;
    zzaTf = paramInt2;
    zzaTg = paramInt3;
    zzaTh = paramFloat2;
    zzaTi = paramBoolean;
  }
  
  public final CircleOptions center(LatLng paramLatLng)
  {
    zzaTc = paramLatLng;
    return this;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final CircleOptions fillColor(int paramInt)
  {
    zzaTg = paramInt;
    return this;
  }
  
  public final LatLng getCenter()
  {
    return zzaTc;
  }
  
  public final int getFillColor()
  {
    return zzaTg;
  }
  
  public final double getRadius()
  {
    return zzaTd;
  }
  
  public final int getStrokeColor()
  {
    return zzaTf;
  }
  
  public final float getStrokeWidth()
  {
    return zzaTe;
  }
  
  final int getVersionCode()
  {
    return mVersionCode;
  }
  
  public final float getZIndex()
  {
    return zzaTh;
  }
  
  public final boolean isVisible()
  {
    return zzaTi;
  }
  
  public final CircleOptions radius(double paramDouble)
  {
    zzaTd = paramDouble;
    return this;
  }
  
  public final CircleOptions strokeColor(int paramInt)
  {
    zzaTf = paramInt;
    return this;
  }
  
  public final CircleOptions strokeWidth(float paramFloat)
  {
    zzaTe = paramFloat;
    return this;
  }
  
  public final CircleOptions visible(boolean paramBoolean)
  {
    zzaTi = paramBoolean;
    return this;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(this, paramParcel, paramInt);
  }
  
  public final CircleOptions zIndex(float paramFloat)
  {
    zzaTh = paramFloat;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.maps.model.CircleOptions
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */