package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class OnResourceIdSetResponse
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzbh();
  private final int mVersionCode;
  private final List zzaqi;
  
  OnResourceIdSetResponse(int paramInt, List paramList)
  {
    mVersionCode = paramInt;
    zzaqi = paramList;
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
    zzbh.zza(this, paramParcel, paramInt);
  }
  
  public List zztc()
  {
    return zzaqi;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.OnResourceIdSetResponse
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */