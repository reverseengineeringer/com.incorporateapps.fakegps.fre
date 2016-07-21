package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import java.util.concurrent.TimeUnit;

public final class PlaceRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzk();
  static final long zzaPJ = TimeUnit.HOURS.toMillis(1L);
  private final int mPriority;
  final int mVersionCode;
  private final long zzaND;
  private final long zzaNY;
  private final PlaceFilter zzaPK;
  
  public PlaceRequest(int paramInt1, PlaceFilter paramPlaceFilter, long paramLong1, int paramInt2, long paramLong2)
  {
    mVersionCode = paramInt1;
    zzaPK = paramPlaceFilter;
    zzaNY = paramLong1;
    mPriority = paramInt2;
    zzaND = paramLong2;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof PlaceRequest)) {
        return false;
      }
      paramObject = (PlaceRequest)paramObject;
    } while ((zzw.equal(zzaPK, zzaPK)) && (zzaNY == zzaNY) && (mPriority == mPriority) && (zzaND == zzaND));
    return false;
  }
  
  public final long getExpirationTime()
  {
    return zzaND;
  }
  
  public final long getInterval()
  {
    return zzaNY;
  }
  
  public final int getPriority()
  {
    return mPriority;
  }
  
  public final int hashCode()
  {
    return zzw.hashCode(new Object[] { zzaPK, Long.valueOf(zzaNY), Integer.valueOf(mPriority), Long.valueOf(zzaND) });
  }
  
  public final String toString()
  {
    return zzw.zzy(this).zzg("filter", zzaPK).zzg("interval", Long.valueOf(zzaNY)).zzg("priority", Integer.valueOf(mPriority)).zzg("expireAt", Long.valueOf(zzaND)).toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzk.zza(this, paramParcel, paramInt);
  }
  
  public final PlaceFilter zzyZ()
  {
    return zzaPK;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.places.PlaceRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */