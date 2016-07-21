package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;

public class MessageType
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzk();
  final int mVersionCode;
  public final String type;
  public final String zzamD;
  
  MessageType(int paramInt, String paramString1, String paramString2)
  {
    mVersionCode = paramInt;
    zzamD = paramString1;
    type = paramString2;
  }
  
  public MessageType(String paramString1, String paramString2)
  {
    this(1, paramString1, paramString2);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof MessageType)) {
        return false;
      }
      paramObject = (MessageType)paramObject;
    } while ((zzw.equal(zzamD, zzamD)) && (zzw.equal(type, type)));
    return false;
  }
  
  public int hashCode()
  {
    return zzw.hashCode(new Object[] { zzamD, type });
  }
  
  public String toString()
  {
    return "namespace=" + zzamD + ", type=" + type;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzk.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.messages.internal.MessageType
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */