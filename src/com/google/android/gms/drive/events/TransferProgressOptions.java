package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import java.util.Locale;

public final class TransferProgressOptions
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzo();
  final int mVersionCode;
  final int zzapT;
  
  TransferProgressOptions(int paramInt1, int paramInt2)
  {
    mVersionCode = paramInt1;
    zzapT = paramInt2;
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
    paramObject = (TransferProgressOptions)paramObject;
    return zzw.equal(Integer.valueOf(zzapT), Integer.valueOf(zzapT));
  }
  
  public final int hashCode()
  {
    return zzw.hashCode(new Object[] { Integer.valueOf(zzapT) });
  }
  
  public final String toString()
  {
    return String.format(Locale.US, "TransferProgressOptions[type=%d]", new Object[] { Integer.valueOf(zzapT) });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzo.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.events.TransferProgressOptions
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */