package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Locale;

public class FieldWithSortOrder
  implements SafeParcelable
{
  public static final zzc CREATOR = new zzc();
  final int mVersionCode;
  final String zzasF;
  final boolean zzauj;
  
  FieldWithSortOrder(int paramInt, String paramString, boolean paramBoolean)
  {
    mVersionCode = paramInt;
    zzasF = paramString;
    zzauj = paramBoolean;
  }
  
  public FieldWithSortOrder(String paramString, boolean paramBoolean)
  {
    this(1, paramString, paramBoolean);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    Locale localLocale = Locale.US;
    String str2 = zzasF;
    if (zzauj) {}
    for (String str1 = "ASC";; str1 = "DESC") {
      return String.format(localLocale, "FieldWithSortOrder[%s %s]", new Object[] { str2, str1 });
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzc.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.query.internal.FieldWithSortOrder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */