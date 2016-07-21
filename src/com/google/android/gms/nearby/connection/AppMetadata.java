package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import java.util.List;

public final class AppMetadata
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzb();
  private final int mVersionCode;
  private final List zzbaZ;
  
  AppMetadata(int paramInt, List paramList)
  {
    mVersionCode = paramInt;
    zzbaZ = ((List)zzx.zzb(paramList, "Must specify application identifiers"));
    zzx.zza(paramList.size(), "Application identifiers cannot be empty");
  }
  
  public AppMetadata(List paramList)
  {
    this(1, paramList);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final List getAppIdentifiers()
  {
    return zzbaZ;
  }
  
  public final int getVersionCode()
  {
    return mVersionCode;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.connection.AppMetadata
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */