package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class AddListenerRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzc();
  final int mVersionCode;
  public final zzaw zzbrB;
  public final IntentFilter[] zzbrC;
  public final String zzbrD;
  public final String zzbrE;
  
  AddListenerRequest(int paramInt, IBinder paramIBinder, IntentFilter[] paramArrayOfIntentFilter, String paramString1, String paramString2)
  {
    mVersionCode = paramInt;
    if (paramIBinder != null) {}
    for (zzbrB = zzaw.zza.zzet(paramIBinder);; zzbrB = null)
    {
      zzbrC = paramArrayOfIntentFilter;
      zzbrD = paramString1;
      zzbrE = paramString2;
      return;
    }
  }
  
  public AddListenerRequest(zzbq paramzzbq)
  {
    mVersionCode = 1;
    zzbrB = paramzzbq;
    zzbrC = paramzzbq.zzIO();
    zzbrD = paramzzbq.zzIP();
    zzbrE = null;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzc.zza(this, paramParcel, paramInt);
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
 * Qualified Name:     com.google.android.gms.wearable.internal.AddListenerRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */