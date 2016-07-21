package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.internal.zzov;
import com.google.android.gms.internal.zzov.zza;

public class SessionStopRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzab();
  private final String mName;
  private final int mVersionCode;
  private final zzov zzaBz;
  private final String zzaxk;
  
  SessionStopRequest(int paramInt, String paramString1, String paramString2, IBinder paramIBinder)
  {
    mVersionCode = paramInt;
    mName = paramString1;
    zzaxk = paramString2;
    zzaBz = zzov.zza.zzbQ(paramIBinder);
  }
  
  public SessionStopRequest(String paramString1, String paramString2, zzov paramzzov)
  {
    mVersionCode = 3;
    mName = paramString1;
    zzaxk = paramString2;
    zzaBz = paramzzov;
  }
  
  private boolean zzb(SessionStopRequest paramSessionStopRequest)
  {
    return (zzw.equal(mName, mName)) && (zzw.equal(zzaxk, zzaxk));
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return (paramObject == this) || (((paramObject instanceof SessionStopRequest)) && (zzb((SessionStopRequest)paramObject)));
  }
  
  public IBinder getCallbackBinder()
  {
    if (zzaBz == null) {
      return null;
    }
    return zzaBz.asBinder();
  }
  
  public String getIdentifier()
  {
    return zzaxk;
  }
  
  public String getName()
  {
    return mName;
  }
  
  int getVersionCode()
  {
    return mVersionCode;
  }
  
  public int hashCode()
  {
    return zzw.hashCode(new Object[] { mName, zzaxk });
  }
  
  public String toString()
  {
    return zzw.zzy(this).zzg("name", mName).zzg("identifier", zzaxk).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzab.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.request.SessionStopRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */