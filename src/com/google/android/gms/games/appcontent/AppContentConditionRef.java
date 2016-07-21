package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;

public final class AppContentConditionRef
  extends MultiDataBufferRef
  implements AppContentCondition
{
  AppContentConditionRef(ArrayList paramArrayList, int paramInt)
  {
    super(paramArrayList, 4, paramInt);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    return AppContentConditionEntity.zza(this, paramObject);
  }
  
  public final int hashCode()
  {
    return AppContentConditionEntity.zza(this);
  }
  
  public final String toString()
  {
    return AppContentConditionEntity.zzb(this);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ((AppContentConditionEntity)zzwj()).writeToParcel(paramParcel, paramInt);
  }
  
  public final String zzwf()
  {
    return getString("condition_default_value");
  }
  
  public final String zzwg()
  {
    return getString("condition_expected_value");
  }
  
  public final String zzwh()
  {
    return getString("condition_predicate");
  }
  
  public final Bundle zzwi()
  {
    return AppContentUtils.zzd(zzahi, zzaDN, "condition_predicate_parameters", zzaje);
  }
  
  public final AppContentCondition zzwj()
  {
    return new AppContentConditionEntity(this);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.appcontent.AppContentConditionRef
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */