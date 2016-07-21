package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class StringListResponse
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzbw();
  private final int mVersionCode;
  private final List zzasD;
  
  StringListResponse(int paramInt, List paramList)
  {
    mVersionCode = paramInt;
    zzasD = paramList;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public int getVersionCode()
  {
    return mVersionCode;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzbw.zza(this, paramParcel, paramInt);
  }
  
  public List zztx()
  {
    return zzasD;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.StringListResponse
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */