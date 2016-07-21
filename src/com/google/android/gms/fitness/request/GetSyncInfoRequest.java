package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzox;
import com.google.android.gms.internal.zzox.zza;

public class GetSyncInfoRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzp();
  private final int mVersionCode;
  private final zzox zzaBb;
  
  GetSyncInfoRequest(int paramInt, IBinder paramIBinder)
  {
    mVersionCode = paramInt;
    zzaBb = zzox.zza.zzbS(paramIBinder);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public IBinder getCallbackBinder()
  {
    return zzaBb.asBinder();
  }
  
  int getVersionCode()
  {
    return mVersionCode;
  }
  
  public String toString()
  {
    return String.format("GetSyncInfoRequest {%d, %s, %s}", new Object[] { Integer.valueOf(mVersionCode), zzaBb });
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzp.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.request.GetSyncInfoRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */