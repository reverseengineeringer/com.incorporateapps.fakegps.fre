package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.zzw;
import java.util.List;

public final class TransferStateEvent
  implements DriveEvent
{
  public static final Parcelable.Creator CREATOR = new zzp();
  final int mVersionCode;
  final String zzVa;
  final List zzapU;
  
  TransferStateEvent(int paramInt, String paramString, List paramList)
  {
    mVersionCode = paramInt;
    zzVa = paramString;
    zzapU = paramList;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool2 = true;
    boolean bool1;
    if ((paramObject == null) || (paramObject.getClass() != getClass())) {
      bool1 = false;
    }
    do
    {
      do
      {
        return bool1;
        bool1 = bool2;
      } while (paramObject == this);
      paramObject = (TransferStateEvent)paramObject;
      if (!zzw.equal(zzVa, zzVa)) {
        break;
      }
      bool1 = bool2;
    } while (zzw.equal(zzapU, zzapU));
    return false;
  }
  
  public final int getType()
  {
    return 7;
  }
  
  public final int hashCode()
  {
    return zzw.hashCode(new Object[] { zzVa, zzapU });
  }
  
  public final String toString()
  {
    return String.format("TransferStateEvent[%s]", new Object[] { TextUtils.join("','", zzapU) });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzp.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.events.TransferStateEvent
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */