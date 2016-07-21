package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.zzow;
import com.google.android.gms.internal.zzow.zza;

public class DataUpdateListenerRegistrationRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzk();
  private final PendingIntent mPendingIntent;
  private final int mVersionCode;
  private final zzow zzaAD;
  private DataType zzavT;
  private DataSource zzavU;
  
  DataUpdateListenerRegistrationRequest(int paramInt, DataSource paramDataSource, DataType paramDataType, PendingIntent paramPendingIntent, IBinder paramIBinder)
  {
    mVersionCode = paramInt;
    zzavU = paramDataSource;
    zzavT = paramDataType;
    mPendingIntent = paramPendingIntent;
    zzaAD = zzow.zza.zzbR(paramIBinder);
  }
  
  public DataUpdateListenerRegistrationRequest(DataSource paramDataSource, DataType paramDataType, PendingIntent paramPendingIntent, IBinder paramIBinder)
  {
    mVersionCode = 1;
    zzavU = paramDataSource;
    zzavT = paramDataType;
    mPendingIntent = paramPendingIntent;
    zzaAD = zzow.zza.zzbR(paramIBinder);
  }
  
  private DataUpdateListenerRegistrationRequest(DataUpdateListenerRegistrationRequest.Builder paramBuilder)
  {
    this(DataUpdateListenerRegistrationRequest.Builder.zza(paramBuilder), DataUpdateListenerRegistrationRequest.Builder.zzb(paramBuilder), DataUpdateListenerRegistrationRequest.Builder.zzc(paramBuilder), null);
  }
  
  private boolean zzb(DataUpdateListenerRegistrationRequest paramDataUpdateListenerRegistrationRequest)
  {
    return (zzw.equal(zzavU, zzavU)) && (zzw.equal(zzavT, zzavT)) && (zzw.equal(mPendingIntent, mPendingIntent));
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return (this == paramObject) || (((paramObject instanceof DataUpdateListenerRegistrationRequest)) && (zzb((DataUpdateListenerRegistrationRequest)paramObject)));
  }
  
  public IBinder getCallbackBinder()
  {
    if (zzaAD == null) {
      return null;
    }
    return zzaAD.asBinder();
  }
  
  public DataSource getDataSource()
  {
    return zzavU;
  }
  
  public DataType getDataType()
  {
    return zzavT;
  }
  
  public PendingIntent getIntent()
  {
    return mPendingIntent;
  }
  
  int getVersionCode()
  {
    return mVersionCode;
  }
  
  public int hashCode()
  {
    return zzw.hashCode(new Object[] { zzavU, zzavT, mPendingIntent });
  }
  
  public String toString()
  {
    return zzw.zzy(this).zzg("dataSource", zzavU).zzg("dataType", zzavT).zzg("pendingIntent", mPendingIntent).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzk.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.request.DataUpdateListenerRegistrationRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */