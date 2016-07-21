package com.google.android.gms.drive.query.internal;

import android.os.Parcel;

public class OwnedByMeFilter
  extends AbstractFilter
{
  public static final zzo CREATOR = new zzo();
  final int mVersionCode;
  
  public OwnedByMeFilter()
  {
    this(1);
  }
  
  OwnedByMeFilter(int paramInt)
  {
    mVersionCode = paramInt;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzo.zza(this, paramParcel, paramInt);
  }
  
  public Object zza(zzf paramzzf)
  {
    return paramzzf.zztP();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.query.internal.OwnedByMeFilter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */