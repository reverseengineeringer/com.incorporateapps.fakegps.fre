package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class RemoveListenerRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzbg();
  final int mVersionCode;
  public final zzaw zzbrB;
  
  RemoveListenerRequest(int paramInt, IBinder paramIBinder)
  {
    mVersionCode = paramInt;
    if (paramIBinder != null)
    {
      zzbrB = zzaw.zza.zzet(paramIBinder);
      return;
    }
    zzbrB = null;
  }
  
  public RemoveListenerRequest(zzaw paramzzaw)
  {
    mVersionCode = 1;
    zzbrB = paramzzaw;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzbg.zza(this, paramParcel, paramInt);
  }
  
  IBinder zzIy()
  {
    if (zzbrB == null) {
      return null;
    }
    return zzbrB.asBinder();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.RemoveListenerRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */