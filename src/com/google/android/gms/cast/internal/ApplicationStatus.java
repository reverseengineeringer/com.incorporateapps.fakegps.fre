package com.google.android.gms.cast.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;

public class ApplicationStatus
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zza();
  private final int mVersionCode;
  private String zzadp;
  
  public ApplicationStatus()
  {
    this(1, null);
  }
  
  ApplicationStatus(int paramInt, String paramString)
  {
    mVersionCode = paramInt;
    zzadp = paramString;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof ApplicationStatus)) {
      return false;
    }
    paramObject = (ApplicationStatus)paramObject;
    return zzf.zza(zzadp, zzadp);
  }
  
  public int getVersionCode()
  {
    return mVersionCode;
  }
  
  public int hashCode()
  {
    return zzw.hashCode(new Object[] { zzadp });
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(this, paramParcel, paramInt);
  }
  
  public String zzoe()
  {
    return zzadp;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.cast.internal.ApplicationStatus
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */