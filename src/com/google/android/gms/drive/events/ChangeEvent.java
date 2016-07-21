package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import java.util.Locale;

public final class ChangeEvent
  implements SafeParcelable, ResourceEvent
{
  public static final Parcelable.Creator CREATOR = new zza();
  final int mVersionCode;
  final DriveId zzaoz;
  final int zzapx;
  
  ChangeEvent(int paramInt1, DriveId paramDriveId, int paramInt2)
  {
    mVersionCode = paramInt1;
    zzaoz = paramDriveId;
    zzapx = paramInt2;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final DriveId getDriveId()
  {
    return zzaoz;
  }
  
  public final int getType()
  {
    return 1;
  }
  
  public final boolean hasBeenDeleted()
  {
    return (zzapx & 0x4) != 0;
  }
  
  public final boolean hasContentChanged()
  {
    return (zzapx & 0x2) != 0;
  }
  
  public final boolean hasMetadataChanged()
  {
    return (zzapx & 0x1) != 0;
  }
  
  public final String toString()
  {
    return String.format(Locale.US, "ChangeEvent [id=%s,changeFlags=%x]", new Object[] { zzaoz, Integer.valueOf(zzapx) });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.events.ChangeEvent
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */