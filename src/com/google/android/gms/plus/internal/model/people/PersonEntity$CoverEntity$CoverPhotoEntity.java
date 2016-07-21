package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import com.google.android.gms.plus.model.people.Person.Cover.CoverPhoto;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class PersonEntity$CoverEntity$CoverPhotoEntity
  extends FastSafeParcelableJsonResponse
  implements Person.Cover.CoverPhoto
{
  public static final zze CREATOR = new zze();
  private static final HashMap zzbeM;
  final int mVersionCode;
  String zzF;
  final Set zzbeN;
  int zzoG;
  int zzoH;
  
  static
  {
    HashMap localHashMap = new HashMap();
    zzbeM = localHashMap;
    localHashMap.put("height", FastJsonResponse.Field.zzi("height", 2));
    zzbeM.put("url", FastJsonResponse.Field.zzl("url", 3));
    zzbeM.put("width", FastJsonResponse.Field.zzi("width", 4));
  }
  
  public PersonEntity$CoverEntity$CoverPhotoEntity()
  {
    mVersionCode = 1;
    zzbeN = new HashSet();
  }
  
  PersonEntity$CoverEntity$CoverPhotoEntity(Set paramSet, int paramInt1, int paramInt2, String paramString, int paramInt3)
  {
    zzbeN = paramSet;
    mVersionCode = paramInt1;
    zzoH = paramInt2;
    zzF = paramString;
    zzoG = paramInt3;
  }
  
  public final int describeContents()
  {
    zze localzze = CREATOR;
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof CoverPhotoEntity)) {
      return false;
    }
    if (this == paramObject) {
      return true;
    }
    paramObject = (CoverPhotoEntity)paramObject;
    Iterator localIterator = zzbeM.values().iterator();
    while (localIterator.hasNext())
    {
      FastJsonResponse.Field localField = (FastJsonResponse.Field)localIterator.next();
      if (zza(localField))
      {
        if (((CoverPhotoEntity)paramObject).zza(localField))
        {
          if (!zzb(localField).equals(((CoverPhotoEntity)paramObject).zzb(localField))) {
            return false;
          }
        }
        else {
          return false;
        }
      }
      else if (((CoverPhotoEntity)paramObject).zza(localField)) {
        return false;
      }
    }
    return true;
  }
  
  public final int getHeight()
  {
    return zzoH;
  }
  
  public final String getUrl()
  {
    return zzF;
  }
  
  public final int getWidth()
  {
    return zzoG;
  }
  
  public final boolean hasHeight()
  {
    return zzbeN.contains(Integer.valueOf(2));
  }
  
  public final boolean hasUrl()
  {
    return zzbeN.contains(Integer.valueOf(3));
  }
  
  public final boolean hasWidth()
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
    zze localzze = CREATOR;
    zze.zza(this, paramParcel, paramInt);
  }
  
  public final HashMap zzFl()
  {
    return zzbeM;
  }
  
  public final CoverPhotoEntity zzFt()
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
      return Integer.valueOf(zzoH);
    case 3: 
      return zzF;
    }
    return Integer.valueOf(zzoG);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.plus.internal.model.people.PersonEntity.CoverEntity.CoverPhotoEntity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */