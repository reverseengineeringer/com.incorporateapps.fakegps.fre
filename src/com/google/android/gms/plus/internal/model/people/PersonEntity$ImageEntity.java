package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import com.google.android.gms.plus.model.people.Person.Image;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class PersonEntity$ImageEntity
  extends FastSafeParcelableJsonResponse
  implements Person.Image
{
  public static final zzf CREATOR = new zzf();
  private static final HashMap zzbeM;
  final int mVersionCode;
  String zzF;
  final Set zzbeN;
  
  static
  {
    HashMap localHashMap = new HashMap();
    zzbeM = localHashMap;
    localHashMap.put("url", FastJsonResponse.Field.zzl("url", 2));
  }
  
  public PersonEntity$ImageEntity()
  {
    mVersionCode = 1;
    zzbeN = new HashSet();
  }
  
  public PersonEntity$ImageEntity(String paramString)
  {
    zzbeN = new HashSet();
    mVersionCode = 1;
    zzF = paramString;
    zzbeN.add(Integer.valueOf(2));
  }
  
  PersonEntity$ImageEntity(Set paramSet, int paramInt, String paramString)
  {
    zzbeN = paramSet;
    mVersionCode = paramInt;
    zzF = paramString;
  }
  
  public final int describeContents()
  {
    zzf localzzf = CREATOR;
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof ImageEntity)) {
      return false;
    }
    if (this == paramObject) {
      return true;
    }
    paramObject = (ImageEntity)paramObject;
    Iterator localIterator = zzbeM.values().iterator();
    while (localIterator.hasNext())
    {
      FastJsonResponse.Field localField = (FastJsonResponse.Field)localIterator.next();
      if (zza(localField))
      {
        if (((ImageEntity)paramObject).zza(localField))
        {
          if (!zzb(localField).equals(((ImageEntity)paramObject).zzb(localField))) {
            return false;
          }
        }
        else {
          return false;
        }
      }
      else if (((ImageEntity)paramObject).zza(localField)) {
        return false;
      }
    }
    return true;
  }
  
  public final String getUrl()
  {
    return zzF;
  }
  
  public final boolean hasUrl()
  {
    return zzbeN.contains(Integer.valueOf(2));
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
    zzf localzzf = CREATOR;
    zzf.zza(this, paramParcel, paramInt);
  }
  
  public final HashMap zzFl()
  {
    return zzbeM;
  }
  
  public final ImageEntity zzFu()
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
    }
    return zzF;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.plus.internal.model.people.PersonEntity.ImageEntity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */