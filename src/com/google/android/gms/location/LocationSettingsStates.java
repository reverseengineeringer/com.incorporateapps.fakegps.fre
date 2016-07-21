package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.zzc;

public final class LocationSettingsStates
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzh();
  private final int mVersionCode;
  private final boolean zzaOj;
  private final boolean zzaOk;
  private final boolean zzaOl;
  private final boolean zzaOm;
  private final boolean zzaOn;
  private final boolean zzaOo;
  
  LocationSettingsStates(int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6)
  {
    mVersionCode = paramInt;
    zzaOj = paramBoolean1;
    zzaOk = paramBoolean2;
    zzaOl = paramBoolean3;
    zzaOm = paramBoolean4;
    zzaOn = paramBoolean5;
    zzaOo = paramBoolean6;
  }
  
  public static LocationSettingsStates fromIntent(Intent paramIntent)
  {
    return (LocationSettingsStates)zzc.zza(paramIntent, "com.google.android.gms.location.LOCATION_SETTINGS_STATES", CREATOR);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final int getVersionCode()
  {
    return mVersionCode;
  }
  
  public final boolean isBlePresent()
  {
    return zzaOo;
  }
  
  public final boolean isBleUsable()
  {
    return zzaOl;
  }
  
  public final boolean isGpsPresent()
  {
    return zzaOm;
  }
  
  public final boolean isGpsUsable()
  {
    return zzaOj;
  }
  
  public final boolean isLocationPresent()
  {
    return (zzaOm) || (zzaOn);
  }
  
  public final boolean isLocationUsable()
  {
    return (zzaOj) || (zzaOk);
  }
  
  public final boolean isNetworkLocationPresent()
  {
    return zzaOn;
  }
  
  public final boolean isNetworkLocationUsable()
  {
    return zzaOk;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzh.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.LocationSettingsStates
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */