package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class PolylineOptions
  implements SafeParcelable
{
  public static final zzi CREATOR = new zzi();
  private int mColor = -16777216;
  private final int mVersionCode;
  private final List zzaTJ;
  private boolean zzaTL = false;
  private float zzaTh = 0.0F;
  private boolean zzaTi = true;
  private float zzaTm = 10.0F;
  private boolean zzaTr = false;
  
  public PolylineOptions()
  {
    mVersionCode = 1;
    zzaTJ = new ArrayList();
  }
  
  PolylineOptions(int paramInt1, List paramList, float paramFloat1, int paramInt2, float paramFloat2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    mVersionCode = paramInt1;
    zzaTJ = paramList;
    zzaTm = paramFloat1;
    mColor = paramInt2;
    zzaTh = paramFloat2;
    zzaTi = paramBoolean1;
    zzaTL = paramBoolean2;
    zzaTr = paramBoolean3;
  }
  
  public final PolylineOptions add(LatLng paramLatLng)
  {
    zzaTJ.add(paramLatLng);
    return this;
  }
  
  public final PolylineOptions add(LatLng... paramVarArgs)
  {
    zzaTJ.addAll(Arrays.asList(paramVarArgs));
    return this;
  }
  
  public final PolylineOptions addAll(Iterable paramIterable)
  {
    paramIterable = paramIterable.iterator();
    while (paramIterable.hasNext())
    {
      LatLng localLatLng = (LatLng)paramIterable.next();
      zzaTJ.add(localLatLng);
    }
    return this;
  }
  
  public final PolylineOptions clickable(boolean paramBoolean)
  {
    zzaTr = paramBoolean;
    return this;
  }
  
  public final PolylineOptions color(int paramInt)
  {
    mColor = paramInt;
    return this;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final PolylineOptions geodesic(boolean paramBoolean)
  {
    zzaTL = paramBoolean;
    return this;
  }
  
  public final int getColor()
  {
    return mColor;
  }
  
  public final List getPoints()
  {
    return zzaTJ;
  }
  
  final int getVersionCode()
  {
    return mVersionCode;
  }
  
  public final float getWidth()
  {
    return zzaTm;
  }
  
  public final float getZIndex()
  {
    return zzaTh;
  }
  
  public final boolean isClickable()
  {
    return zzaTr;
  }
  
  public final boolean isGeodesic()
  {
    return zzaTL;
  }
  
  public final boolean isVisible()
  {
    return zzaTi;
  }
  
  public final PolylineOptions visible(boolean paramBoolean)
  {
    zzaTi = paramBoolean;
    return this;
  }
  
  public final PolylineOptions width(float paramFloat)
  {
    zzaTm = paramFloat;
    return this;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzi.zza(this, paramParcel, paramInt);
  }
  
  public final PolylineOptions zIndex(float paramFloat)
  {
    zzaTh = paramFloat;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.maps.model.PolylineOptions
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */