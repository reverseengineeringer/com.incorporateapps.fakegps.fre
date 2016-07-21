package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class UriData
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzh();
  String description;
  private final int mVersionCode;
  String zzbdg;
  
  UriData()
  {
    mVersionCode = 1;
  }
  
  UriData(int paramInt, String paramString1, String paramString2)
  {
    mVersionCode = paramInt;
    zzbdg = paramString1;
    description = paramString2;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final int getVersionCode()
  {
    return mVersionCode;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzh.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wallet.wobs.UriData
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */