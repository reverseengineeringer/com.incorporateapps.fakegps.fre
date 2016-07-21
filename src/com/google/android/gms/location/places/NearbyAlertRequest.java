package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import java.util.Set;

public final class NearbyAlertRequest
  implements SafeParcelable
{
  public static final zze CREATOR = new zze();
  private int mPriority = 110;
  private final int mVersionCode;
  private final int zzaNC;
  private final int zzaPr;
  private final PlaceFilter zzaPs;
  private final NearbyAlertFilter zzaPt;
  private final boolean zzaPu;
  private final int zzaPv;
  
  NearbyAlertRequest(int paramInt1, int paramInt2, int paramInt3, PlaceFilter paramPlaceFilter, NearbyAlertFilter paramNearbyAlertFilter, boolean paramBoolean, int paramInt4, int paramInt5)
  {
    mVersionCode = paramInt1;
    zzaNC = paramInt2;
    zzaPr = paramInt3;
    if (paramNearbyAlertFilter != null) {
      zzaPt = paramNearbyAlertFilter;
    }
    for (;;)
    {
      zzaPs = null;
      zzaPu = paramBoolean;
      zzaPv = paramInt4;
      mPriority = paramInt5;
      return;
      if (paramPlaceFilter != null)
      {
        if ((paramPlaceFilter.getPlaceIds() != null) && (!paramPlaceFilter.getPlaceIds().isEmpty())) {
          zzaPt = NearbyAlertFilter.zzh(paramPlaceFilter.getPlaceIds());
        } else if ((paramPlaceFilter.getPlaceTypes() != null) && (!paramPlaceFilter.getPlaceTypes().isEmpty())) {
          zzaPt = NearbyAlertFilter.zzi(paramPlaceFilter.getPlaceTypes());
        } else {
          zzaPt = null;
        }
      }
      else {
        zzaPt = null;
      }
    }
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
      if (!(paramObject instanceof NearbyAlertRequest)) {
        return false;
      }
      paramObject = (NearbyAlertRequest)paramObject;
    } while ((zzaNC == zzaNC) && (zzaPr == zzaPr) && (zzw.equal(zzaPt, zzaPt)) && (mPriority == mPriority));
    return false;
  }
  
  public final int getPriority()
  {
    return mPriority;
  }
  
  public final int getVersionCode()
  {
    return mVersionCode;
  }
  
  public final int hashCode()
  {
    return zzw.hashCode(new Object[] { Integer.valueOf(zzaNC), Integer.valueOf(zzaPr), zzaPt, Integer.valueOf(mPriority) });
  }
  
  public final String toString()
  {
    return zzw.zzy(this).zzg("transitionTypes", Integer.valueOf(zzaNC)).zzg("loiteringTimeMillis", Integer.valueOf(zzaPr)).zzg("nearbyAlertFilter", zzaPt).zzg("priority", Integer.valueOf(mPriority)).toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zze.zza(this, paramParcel, paramInt);
  }
  
  public final int zzyV()
  {
    return zzaNC;
  }
  
  public final int zzyY()
  {
    return zzaPr;
  }
  
  public final PlaceFilter zzyZ()
  {
    return null;
  }
  
  public final NearbyAlertFilter zzza()
  {
    return zzaPt;
  }
  
  public final boolean zzzb()
  {
    return zzaPu;
  }
  
  public final int zzzc()
  {
    return zzaPv;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.places.NearbyAlertRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */