package com.google.android.gms.drive.query;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
import java.util.Locale;

public class SortOrder
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzb();
  final int mVersionCode;
  final List zzaud;
  final boolean zzaue;
  
  SortOrder(int paramInt, List paramList, boolean paramBoolean)
  {
    mVersionCode = paramInt;
    zzaud = paramList;
    zzaue = paramBoolean;
  }
  
  private SortOrder(List paramList, boolean paramBoolean)
  {
    this(1, paramList, paramBoolean);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    return String.format(Locale.US, "SortOrder[%s, %s]", new Object[] { TextUtils.join(",", zzaud), Boolean.valueOf(zzaue) });
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.query.SortOrder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */