package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;

public class GetConfigsResponse
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzap();
  public final int statusCode;
  public final int versionCode;
  public final ConnectionConfiguration[] zzbsH;
  
  GetConfigsResponse(int paramInt1, int paramInt2, ConnectionConfiguration[] paramArrayOfConnectionConfiguration)
  {
    versionCode = paramInt1;
    statusCode = paramInt2;
    zzbsH = paramArrayOfConnectionConfiguration;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzap.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.GetConfigsResponse
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */