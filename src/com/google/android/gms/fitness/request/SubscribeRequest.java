package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.fitness.data.Subscription;
import com.google.android.gms.internal.zzow;
import com.google.android.gms.internal.zzow.zza;

public class SubscribeRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzaf();
  private final int mVersionCode;
  private final zzow zzaAD;
  private Subscription zzaBC;
  private final boolean zzaBD;
  
  SubscribeRequest(int paramInt, Subscription paramSubscription, boolean paramBoolean, IBinder paramIBinder)
  {
    mVersionCode = paramInt;
    zzaBC = paramSubscription;
    zzaBD = paramBoolean;
    zzaAD = zzow.zza.zzbR(paramIBinder);
  }
  
  public SubscribeRequest(Subscription paramSubscription, boolean paramBoolean, zzow paramzzow)
  {
    mVersionCode = 3;
    zzaBC = paramSubscription;
    zzaBD = paramBoolean;
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
  
  public String toString()
  {
    return zzw.zzy(this).zzg("subscription", zzaBC).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzaf.zza(this, paramParcel, paramInt);
  }
  
  public Subscription zzvh()
  {
    return zzaBC;
  }
  
  public boolean zzvi()
  {
    return zzaBD;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.request.SubscribeRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */