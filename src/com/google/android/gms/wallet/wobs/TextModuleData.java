package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class TextModuleData
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzf();
  String body;
  private final int mVersionCode;
  String zzbqO;
  
  TextModuleData()
  {
    mVersionCode = 1;
  }
  
  TextModuleData(int paramInt, String paramString1, String paramString2)
  {
    mVersionCode = paramInt;
    zzbqO = paramString1;
    body = paramString2;
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
    zzf.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wallet.wobs.TextModuleData
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */