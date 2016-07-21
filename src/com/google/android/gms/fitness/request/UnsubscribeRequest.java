package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.zzow;
import com.google.android.gms.internal.zzow.zza;

public class UnsubscribeRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzah();
  private final int mVersionCode;
  private final zzow zzaAD;
  private final DataType zzavT;
  private final DataSource zzavU;
  
  UnsubscribeRequest(int paramInt, DataType paramDataType, DataSource paramDataSource, IBinder paramIBinder)
  {
    mVersionCode = paramInt;
    zzavT = paramDataType;
    zzavU = paramDataSource;
    zzaAD = zzow.zza.zzbR(paramIBinder);
  }
  
  public UnsubscribeRequest(DataType paramDataType, DataSource paramDataSource, zzow paramzzow)
  {
    mVersionCode = 3;
    zzavT = paramDataType;
    zzavU = paramDataSource;
    zzaAD = paramzzow;
  }
  
  private boolean zzb(UnsubscribeRequest paramUnsubscribeRequest)
  {
    return (zzw.equal(zzavU, zzavU)) && (zzw.equal(zzavT, zzavT));
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return (this == paramObject) || (((paramObject instanceof UnsubscribeRequest)) && (zzb((UnsubscribeRequest)paramObject)));
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
  
  int getVersionCode()
  {
    return mVersionCode;
  }
  
  public int hashCode()
  {
    return zzw.hashCode(new Object[] { zzavU, zzavT });
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzah.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.request.UnsubscribeRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */