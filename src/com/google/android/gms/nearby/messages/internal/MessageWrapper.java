package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.nearby.messages.Message;

public class MessageWrapper
  implements SafeParcelable
{
  public static final zzl CREATOR = new zzl();
  final int mVersionCode;
  public final Message zzbcu;
  
  MessageWrapper(int paramInt, Message paramMessage)
  {
    mVersionCode = paramInt;
    zzbcu = ((Message)zzx.zzz(paramMessage));
  }
  
  public static final MessageWrapper zzb(Message paramMessage)
  {
    return new MessageWrapper(1, paramMessage);
  }
  
  public int describeContents()
  {
    zzl localzzl = CREATOR;
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof MessageWrapper)) {
      return false;
    }
    paramObject = (MessageWrapper)paramObject;
    return zzw.equal(zzbcu, zzbcu);
  }
  
  public int hashCode()
  {
    return zzw.hashCode(new Object[] { zzbcu });
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzl localzzl = CREATOR;
    zzl.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.messages.internal.MessageWrapper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */