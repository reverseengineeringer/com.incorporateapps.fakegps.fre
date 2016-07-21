package com.google.android.gms.games.appcontent;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;

public final class AppContentAnnotationRef
  extends MultiDataBufferRef
  implements AppContentAnnotation
{
  AppContentAnnotationRef(ArrayList paramArrayList, int paramInt)
  {
    super(paramArrayList, 2, paramInt);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    return AppContentAnnotationEntity.zza(this, paramObject);
  }
  
  public final String getDescription()
  {
    return getString("annotation_description");
  }
  
  public final String getId()
  {
    return getString("annotation_id");
  }
  
  public final String getTitle()
  {
    return getString("annotation_title");
  }
  
  public final int hashCode()
  {
    return AppContentAnnotationEntity.zza(this);
  }
  
  public final String toString()
  {
    return AppContentAnnotationEntity.zzb(this);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ((AppContentAnnotationEntity)zzvZ()).writeToParcel(paramParcel, paramInt);
  }
  
  public final String zzvT()
  {
    return getString("annotation_image_default_id");
  }
  
  public final int zzvU()
  {
    return getInteger("annotation_image_height");
  }
  
  public final Uri zzvV()
  {
    return zzcA("annotation_image_uri");
  }
  
  public final Bundle zzvW()
  {
    return AppContentUtils.zzd(zzahi, zzaDN, "annotation_modifiers", zzaje);
  }
  
  public final int zzvX()
  {
    return getInteger("annotation_image_width");
  }
  
  public final String zzvY()
  {
    return getString("annotation_layout_slot");
  }
  
  public final AppContentAnnotation zzvZ()
  {
    return new AppContentAnnotationEntity(this);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.appcontent.AppContentAnnotationRef
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */