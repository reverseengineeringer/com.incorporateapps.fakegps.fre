package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import com.google.android.gms.plus.model.people.Person.Urls;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class PersonEntity$UrlsEntity
  extends FastSafeParcelableJsonResponse
  implements Person.Urls
{
  public static final zzj CREATOR = new zzj();
  private static final HashMap zzbeM;
  String mValue;
  final int mVersionCode;
  String zzaUO;
  int zzabB;
  final Set zzbeN;
  private final int zzbgs = 4;
  
  static
  {
    HashMap localHashMap = new HashMap();
    zzbeM = localHashMap;
    localHashMap.put("label", FastJsonResponse.Field.zzl("label", 5));
    zzbeM.put("type", FastJsonResponse.Field.zza("type", 6, new StringToIntConverter().zzh("home", 0).zzh("work", 1).zzh("blog", 2).zzh("profile", 3).zzh("other", 4).zzh("otherProfile", 5).zzh("contributor", 6).zzh("website", 7), false));
    zzbeM.put("value", FastJsonResponse.Field.zzl("value", 4));
  }
  
  public PersonEntity$UrlsEntity()
  {
    mVersionCode = 1;
    zzbeN = new HashSet();
  }
  
  PersonEntity$UrlsEntity(Set paramSet, int paramInt1, String paramString1, int paramInt2, String paramString2, int paramInt3)
  {
    zzbeN = paramSet;
    mVersionCode = paramInt1;
    zzaUO = paramString1;
    zzabB = paramInt2;
    mValue = paramString2;
  }
  
  public final int describeContents()
  {
    zzj localzzj = CREATOR;
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof UrlsEntity)) {
      return false;
    }
    if (this == paramObject) {
      return true;
    }
    paramObject = (UrlsEntity)paramObject;
    Iterator localIterator = zzbeM.values().iterator();
    while (localIterator.hasNext())
    {
      FastJsonResponse.Field localField = (FastJsonResponse.Field)localIterator.next();
      if (zza(localField))
      {
        if (((UrlsEntity)paramObject).zza(localField))
        {
          if (!zzb(localField).equals(((UrlsEntity)paramObject).zzb(localField))) {
            return false;
          }
        }
        else {
          return false;
        }
      }
      else if (((UrlsEntity)paramObject).zza(localField)) {
        return false;
      }
    }
    return true;
  }
  
  public final String getLabel()
  {
    return zzaUO;
  }
  
  public final int getType()
  {
    return zzabB;
  }
  
  public final String getValue()
  {
    return mValue;
  }
  
  public final boolean hasLabel()
  {
    return zzbeN.contains(Integer.valueOf(5));
  }
  
  public final boolean hasType()
  {
    return zzbeN.contains(Integer.valueOf(6));
  }
  
  public final boolean hasValue()
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
    zzj localzzj = CREATOR;
    zzj.zza(this, paramParcel, paramInt);
  }
  
  public final HashMap zzFl()
  {
    return zzbeM;
  }
  
  public final int zzFy()
  {
    return 4;
  }
  
  public final UrlsEntity zzFz()
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
    case 5: 
      return zzaUO;
    case 6: 
      return Integer.valueOf(zzabB);
    }
    return mValue;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.plus.internal.model.people.PersonEntity.UrlsEntity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */