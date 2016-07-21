package com.google.android.gms.games.multiplayer.realtime;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.zzx;

public final class RealTimeMessage
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new RealTimeMessage.1();
  public static final int RELIABLE = 1;
  public static final int UNRELIABLE = 0;
  private final String zzaJR;
  private final byte[] zzaJS;
  private final int zzaJT;
  
  private RealTimeMessage(Parcel paramParcel)
  {
    this(paramParcel.readString(), paramParcel.createByteArray(), paramParcel.readInt());
  }
  
  public RealTimeMessage(String paramString, byte[] paramArrayOfByte, int paramInt)
  {
    zzaJR = ((String)zzx.zzz(paramString));
    zzaJS = ((byte[])((byte[])zzx.zzz(paramArrayOfByte)).clone());
    zzaJT = paramInt;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final byte[] getMessageData()
  {
    return zzaJS;
  }
  
  public final String getSenderParticipantId()
  {
    return zzaJR;
  }
  
  public final boolean isReliable()
  {
    return zzaJT == 1;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(zzaJR);
    paramParcel.writeByteArray(zzaJS);
    paramParcel.writeInt(zzaJT);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.multiplayer.realtime.RealTimeMessage
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */