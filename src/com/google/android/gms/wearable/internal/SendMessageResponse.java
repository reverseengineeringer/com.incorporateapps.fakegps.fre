package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class SendMessageResponse
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzbi();
  public final int statusCode;
  public final int versionCode;
  public final int zzaNj;
  
  SendMessageResponse(int paramInt1, int paramInt2, int paramInt3)
  {
    versionCode = paramInt1;
    statusCode = paramInt2;
    zzaNj = paramInt3;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzbi.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.SendMessageResponse
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */