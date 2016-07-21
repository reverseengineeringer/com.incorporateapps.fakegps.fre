package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.ChannelApi.ChannelListener;

public final class ChannelEventParcelable
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzn();
  final int mVersionCode;
  final int type;
  final int zzbsa;
  final int zzbsb;
  final ChannelImpl zzbsc;
  
  ChannelEventParcelable(int paramInt1, ChannelImpl paramChannelImpl, int paramInt2, int paramInt3, int paramInt4)
  {
    mVersionCode = paramInt1;
    zzbsc = paramChannelImpl;
    type = paramInt2;
    zzbsa = paramInt3;
    zzbsb = paramInt4;
  }
  
  private static String zzlG(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return Integer.toString(paramInt);
    case 1: 
      return "CHANNEL_OPENED";
    case 2: 
      return "CHANNEL_CLOSED";
    case 4: 
      return "OUTPUT_CLOSED";
    }
    return "INPUT_CLOSED";
  }
  
  private static String zzlH(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return Integer.toString(paramInt);
    case 1: 
      return "CLOSE_REASON_DISCONNECTED";
    case 2: 
      return "CLOSE_REASON_REMOTE_CLOSE";
    case 3: 
      return "CLOSE_REASON_LOCAL_CLOSE";
    }
    return "CLOSE_REASON_NORMAL";
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final String toString()
  {
    return "ChannelEventParcelable[versionCode=" + mVersionCode + ", channel=" + zzbsc + ", type=" + zzlG(type) + ", closeReason=" + zzlH(zzbsa) + ", appErrorCode=" + zzbsb + "]";
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzn.zza(this, paramParcel, paramInt);
  }
  
  public final void zza(ChannelApi.ChannelListener paramChannelListener)
  {
    switch (type)
    {
    default: 
      Log.w("ChannelEventParcelable", "Unknown type: " + type);
      return;
    case 1: 
      paramChannelListener.onChannelOpened(zzbsc);
      return;
    case 2: 
      paramChannelListener.onChannelClosed(zzbsc, zzbsa, zzbsb);
      return;
    case 3: 
      paramChannelListener.onInputClosed(zzbsc, zzbsa, zzbsb);
      return;
    }
    paramChannelListener.onOutputClosed(zzbsc, zzbsa, zzbsb);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.ChannelEventParcelable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */