package com.google.android.gms.games.appcontent;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;

public final class AppContentTupleRef
  extends zzc
  implements AppContentTuple
{
  AppContentTupleRef(DataHolder paramDataHolder, int paramInt)
  {
    super(paramDataHolder, paramInt);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    return AppContentTupleEntity.zza(this, paramObject);
  }
  
  public final String getName()
  {
    return getString("tuple_name");
  }
  
  public final String getValue()
  {
    return getString("tuple_value");
  }
  
  public final int hashCode()
  {
    return AppContentTupleEntity.zza(this);
  }
  
  public final String toString()
  {
    return AppContentTupleEntity.zzb(this);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ((AppContentTupleEntity)zzwq()).writeToParcel(paramParcel, paramInt);
  }
  
  public final AppContentTuple zzwq()
  {
    return new AppContentTupleEntity(this);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.appcontent.AppContentTupleRef
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */