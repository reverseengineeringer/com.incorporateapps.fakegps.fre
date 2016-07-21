package com.google.android.gms.location;

import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class LocationResult
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zze();
  static final List zzaOd = ;
  private final int mVersionCode;
  private final List zzaOe;
  
  LocationResult(int paramInt, List paramList)
  {
    mVersionCode = paramInt;
    zzaOe = paramList;
  }
  
  public static LocationResult create(List paramList)
  {
    List localList = paramList;
    if (paramList == null) {
      localList = zzaOd;
    }
    return new LocationResult(2, localList);
  }
  
  public static LocationResult extractResult(Intent paramIntent)
  {
    if (!hasResult(paramIntent)) {
      return null;
    }
    return (LocationResult)paramIntent.getExtras().getParcelable("com.google.android.gms.location.EXTRA_LOCATION_RESULT");
  }
  
  public static boolean hasResult(Intent paramIntent)
  {
    if (paramIntent == null) {
      return false;
    }
    return paramIntent.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_RESULT");
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof LocationResult)) {
      return false;
    }
    paramObject = (LocationResult)paramObject;
    if (zzaOe.size() != zzaOe.size()) {
      return false;
    }
    paramObject = zzaOe.iterator();
    Iterator localIterator = zzaOe.iterator();
    while (((Iterator)paramObject).hasNext())
    {
      Location localLocation1 = (Location)localIterator.next();
      Location localLocation2 = (Location)((Iterator)paramObject).next();
      if (localLocation1.getTime() != localLocation2.getTime()) {
        return false;
      }
    }
    return true;
  }
  
  public final Location getLastLocation()
  {
    int i = zzaOe.size();
    if (i == 0) {
      return null;
    }
    return (Location)zzaOe.get(i - 1);
  }
  
  public final List getLocations()
  {
    return zzaOe;
  }
  
  final int getVersionCode()
  {
    return mVersionCode;
  }
  
  public final int hashCode()
  {
    Iterator localIterator = zzaOe.iterator();
    long l;
    for (int i = 17; localIterator.hasNext(); i = (int)(l ^ l >>> 32) + i * 31) {
      l = ((Location)localIterator.next()).getTime();
    }
    return i;
  }
  
  public final String toString()
  {
    return "LocationResult[locations: " + zzaOe + "]";
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zze.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.LocationResult
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */