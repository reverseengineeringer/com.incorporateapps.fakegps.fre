package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.wearable.Channel;
import com.google.android.gms.wearable.ChannelApi.ChannelListener;

public class ChannelImpl
  implements SafeParcelable, Channel
{
  public static final Parcelable.Creator CREATOR = new zzo();
  private final String mPath;
  final int mVersionCode;
  private final String zzVo;
  private final String zzbrb;
  
  ChannelImpl(int paramInt, String paramString1, String paramString2, String paramString3)
  {
    mVersionCode = paramInt;
    zzVo = ((String)zzx.zzz(paramString1));
    zzbrb = ((String)zzx.zzz(paramString2));
    mPath = ((String)zzx.zzz(paramString3));
  }
  
  private static zzb.zza zza(String paramString, IntentFilter[] paramArrayOfIntentFilter)
  {
    return new ChannelImpl.7(paramString, paramArrayOfIntentFilter);
  }
  
  public PendingResult addListener(GoogleApiClient paramGoogleApiClient, ChannelApi.ChannelListener paramChannelListener)
  {
    IntentFilter localIntentFilter = zzbn.zzgM("com.google.android.gms.wearable.CHANNEL_EVENT");
    return zzb.zza(paramGoogleApiClient, zza(zzVo, new IntentFilter[] { localIntentFilter }), paramChannelListener);
  }
  
  public PendingResult close(GoogleApiClient paramGoogleApiClient)
  {
    return paramGoogleApiClient.zza(new ChannelImpl.1(this, paramGoogleApiClient));
  }
  
  public PendingResult close(GoogleApiClient paramGoogleApiClient, int paramInt)
  {
    return paramGoogleApiClient.zza(new ChannelImpl.2(this, paramGoogleApiClient, paramInt));
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    do
    {
      return true;
      if (!(paramObject instanceof ChannelImpl)) {
        return false;
      }
      paramObject = (ChannelImpl)paramObject;
    } while ((zzVo.equals(zzVo)) && (zzw.equal(zzbrb, zzbrb)) && (zzw.equal(mPath, mPath)) && (mVersionCode == mVersionCode));
    return false;
  }
  
  public PendingResult getInputStream(GoogleApiClient paramGoogleApiClient)
  {
    return paramGoogleApiClient.zza(new ChannelImpl.3(this, paramGoogleApiClient));
  }
  
  public String getNodeId()
  {
    return zzbrb;
  }
  
  public PendingResult getOutputStream(GoogleApiClient paramGoogleApiClient)
  {
    return paramGoogleApiClient.zza(new ChannelImpl.4(this, paramGoogleApiClient));
  }
  
  public String getPath()
  {
    return mPath;
  }
  
  public String getToken()
  {
    return zzVo;
  }
  
  public int hashCode()
  {
    return zzVo.hashCode();
  }
  
  public PendingResult receiveFile(GoogleApiClient paramGoogleApiClient, Uri paramUri, boolean paramBoolean)
  {
    zzx.zzb(paramGoogleApiClient, "client is null");
    zzx.zzb(paramUri, "uri is null");
    return paramGoogleApiClient.zza(new ChannelImpl.5(this, paramGoogleApiClient, paramUri, paramBoolean));
  }
  
  public PendingResult removeListener(GoogleApiClient paramGoogleApiClient, ChannelApi.ChannelListener paramChannelListener)
  {
    zzx.zzb(paramGoogleApiClient, "client is null");
    zzx.zzb(paramChannelListener, "listener is null");
    return paramGoogleApiClient.zza(new zzl.zzb(paramGoogleApiClient, paramChannelListener, zzVo));
  }
  
  public PendingResult sendFile(GoogleApiClient paramGoogleApiClient, Uri paramUri)
  {
    return sendFile(paramGoogleApiClient, paramUri, 0L, -1L);
  }
  
  public PendingResult sendFile(GoogleApiClient paramGoogleApiClient, Uri paramUri, long paramLong1, long paramLong2)
  {
    zzx.zzb(paramGoogleApiClient, "client is null");
    zzx.zzb(zzVo, "token is null");
    zzx.zzb(paramUri, "uri is null");
    if (paramLong1 >= 0L)
    {
      bool = true;
      zzx.zzb(bool, "startOffset is negative: %s", new Object[] { Long.valueOf(paramLong1) });
      if ((paramLong2 < 0L) && (paramLong2 != -1L)) {
        break label113;
      }
    }
    label113:
    for (boolean bool = true;; bool = false)
    {
      zzx.zzb(bool, "invalid length: %s", new Object[] { Long.valueOf(paramLong2) });
      return paramGoogleApiClient.zza(new ChannelImpl.6(this, paramGoogleApiClient, paramUri, paramLong1, paramLong2));
      bool = false;
      break;
    }
  }
  
  public String toString()
  {
    return "ChannelImpl{versionCode=" + mVersionCode + ", token='" + zzVo + '\'' + ", nodeId='" + zzbrb + '\'' + ", path='" + mPath + '\'' + "}";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzo.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.ChannelImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */