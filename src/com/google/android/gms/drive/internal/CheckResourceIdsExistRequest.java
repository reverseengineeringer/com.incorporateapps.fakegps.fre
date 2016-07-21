package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class CheckResourceIdsExistRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzg();
  private final int mVersionCode;
  private final List zzaqi;
  
  CheckResourceIdsExistRequest(int paramInt, List paramList)
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
    zzg.zza(this, paramParcel, paramInt);
  }
  
  public List zztc()
  {
    return zzaqi;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.CheckResourceIdsExistRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */