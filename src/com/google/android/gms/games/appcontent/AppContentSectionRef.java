package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;

public final class AppContentSectionRef
  extends MultiDataBufferRef
  implements AppContentSection
{
  private final int zzaDQ;
  
  AppContentSectionRef(ArrayList paramArrayList, int paramInt1, int paramInt2)
  {
    super(paramArrayList, 0, paramInt1);
    zzaDQ = paramInt2;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    return AppContentSectionEntity.zza(this, paramObject);
  }
  
  public final Bundle getExtras()
  {
    return AppContentUtils.zzd(zzahi, zzaDN, "section_data", zzaje);
  }
  
  public final String getId()
  {
    return getString("section_id");
  }
  
  public final String getTitle()
  {
    return getString("section_title");
  }
  
  public final String getType()
  {
    return getString("section_type");
  }
  
  public final int hashCode()
  {
    return AppContentSectionEntity.zza(this);
  }
  
  public final String toString()
  {
    return AppContentSectionEntity.zzb(this);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ((AppContentSectionEntity)zzwm()).writeToParcel(paramParcel, paramInt);
  }
  
  public final String zzvQ()
  {
    return getString("section_content_description");
  }
  
  public final String zzwc()
  {
    return getString("section_subtitle");
  }
  
  public final String zzwl()
  {
    return getString("section_card_type");
  }
  
  public final AppContentSection zzwm()
  {
    return new AppContentSectionEntity(this);
  }
  
  public final ArrayList zzwn()
  {
    return AppContentUtils.zza(zzahi, zzaDN, "section_actions", zzaje);
  }
  
  public final ArrayList zzwo()
  {
    return AppContentUtils.zzb(zzahi, zzaDN, "section_annotations", zzaje);
  }
  
  public final ArrayList zzwp()
  {
    ArrayList localArrayList = new ArrayList(zzaDQ);
    int i = 0;
    while (i < zzaDQ)
    {
      localArrayList.add(new AppContentCardRef(zzaDN, zzaje + i));
      i += 1;
    }
    return localArrayList;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.appcontent.AppContentSectionRef
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */