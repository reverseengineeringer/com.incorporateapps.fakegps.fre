package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public final class ChangesAvailableOptions
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzd();
  final int mVersionCode;
  final boolean zzapA;
  final List zzapB;
  private final Set zzapC;
  final int zzapz;
  
  ChangesAvailableOptions(int paramInt1, int paramInt2, boolean paramBoolean, List paramList) {}
  
  private ChangesAvailableOptions(int paramInt1, int paramInt2, boolean paramBoolean, List paramList, Set paramSet)
  {
    mVersionCode = paramInt1;
    zzapz = paramInt2;
    zzapA = paramBoolean;
    zzapB = paramList;
    zzapC = paramSet;
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
      paramObject = (ChangesAvailableOptions)paramObject;
      if ((!zzw.equal(zzapC, zzapC)) || (zzapz != zzapz)) {
        break;
      }
      bool1 = bool2;
    } while (zzapA == zzapA);
    return false;
  }
  
  public final int hashCode()
  {
    return zzw.hashCode(new Object[] { zzapC, Integer.valueOf(zzapz), Boolean.valueOf(zzapA) });
  }
  
  public final String toString()
  {
    return String.format(Locale.US, "ChangesAvailableOptions[ChangesSizeLimit=%d, Repeats=%s, Spaces=%s]", new Object[] { Integer.valueOf(zzapz), Boolean.valueOf(zzapA), zzapB });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzd.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.events.ChangesAvailableOptions
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */