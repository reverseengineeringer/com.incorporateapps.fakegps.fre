package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import java.util.Locale;

public final class ChangesAvailableEvent
  implements SafeParcelable, DriveEvent
{
  public static final Parcelable.Creator CREATOR = new zzb();
  final int mVersionCode;
  final String zzVa;
  final ChangesAvailableOptions zzapy;
  
  ChangesAvailableEvent(int paramInt, String paramString, ChangesAvailableOptions paramChangesAvailableOptions)
  {
    mVersionCode = paramInt;
    zzVa = paramString;
    zzapy = paramChangesAvailableOptions;
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
      paramObject = (ChangesAvailableEvent)paramObject;
      if (!zzw.equal(zzapy, zzapy)) {
        break;
      }
      bool1 = bool2;
    } while (zzw.equal(zzVa, zzVa));
    return false;
  }
  
  public final int getType()
  {
    return 4;
  }
  
  public final int hashCode()
  {
    return zzw.hashCode(new Object[] { zzapy, zzVa });
  }
  
  public final String toString()
  {
    return String.format(Locale.US, "ChangesAvailableEvent [changesAvailableOptions=%s]", new Object[] { zzapy });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.events.ChangesAvailableEvent
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */