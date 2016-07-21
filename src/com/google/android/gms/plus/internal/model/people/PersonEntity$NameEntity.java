package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import com.google.android.gms.plus.model.people.Person.Name;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class PersonEntity$NameEntity
  extends FastSafeParcelableJsonResponse
  implements Person.Name
{
  public static final zzg CREATOR = new zzg();
  private static final HashMap zzbeM;
  final int mVersionCode;
  final Set zzbeN;
  String zzbfl;
  String zzbfo;
  String zzbgl;
  String zzbgm;
  String zzbgn;
  String zzbgo;
  
  static
  {
    HashMap localHashMap = new HashMap();
    zzbeM = localHashMap;
    localHashMap.put("familyName", FastJsonResponse.Field.zzl("familyName", 2));
    zzbeM.put("formatted", FastJsonResponse.Field.zzl("formatted", 3));
    zzbeM.put("givenName", FastJsonResponse.Field.zzl("givenName", 4));
    zzbeM.put("honorificPrefix", FastJsonResponse.Field.zzl("honorificPrefix", 5));
    zzbeM.put("honorificSuffix", FastJsonResponse.Field.zzl("honorificSuffix", 6));
    zzbeM.put("middleName", FastJsonResponse.Field.zzl("middleName", 7));
  }
  
  public PersonEntity$NameEntity()
  {
    mVersionCode = 1;
    zzbeN = new HashSet();
  }
  
  PersonEntity$NameEntity(Set paramSet, int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    zzbeN = paramSet;
    mVersionCode = paramInt;
    zzbfl = paramString1;
    zzbgl = paramString2;
    zzbfo = paramString3;
    zzbgm = paramString4;
    zzbgn = paramString5;
    zzbgo = paramString6;
  }
  
  public final int describeContents()
  {
    zzg localzzg = CREATOR;
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof NameEntity)) {
      return false;
    }
    if (this == paramObject) {
      return true;
    }
    paramObject = (NameEntity)paramObject;
    Iterator localIterator = zzbeM.values().iterator();
    while (localIterator.hasNext())
    {
      FastJsonResponse.Field localField = (FastJsonResponse.Field)localIterator.next();
      if (zza(localField))
      {
        if (((NameEntity)paramObject).zza(localField))
        {
          if (!zzb(localField).equals(((NameEntity)paramObject).zzb(localField))) {
            return false;
          }
        }
        else {
          return false;
        }
      }
      else if (((NameEntity)paramObject).zza(localField)) {
        return false;
      }
    }
    return true;
  }
  
  public final String getFamilyName()
  {
    return zzbfl;
  }
  
  public final String getFormatted()
  {
    return zzbgl;
  }
  
  public final String getGivenName()
  {
    return zzbfo;
  }
  
  public final String getHonorificPrefix()
  {
    return zzbgm;
  }
  
  public final String getHonorificSuffix()
  {
    return zzbgn;
  }
  
  public final String getMiddleName()
  {
    return zzbgo;
  }
  
  public final boolean hasFamilyName()
  {
    return zzbeN.contains(Integer.valueOf(2));
  }
  
  public final boolean hasFormatted()
  {
    return zzbeN.contains(Integer.valueOf(3));
  }
  
  public final boolean hasGivenName()
  {
    return zzbeN.contains(Integer.valueOf(4));
  }
  
  public final boolean hasHonorificPrefix()
  {
    return zzbeN.contains(Integer.valueOf(5));
  }
  
  public final boolean hasHonorificSuffix()
  {
    return zzbeN.contains(Integer.valueOf(6));
  }
  
  public final boolean hasMiddleName()
  {
    return zzbeN.contains(Integer.valueOf(7));
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
    zzg localzzg = CREATOR;
    zzg.zza(this, paramParcel, paramInt);
  }
  
  public final HashMap zzFl()
  {
    return zzbeM;
  }
  
  public final NameEntity zzFv()
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
      return zzbfl;
    case 3: 
      return zzbgl;
    case 4: 
      return zzbfo;
    case 5: 
      return zzbgm;
    case 6: 
      return zzbgn;
    }
    return zzbgo;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.plus.internal.model.people.PersonEntity.NameEntity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */