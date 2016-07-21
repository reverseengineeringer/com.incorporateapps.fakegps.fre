package com.google.android.gms.drive.events;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.WriteAwareParcelable;

public class QueryResultEventParcelable
  extends WriteAwareParcelable
  implements DriveEvent
{
  public static final zzl CREATOR = new zzl();
  final int mVersionCode;
  final DataHolder zzahi;
  final boolean zzapQ;
  final int zzapR;
  
  QueryResultEventParcelable(int paramInt1, DataHolder paramDataHolder, boolean paramBoolean, int paramInt2)
  {
    mVersionCode = paramInt1;
    zzahi = paramDataHolder;
    zzapQ = paramBoolean;
    zzapR = paramInt2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public int getType()
  {
    return 3;
  }
  
  public void zzJ(Parcel paramParcel, int paramInt)
  {
    zzl.zza(this, paramParcel, paramInt);
  }
  
  public DataHolder zzsX()
  {
    return zzahi;
  }
  
  public boolean zzsY()
  {
    return zzapQ;
  }
  
  public int zzsZ()
  {
    return zzapR;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.events.QueryResultEventParcelable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */