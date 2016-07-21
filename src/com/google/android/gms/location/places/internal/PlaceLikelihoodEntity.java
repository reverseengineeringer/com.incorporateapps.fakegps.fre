package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.PlaceLikelihood;

public class PlaceLikelihoodEntity
  implements SafeParcelable, PlaceLikelihood
{
  public static final Parcelable.Creator CREATOR = new zzm();
  final int mVersionCode;
  final PlaceImpl zzaQM;
  final float zzaQN;
  
  PlaceLikelihoodEntity(int paramInt, PlaceImpl paramPlaceImpl, float paramFloat)
  {
    mVersionCode = paramInt;
    zzaQM = paramPlaceImpl;
    zzaQN = paramFloat;
  }
  
  public static PlaceLikelihoodEntity zza(PlaceImpl paramPlaceImpl, float paramFloat)
  {
    return new PlaceLikelihoodEntity(0, (PlaceImpl)zzx.zzz(paramPlaceImpl), paramFloat);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof PlaceLikelihoodEntity)) {
        return false;
      }
      paramObject = (PlaceLikelihoodEntity)paramObject;
    } while ((zzaQM.equals(zzaQM)) && (zzaQN == zzaQN));
    return false;
  }
  
  public float getLikelihood()
  {
    return zzaQN;
  }
  
  public Place getPlace()
  {
    return zzaQM;
  }
  
  public int hashCode()
  {
    return zzw.hashCode(new Object[] { zzaQM, Float.valueOf(zzaQN) });
  }
  
  public boolean isDataValid()
  {
    return true;
  }
  
  public String toString()
  {
    return zzw.zzy(this).zzg("place", zzaQM).zzg("likelihood", Float.valueOf(zzaQN)).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzm.zza(this, paramParcel, paramInt);
  }
  
  public PlaceLikelihood zzzy()
  {
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.places.internal.PlaceLikelihoodEntity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */