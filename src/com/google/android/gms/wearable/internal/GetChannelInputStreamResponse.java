package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class GetChannelInputStreamResponse
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzaj();
  public final int statusCode;
  public final int versionCode;
  public final ParcelFileDescriptor zzbsC;
  
  GetChannelInputStreamResponse(int paramInt1, int paramInt2, ParcelFileDescriptor paramParcelFileDescriptor)
  {
    versionCode = paramInt1;
    statusCode = paramInt2;
    zzbsC = paramParcelFileDescriptor;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzaj.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.GetChannelInputStreamResponse
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */