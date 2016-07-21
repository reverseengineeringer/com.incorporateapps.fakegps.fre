package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.MessageEvent;

public class MessageEventParcelable
  implements SafeParcelable, MessageEvent
{
  public static final Parcelable.Creator CREATOR = new zzba();
  private final String mPath;
  final int mVersionCode;
  private final byte[] zzaKm;
  private final String zzaPI;
  private final int zzaox;
  
  MessageEventParcelable(int paramInt1, int paramInt2, String paramString1, byte[] paramArrayOfByte, String paramString2)
  {
    mVersionCode = paramInt1;
    zzaox = paramInt2;
    mPath = paramString1;
    zzaKm = paramArrayOfByte;
    zzaPI = paramString2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public byte[] getData()
  {
    return zzaKm;
  }
  
  public String getPath()
  {
    return mPath;
  }
  
  public int getRequestId()
  {
    return zzaox;
  }
  
  public String getSourceNodeId()
  {
    return zzaPI;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("MessageEventParcelable[").append(zzaox).append(",").append(mPath).append(", size=");
    if (zzaKm == null) {}
    for (Object localObject = "null";; localObject = Integer.valueOf(zzaKm.length)) {
      return localObject + "]";
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzba.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.MessageEventParcelable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */