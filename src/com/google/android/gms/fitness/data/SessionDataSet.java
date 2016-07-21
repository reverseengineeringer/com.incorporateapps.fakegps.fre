package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;

public class SessionDataSet
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzr();
  final int mVersionCode;
  private final Session zzavX;
  private final DataSet zzaxn;
  
  SessionDataSet(int paramInt, Session paramSession, DataSet paramDataSet)
  {
    mVersionCode = paramInt;
    zzavX = paramSession;
    zzaxn = paramDataSet;
  }
  
  private boolean zza(SessionDataSet paramSessionDataSet)
  {
    return (zzw.equal(zzavX, zzavX)) && (zzw.equal(zzaxn, zzaxn));
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return (paramObject == this) || (((paramObject instanceof SessionDataSet)) && (zza((SessionDataSet)paramObject)));
  }
  
  public DataSet getDataSet()
  {
    return zzaxn;
  }
  
  public Session getSession()
  {
    return zzavX;
  }
  
  public int hashCode()
  {
    return zzw.hashCode(new Object[] { zzavX, zzaxn });
  }
  
  public String toString()
  {
    return zzw.zzy(this).zzg("session", zzavX).zzg("dataSet", zzaxn).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzr.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.data.SessionDataSet
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */