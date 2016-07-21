package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.zzog;
import com.google.android.gms.internal.zzog.zza;

public class DailyTotalRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzc();
  private final int mVersionCode;
  private final zzog zzaAE;
  private DataType zzavT;
  
  DailyTotalRequest(int paramInt, IBinder paramIBinder, DataType paramDataType)
  {
    mVersionCode = paramInt;
    zzaAE = zzog.zza.zzbB(paramIBinder);
    zzavT = paramDataType;
  }
  
  public DailyTotalRequest(zzog paramzzog, DataType paramDataType)
  {
    mVersionCode = 2;
    zzaAE = paramzzog;
    zzavT = paramDataType;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public IBinder getCallbackBinder()
  {
    return zzaAE.asBinder();
  }
  
  public DataType getDataType()
  {
    return zzavT;
  }
  
  int getVersionCode()
  {
    return mVersionCode;
  }
  
  public String toString()
  {
    return String.format("DailyTotalRequest{%s}", new Object[] { zzavT.zzuo() });
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzc.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.request.DailyTotalRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */