package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class TimeInterval
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzg();
  private final int mVersionCode;
  long zzbqP;
  long zzbqQ;
  
  TimeInterval()
  {
    mVersionCode = 1;
  }
  
  TimeInterval(int paramInt, long paramLong1, long paramLong2)
  {
    mVersionCode = paramInt;
    zzbqP = paramLong1;
    zzbqQ = paramLong2;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final int getVersionCode()
  {
    return mVersionCode;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzg.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wallet.wobs.TimeInterval
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */