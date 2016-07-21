package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;

public final class AppIdentifier
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zza();
  private final int mVersionCode;
  private final String zzaxk;
  
  AppIdentifier(int paramInt, String paramString)
  {
    mVersionCode = paramInt;
    zzaxk = zzx.zzh(paramString, "Missing application identifier value");
  }
  
  public AppIdentifier(String paramString)
  {
    this(1, paramString);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final String getIdentifier()
  {
    return zzaxk;
  }
  
  public final int getVersionCode()
  {
    return mVersionCode;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.connection.AppIdentifier
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */