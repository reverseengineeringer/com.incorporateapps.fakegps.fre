package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzow;
import com.google.android.gms.internal.zzow.zza;

public class StopBleScanRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzae();
  private final int mVersionCode;
  private final zzow zzaAD;
  private final zzq zzaBA;
  
  StopBleScanRequest(int paramInt, IBinder paramIBinder1, IBinder paramIBinder2)
  {
    mVersionCode = paramInt;
    zzaBA = zzq.zza.zzbU(paramIBinder1);
    zzaAD = zzow.zza.zzbR(paramIBinder2);
  }
  
  public StopBleScanRequest(BleScanCallback paramBleScanCallback, zzow paramzzow)
  {
    this(zza.zza.zzuJ().zzb(paramBleScanCallback), paramzzow);
  }
  
  public StopBleScanRequest(zzq paramzzq, zzow paramzzow)
  {
    mVersionCode = 3;
    zzaBA = paramzzq;
    zzaAD = paramzzow;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public IBinder getCallbackBinder()
  {
    if (zzaAD == null) {
      return null;
    }
    return zzaAD.asBinder();
  }
  
  int getVersionCode()
  {
    return mVersionCode;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzae.zza(this, paramParcel, paramInt);
  }
  
  public IBinder zzvg()
  {
    return zzaBA.asBinder();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.request.StopBleScanRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */