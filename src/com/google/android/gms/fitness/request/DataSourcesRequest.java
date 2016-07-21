package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.internal.zzmn;
import com.google.android.gms.internal.zzoi;
import com.google.android.gms.internal.zzoi.zza;
import java.util.Arrays;
import java.util.List;

public class DataSourcesRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzh();
  private final int mVersionCode;
  private final List zzaAV;
  private final boolean zzaAW;
  private final zzoi zzaAX;
  private final List zzawe;
  
  DataSourcesRequest(int paramInt, List paramList1, List paramList2, boolean paramBoolean, IBinder paramIBinder)
  {
    mVersionCode = paramInt;
    zzawe = paramList1;
    zzaAV = paramList2;
    zzaAW = paramBoolean;
    zzaAX = zzoi.zza.zzbD(paramIBinder);
  }
  
  private DataSourcesRequest(DataSourcesRequest.Builder paramBuilder)
  {
    this(zzmn.zzb(DataSourcesRequest.Builder.zza(paramBuilder)), Arrays.asList(zzmn.zza(DataSourcesRequest.Builder.zzb(paramBuilder))), DataSourcesRequest.Builder.zzc(paramBuilder), null);
  }
  
  public DataSourcesRequest(DataSourcesRequest paramDataSourcesRequest, zzoi paramzzoi)
  {
    this(zzawe, zzaAV, zzaAW, paramzzoi);
  }
  
  public DataSourcesRequest(List paramList1, List paramList2, boolean paramBoolean, zzoi paramzzoi)
  {
    mVersionCode = 4;
    zzawe = paramList1;
    zzaAV = paramList2;
    zzaAW = paramBoolean;
    zzaAX = paramzzoi;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public IBinder getCallbackBinder()
  {
    if (zzaAX == null) {
      return null;
    }
    return zzaAX.asBinder();
  }
  
  public List getDataTypes()
  {
    return zzawe;
  }
  
  int getVersionCode()
  {
    return mVersionCode;
  }
  
  public String toString()
  {
    zzw.zza localzza = zzw.zzy(this).zzg("dataTypes", zzawe).zzg("sourceTypes", zzaAV);
    if (zzaAW) {
      localzza.zzg("includeDbOnlySources", "true");
    }
    return localzza.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzh.zza(this, paramParcel, paramInt);
  }
  
  public List zzuT()
  {
    return zzaAV;
  }
  
  public boolean zzuU()
  {
    return zzaAW;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.request.DataSourcesRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */