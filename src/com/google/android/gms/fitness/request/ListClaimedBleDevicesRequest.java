package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzpj;
import com.google.android.gms.internal.zzpj.zza;

public class ListClaimedBleDevicesRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzr();
  private final int mVersionCode;
  private final zzpj zzaBc;
  
  ListClaimedBleDevicesRequest(int paramInt, IBinder paramIBinder)
  {
    mVersionCode = paramInt;
    zzaBc = zzpj.zza.zzbT(paramIBinder);
  }
  
  public ListClaimedBleDevicesRequest(zzpj paramzzpj)
  {
    mVersionCode = 2;
    zzaBc = paramzzpj;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public IBinder getCallbackBinder()
  {
    return zzaBc.asBinder();
  }
  
  int getVersionCode()
  {
    return mVersionCode;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzr.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.request.ListClaimedBleDevicesRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */