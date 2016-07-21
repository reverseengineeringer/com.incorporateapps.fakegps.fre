package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

public final class LocationSettingsRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzf();
  private final int mVersionCode;
  private final List zzaBm;
  private final boolean zzaOf;
  private final boolean zzaOg;
  
  LocationSettingsRequest(int paramInt, List paramList, boolean paramBoolean1, boolean paramBoolean2)
  {
    mVersionCode = paramInt;
    zzaBm = paramList;
    zzaOf = paramBoolean1;
    zzaOg = paramBoolean2;
  }
  
  private LocationSettingsRequest(List paramList, boolean paramBoolean1, boolean paramBoolean2)
  {
    this(3, paramList, paramBoolean1, paramBoolean2);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final int getVersionCode()
  {
    return mVersionCode;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzf.zza(this, paramParcel, paramInt);
  }
  
  public final List zzuZ()
  {
    return Collections.unmodifiableList(zzaBm);
  }
  
  public final boolean zzyK()
  {
    return zzaOf;
  }
  
  public final boolean zzyL()
  {
    return zzaOg;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.LocationSettingsRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */