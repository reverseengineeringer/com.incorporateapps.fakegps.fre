package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.internal.zzoj;
import com.google.android.gms.internal.zzoj.zza;

public class DataTypeReadRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzj();
  private final String mName;
  private final int mVersionCode;
  private final zzoj zzaBa;
  
  DataTypeReadRequest(int paramInt, String paramString, IBinder paramIBinder)
  {
    mVersionCode = paramInt;
    mName = paramString;
    zzaBa = zzoj.zza.zzbE(paramIBinder);
  }
  
  public DataTypeReadRequest(String paramString, zzoj paramzzoj)
  {
    mVersionCode = 3;
    mName = paramString;
    zzaBa = paramzzoj;
  }
  
  private boolean zzb(DataTypeReadRequest paramDataTypeReadRequest)
  {
    return zzw.equal(mName, mName);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return (paramObject == this) || (((paramObject instanceof DataTypeReadRequest)) && (zzb((DataTypeReadRequest)paramObject)));
  }
  
  public IBinder getCallbackBinder()
  {
    return zzaBa.asBinder();
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
    return zzw.hashCode(new Object[] { mName });
  }
  
  public String toString()
  {
    return zzw.zzy(this).zzg("name", mName).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzj.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.request.DataTypeReadRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */