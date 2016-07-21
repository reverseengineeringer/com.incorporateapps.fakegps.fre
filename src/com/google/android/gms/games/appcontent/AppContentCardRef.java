package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

public final class AppContentCardRef
  extends MultiDataBufferRef
  implements AppContentCard
{
  AppContentCardRef(ArrayList paramArrayList, int paramInt)
  {
    super(paramArrayList, 0, paramInt);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    return AppContentCardEntity.zza(this, paramObject);
  }
  
  public final List getActions()
  {
    return AppContentUtils.zza(zzahi, zzaDN, "card_actions", zzaje);
  }
  
  public final String getDescription()
  {
    return getString("card_description");
  }
  
  public final Bundle getExtras()
  {
    return AppContentUtils.zzd(zzahi, zzaDN, "card_data", zzaje);
  }
  
  public final String getId()
  {
    return getString("card_id");
  }
  
  public final String getTitle()
  {
    return getString("card_title");
  }
  
  public final String getType()
  {
    return getString("card_type");
  }
  
  public final int hashCode()
  {
    return AppContentCardEntity.zza(this);
  }
  
  public final String toString()
  {
    return AppContentCardEntity.zzb(this);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ((AppContentCardEntity)zzwe()).writeToParcel(paramParcel, paramInt);
  }
  
  public final List zzvP()
  {
    return AppContentUtils.zzc(zzahi, zzaDN, "card_conditions", zzaje);
  }
  
  public final String zzvQ()
  {
    return getString("card_content_description");
  }
  
  public final List zzwa()
  {
    return AppContentUtils.zzb(zzahi, zzaDN, "card_annotations", zzaje);
  }
  
  public final int zzwb()
  {
    return getInteger("card_current_steps");
  }
  
  public final String zzwc()
  {
    return getString("card_subtitle");
  }
  
  public final int zzwd()
  {
    return getInteger("card_total_steps");
  }
  
  public final AppContentCard zzwe()
  {
    return new AppContentCardEntity(this);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.appcontent.AppContentCardRef
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */