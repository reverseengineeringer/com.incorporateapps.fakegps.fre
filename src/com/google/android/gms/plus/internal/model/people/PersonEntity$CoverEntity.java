package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import com.google.android.gms.plus.model.people.Person.Cover;
import com.google.android.gms.plus.model.people.Person.Cover.CoverInfo;
import com.google.android.gms.plus.model.people.Person.Cover.CoverPhoto;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class PersonEntity$CoverEntity
  extends FastSafeParcelableJsonResponse
  implements Person.Cover
{
  public static final zzc CREATOR = new zzc();
  private static final HashMap zzbeM;
  final int mVersionCode;
  final Set zzbeN;
  PersonEntity.CoverEntity.CoverInfoEntity zzbgg;
  PersonEntity.CoverEntity.CoverPhotoEntity zzbgh;
  int zzbgi;
  
  static
  {
    HashMap localHashMap = new HashMap();
    zzbeM = localHashMap;
    localHashMap.put("coverInfo", FastJsonResponse.Field.zza("coverInfo", 2, PersonEntity.CoverEntity.CoverInfoEntity.class));
    zzbeM.put("coverPhoto", FastJsonResponse.Field.zza("coverPhoto", 3, PersonEntity.CoverEntity.CoverPhotoEntity.class));
    zzbeM.put("layout", FastJsonResponse.Field.zza("layout", 4, new StringToIntConverter().zzh("banner", 0), false));
  }
  
  public PersonEntity$CoverEntity()
  {
    mVersionCode = 1;
    zzbeN = new HashSet();
  }
  
  PersonEntity$CoverEntity(Set paramSet, int paramInt1, PersonEntity.CoverEntity.CoverInfoEntity paramCoverInfoEntity, PersonEntity.CoverEntity.CoverPhotoEntity paramCoverPhotoEntity, int paramInt2)
  {
    zzbeN = paramSet;
    mVersionCode = paramInt1;
    zzbgg = paramCoverInfoEntity;
    zzbgh = paramCoverPhotoEntity;
    zzbgi = paramInt2;
  }
  
  public final int describeContents()
  {
    zzc localzzc = CREATOR;
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof CoverEntity)) {
      return false;
    }
    if (this == paramObject) {
      return true;
    }
    paramObject = (CoverEntity)paramObject;
    Iterator localIterator = zzbeM.values().iterator();
    while (localIterator.hasNext())
    {
      FastJsonResponse.Field localField = (FastJsonResponse.Field)localIterator.next();
      if (zza(localField))
      {
        if (((CoverEntity)paramObject).zza(localField))
        {
          if (!zzb(localField).equals(((CoverEntity)paramObject).zzb(localField))) {
            return false;
          }
        }
        else {
          return false;
        }
      }
      else if (((CoverEntity)paramObject).zza(localField)) {
        return false;
      }
    }
    return true;
  }
  
  public final Person.Cover.CoverInfo getCoverInfo()
  {
    return zzbgg;
  }
  
  public final Person.Cover.CoverPhoto getCoverPhoto()
  {
    return zzbgh;
  }
  
  public final int getLayout()
  {
    return zzbgi;
  }
  
  public final boolean hasCoverInfo()
  {
    return zzbeN.contains(Integer.valueOf(2));
  }
  
  public final boolean hasCoverPhoto()
  {
    return zzbeN.contains(Integer.valueOf(3));
  }
  
  public final boolean hasLayout()
  {
    return zzbeN.contains(Integer.valueOf(4));
  }
  
  public final int hashCode()
  {
    Iterator localIterator = zzbeM.values().iterator();
    int i = 0;
    if (localIterator.hasNext())
    {
      FastJsonResponse.Field localField = (FastJsonResponse.Field)localIterator.next();
      if (!zza(localField)) {
        break label68;
      }
      int j = localField.zzrs();
      i = zzb(localField).hashCode() + (i + j);
    }
    label68:
    for (;;)
    {
      break;
      return i;
    }
  }
  
  public final boolean isDataValid()
  {
    return true;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzc localzzc = CREATOR;
    zzc.zza(this, paramParcel, paramInt);
  }
  
  public final HashMap zzFl()
  {
    return zzbeM;
  }
  
  public final CoverEntity zzFr()
  {
    return this;
  }
  
  protected final boolean zza(FastJsonResponse.Field paramField)
  {
    return zzbeN.contains(Integer.valueOf(paramField.zzrs()));
  }
  
  protected final Object zzb(FastJsonResponse.Field paramField)
  {
    switch (paramField.zzrs())
    {
    default: 
      throw new IllegalStateException("Unknown safe parcelable id=" + paramField.zzrs());
    case 2: 
      return zzbgg;
    case 3: 
      return zzbgh;
    }
    return Integer.valueOf(zzbgi);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.plus.internal.model.people.PersonEntity.CoverEntity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */