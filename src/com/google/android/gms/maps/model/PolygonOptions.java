package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class PolygonOptions
  implements SafeParcelable
{
  public static final zzh CREATOR = new zzh();
  private final int mVersionCode;
  private final List zzaTJ;
  private final List zzaTK;
  private boolean zzaTL = false;
  private float zzaTe = 10.0F;
  private int zzaTf = -16777216;
  private int zzaTg = 0;
  private float zzaTh = 0.0F;
  private boolean zzaTi = true;
  private boolean zzaTr = false;
  
  public PolygonOptions()
  {
    mVersionCode = 1;
    zzaTJ = new ArrayList();
    zzaTK = new ArrayList();
  }
  
  PolygonOptions(int paramInt1, List paramList1, List paramList2, float paramFloat1, int paramInt2, int paramInt3, float paramFloat2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    mVersionCode = paramInt1;
    zzaTJ = paramList1;
    zzaTK = paramList2;
    zzaTe = paramFloat1;
    zzaTf = paramInt2;
    zzaTg = paramInt3;
    zzaTh = paramFloat2;
    zzaTi = paramBoolean1;
    zzaTL = paramBoolean2;
    zzaTr = paramBoolean3;
  }
  
  public final PolygonOptions add(LatLng paramLatLng)
  {
    zzaTJ.add(paramLatLng);
    return this;
  }
  
  public final PolygonOptions add(LatLng... paramVarArgs)
  {
    zzaTJ.addAll(Arrays.asList(paramVarArgs));
    return this;
  }
  
  public final PolygonOptions addAll(Iterable paramIterable)
  {
    paramIterable = paramIterable.iterator();
    while (paramIterable.hasNext())
    {
      LatLng localLatLng = (LatLng)paramIterable.next();
      zzaTJ.add(localLatLng);
    }
    return this;
  }
  
  public final PolygonOptions addHole(Iterable paramIterable)
  {
    ArrayList localArrayList = new ArrayList();
    paramIterable = paramIterable.iterator();
    while (paramIterable.hasNext()) {
      localArrayList.add((LatLng)paramIterable.next());
    }
    zzaTK.add(localArrayList);
    return this;
  }
  
  public final PolygonOptions clickable(boolean paramBoolean)
  {
    zzaTr = paramBoolean;
    return this;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final PolygonOptions fillColor(int paramInt)
  {
    zzaTg = paramInt;
    return this;
  }
  
  public final PolygonOptions geodesic(boolean paramBoolean)
  {
    zzaTL = paramBoolean;
    return this;
  }
  
  public final int getFillColor()
  {
    return zzaTg;
  }
  
  public final List getHoles()
  {
    return zzaTK;
  }
  
  public final List getPoints()
  {
    return zzaTJ;
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
  
  public final PolygonOptions strokeColor(int paramInt)
  {
    zzaTf = paramInt;
    return this;
  }
  
  public final PolygonOptions strokeWidth(float paramFloat)
  {
    zzaTe = paramFloat;
    return this;
  }
  
  public final PolygonOptions visible(boolean paramBoolean)
  {
    zzaTi = paramBoolean;
    return this;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzh.zza(this, paramParcel, paramInt);
  }
  
  public final PolygonOptions zIndex(float paramFloat)
  {
    zzaTh = paramFloat;
    return this;
  }
  
  final List zzAl()
  {
    return zzaTK;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.maps.model.PolygonOptions
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */