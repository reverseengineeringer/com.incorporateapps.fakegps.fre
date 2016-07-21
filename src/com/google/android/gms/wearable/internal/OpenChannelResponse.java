package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class OpenChannelResponse
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzbd();
  public final int statusCode;
  public final int versionCode;
  public final ChannelImpl zzbsc;
  
  OpenChannelResponse(int paramInt1, int paramInt2, ChannelImpl paramChannelImpl)
  {
    versionCode = paramInt1;
    statusCode = paramInt2;
    zzbsc = paramChannelImpl;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzbd.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.OpenChannelResponse
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */