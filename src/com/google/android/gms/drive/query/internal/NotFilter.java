package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.drive.query.Filter;

public class NotFilter
  extends AbstractFilter
{
  public static final Parcelable.Creator CREATOR = new zzm();
  final int mVersionCode;
  final FilterHolder zzauw;
  
  NotFilter(int paramInt, FilterHolder paramFilterHolder)
  {
    mVersionCode = paramInt;
    zzauw = paramFilterHolder;
  }
  
  public NotFilter(Filter paramFilter)
  {
    this(1, new FilterHolder(paramFilter));
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzm.zza(this, paramParcel, paramInt);
  }
  
  public Object zza(zzf paramzzf)
  {
    return paramzzf.zzB(zzauw.getFilter().zza(paramzzf));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.query.internal.NotFilter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */