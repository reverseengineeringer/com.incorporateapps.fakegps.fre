package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.internal.zzow;
import com.google.android.gms.internal.zzow.zza;

public class DataInsertRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zze();
  private final int mVersionCode;
  private final zzow zzaAD;
  private final boolean zzaAJ;
  private final DataSet zzaxn;
  
  DataInsertRequest(int paramInt, DataSet paramDataSet, IBinder paramIBinder, boolean paramBoolean)
  {
    mVersionCode = paramInt;
    zzaxn = paramDataSet;
    zzaAD = zzow.zza.zzbR(paramIBinder);
    zzaAJ = paramBoolean;
  }
  
  public DataInsertRequest(DataSet paramDataSet, zzow paramzzow, boolean paramBoolean)
  {
    mVersionCode = 4;
    zzaxn = paramDataSet;
    zzaAD = paramzzow;
    zzaAJ = paramBoolean;
  }
  
  private boolean zzc(DataInsertRequest paramDataInsertRequest)
  {
    return zzw.equal(zzaxn, zzaxn);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return (paramObject == this) || (((paramObject instanceof DataInsertRequest)) && (zzc((DataInsertRequest)paramObject)));
  }
  
  public IBinder getCallbackBinder()
  {
    if (zzaAD == null) {
      return null;
    }
    return zzaAD.asBinder();
  }
  
  public DataSet getDataSet()
  {
    return zzaxn;
  }
  
  int getVersionCode()
  {
    return mVersionCode;
  }
  
  public int hashCode()
  {
    return zzw.hashCode(new Object[] { zzaxn });
  }
  
  public String toString()
  {
    return zzw.zzy(this).zzg("dataSet", zzaxn).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zze.zza(this, paramParcel, paramInt);
  }
  
  public boolean zzuO()
  {
    return zzaAJ;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.request.DataInsertRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */