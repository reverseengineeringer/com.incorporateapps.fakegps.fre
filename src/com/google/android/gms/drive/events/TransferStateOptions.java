package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public final class TransferStateOptions
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzr();
  final int mVersionCode;
  final List zzapB;
  private final Set zzapC;
  
  TransferStateOptions(int paramInt, List paramList) {}
  
  private TransferStateOptions(int paramInt, List paramList, Set paramSet)
  {
    mVersionCode = paramInt;
    zzapB = paramList;
    zzapC = paramSet;
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
    paramObject = (TransferStateOptions)paramObject;
    return zzw.equal(zzapC, zzapC);
  }
  
  public final int hashCode()
  {
    return zzw.hashCode(new Object[] { zzapC });
  }
  
  public final String toString()
  {
    return String.format(Locale.US, "TransferStateOptions[Spaces=%s]", new Object[] { zzapB });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzr.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.events.TransferStateOptions
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */