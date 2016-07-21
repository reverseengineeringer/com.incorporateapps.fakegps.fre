package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.drive.events.internal.TransferProgressData;

public final class TransferProgressEvent
  implements DriveEvent
{
  public static final Parcelable.Creator CREATOR = new zzn();
  final int mVersionCode;
  final TransferProgressData zzapS;
  
  TransferProgressEvent(int paramInt, TransferProgressData paramTransferProgressData)
  {
    mVersionCode = paramInt;
    zzapS = paramTransferProgressData;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject == null) || (paramObject.getClass() != getClass())) {
      return false;
    }
    if (paramObject == this) {
      return true;
    }
    paramObject = (TransferProgressEvent)paramObject;
    return zzw.equal(zzapS, zzapS);
  }
  
  public final int getType()
  {
    return 8;
  }
  
  public final int hashCode()
  {
    return zzw.hashCode(new Object[] { zzapS });
  }
  
  public final String toString()
  {
    return String.format("TransferProgressEvent[%s]", new Object[] { zzapS.toString() });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzn.zza(this, paramParcel, paramInt);
  }
  
  public final TransferProgressData zzta()
  {
    return zzapS;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.events.TransferProgressEvent
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */