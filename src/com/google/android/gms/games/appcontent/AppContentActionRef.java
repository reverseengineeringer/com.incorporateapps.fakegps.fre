package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

public final class AppContentActionRef
  extends MultiDataBufferRef
  implements AppContentAction
{
  AppContentActionRef(ArrayList paramArrayList, int paramInt)
  {
    super(paramArrayList, 1, paramInt);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    return AppContentActionEntity.zza(this, paramObject);
  }
  
  public final Bundle getExtras()
  {
    return AppContentUtils.zzd(zzahi, zzaDN, "action_data", zzaje);
  }
  
  public final String getId()
  {
    return getString("action_id");
  }
  
  public final String getType()
  {
    return getString("action_type");
  }
  
  public final int hashCode()
  {
    return AppContentActionEntity.zza(this);
  }
  
  public final String toString()
  {
    return AppContentActionEntity.zzb(this);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ((AppContentActionEntity)zzvS()).writeToParcel(paramParcel, paramInt);
  }
  
  public final AppContentAnnotation zzvO()
  {
    ArrayList localArrayList = AppContentUtils.zzb(zzahi, zzaDN, "action_annotation", zzaje);
    if (localArrayList.size() == 1) {
      return (AppContentAnnotation)localArrayList.get(0);
    }
    return null;
  }
  
  public final List zzvP()
  {
    return AppContentUtils.zzc(zzahi, zzaDN, "action_conditions", zzaje);
  }
  
  public final String zzvQ()
  {
    return getString("action_content_description");
  }
  
  public final String zzvR()
  {
    return getString("overflow_text");
  }
  
  public final AppContentAction zzvS()
  {
    return new AppContentActionEntity(this);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.appcontent.AppContentActionRef
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */