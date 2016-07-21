package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzot;
import com.google.android.gms.internal.zzot.zza;
import java.util.List;

public class ReadStatsRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzu();
  private final int mVersionCode;
  private final List zzaAF;
  private final zzot zzaBg;
  
  ReadStatsRequest(int paramInt, IBinder paramIBinder, List paramList)
  {
    mVersionCode = paramInt;
    zzaBg = zzot.zza.zzbO(paramIBinder);
    zzaAF = paramList;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public IBinder getCallbackBinder()
  {
    return zzaBg.asBinder();
  }
  
  public List getDataSources()
  {
    return zzaAF;
  }
  
  int getVersionCode()
  {
    return mVersionCode;
  }
  
  public String toString()
  {
    return String.format("ReadStatsRequest", new Object[0]);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzu.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.request.ReadStatsRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */