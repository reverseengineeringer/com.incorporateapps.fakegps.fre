package com.google.android.gms.drive.query.internal;

import android.os.Parcel;

public class MatchAllFilter
  extends AbstractFilter
{
  public static final zzl CREATOR = new zzl();
  final int mVersionCode;
  
  public MatchAllFilter()
  {
    this(1);
  }
  
  MatchAllFilter(int paramInt)
  {
    mVersionCode = paramInt;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzl.zza(this, paramParcel, paramInt);
  }
  
  public Object zza(zzf paramzzf)
  {
    return paramzzf.zztQ();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.query.internal.MatchAllFilter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */