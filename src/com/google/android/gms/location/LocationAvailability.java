package com.google.android.gms.location;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;

public final class LocationAvailability
  implements SafeParcelable
{
  public static final LocationAvailabilityCreator CREATOR = new LocationAvailabilityCreator();
  private final int mVersionCode;
  int zzaNU;
  int zzaNV;
  long zzaNW;
  int zzaNX;
  
  LocationAvailability(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong)
  {
    mVersionCode = paramInt1;
    zzaNX = paramInt2;
    zzaNU = paramInt3;
    zzaNV = paramInt4;
    zzaNW = paramLong;
  }
  
  public static LocationAvailability extractLocationAvailability(Intent paramIntent)
  {
    if (!hasLocationAvailability(paramIntent)) {
      return null;
    }
    return (LocationAvailability)paramIntent.getExtras().getParcelable("com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY");
  }
  
  public static boolean hasLocationAvailability(Intent paramIntent)
  {
    if (paramIntent == null) {
      return false;
    }
    return paramIntent.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY");
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof LocationAvailability)) {}
    do
    {
      return false;
      paramObject = (LocationAvailability)paramObject;
    } while ((zzaNX != zzaNX) || (zzaNU != zzaNU) || (zzaNV != zzaNV) || (zzaNW != zzaNW));
    return true;
  }
  
  final int getVersionCode()
  {
    return mVersionCode;
  }
  
  public final int hashCode()
  {
    return zzw.hashCode(new Object[] { Integer.valueOf(zzaNX), Integer.valueOf(zzaNU), Integer.valueOf(zzaNV), Long.valueOf(zzaNW) });
  }
  
  public final boolean isLocationAvailable()
  {
    return zzaNX < 1000;
  }
  
  public final String toString()
  {
    return "LocationAvailability[isLocationAvailable: " + isLocationAvailable() + "]";
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    LocationAvailabilityCreator.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.LocationAvailability
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */