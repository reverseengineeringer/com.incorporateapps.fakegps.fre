package com.google.android.gms.ads.internal.reward.client;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class RewardedVideoAdRequestParcel
  implements SafeParcelable
{
  public static final zzh CREATOR = new zzh();
  public final int versionCode;
  public final AdRequestParcel zzHt;
  public final String zzrj;
  
  public RewardedVideoAdRequestParcel(int paramInt, AdRequestParcel paramAdRequestParcel, String paramString)
  {
    versionCode = paramInt;
    zzHt = paramAdRequestParcel;
    zzrj = paramString;
  }
  
  public RewardedVideoAdRequestParcel(AdRequestParcel paramAdRequestParcel, String paramString)
  {
    this(1, paramAdRequestParcel, paramString);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzh.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.reward.client.RewardedVideoAdRequestParcel
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */